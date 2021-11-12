class DNI(private val value: String, private val VALID_LENGTH: Int = 9) {

    init {
        assertValidLength()
        assertLastCharacterIsLetter()
        assertLetterIsNotIorO()

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