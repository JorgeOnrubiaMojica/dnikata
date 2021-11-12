class DNI(private val value: String) {

    init {

        assertHasValidFormat()

        assertLetterIsNotIorO()

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