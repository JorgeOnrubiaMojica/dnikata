class DNI(private val value: String) {

    init {

        assertHasValidFormat()
        assertLetterIsNotIorO()

        assertLastLetterIsCorrect()


    }

    private fun assertLastLetterIsCorrect() {

        val remainderToLetter: Map<Int, Char> = mapOf(
            0 to 'T',
            1 to 'R',
            2 to 'W',
            3 to 'A',
            4 to 'G',
            5 to 'M',
            6 to 'Y',
            7 to 'F',
            8 to 'P',
            9 to 'D',
            10 to 'X',
            11 to 'B',
            12 to 'N',
            13 to 'J',
            14 to 'Z',
            15 to 'S',
            16 to 'Q',
            17 to 'V',
            18 to 'H',
            19 to 'L',
            20 to 'C',
            21 to 'K',
            22 to 'E'
        )

        val mod = value.subSequence(0, value.length-1).toString().toInt() % 23
        if (value.last() != remainderToLetter[mod]) {
            throw IllegalArgumentException()
        }
    }

    private fun assertHasValidFormat() {
        val pattern = Regex("^[0-9]{8}[A-Z]$")

        if (!pattern.containsMatchIn(value)) {
            throw IllegalArgumentException()
        }
    }

    private fun assertLetterIsNotIorO() {
        if (value.last() == 'I' || value.last() == 'O') {
            throw IllegalArgumentException()
        }
    }

}