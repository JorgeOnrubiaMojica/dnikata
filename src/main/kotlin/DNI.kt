class DNI(private val value: String, private val VALID_LENGTH: Int = 9) {

    init {

        val pattern = Regex("^[0-9]{8}[A-Z]$")

        if (!pattern.containsMatchIn(value)){
            throw IllegalArgumentException()
        }

        assertLetterIsNotIorO()

    }

    private fun assertFirst8CharactersAreADigit() {
        val first8Char: CharSequence = value.subSequence(0, value.length - 1)
        if (first8Char.any { ch -> !ch.isDigit() }) {
            throw IllegalArgumentException()
        }
    }

    private fun assertLetterIsNotIorO() {
        if (value.last() == 'I' || value.last() == 'O') {
            throw IllegalArgumentException()
        }
    }

    private fun assertLastCharacterIsLetter() {
        if (!value.last().isLetter()) {
            throw IllegalArgumentException()
        }
    }

    private fun assertValidLength() {
        if (value.length != VALID_LENGTH) {
            throw IllegalArgumentException()
        }
    }

}