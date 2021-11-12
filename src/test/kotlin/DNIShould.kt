import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertIs

internal class DNIShould {

    @Test
    fun `fail when doesnt have the valid length`() {
        assertFailsWith<IllegalArgumentException> {
            DNI("55555555555555")
        }
    }

    @Test
    fun `fail when the last character is not a letter`(){
        assertFailsWith<IllegalArgumentException> {
            DNI("555555555")
        }
    }

    @Test
    fun `fail when last letter is I or O`(){
        assertFailsWith<IllegalArgumentException>{
            DNI("55555555I")
        }
    }

    @Test
    fun `fail when the first 8 characters are not a digit`(){
        assertFailsWith<IllegalArgumentException> {
            DNI("A4444444T")
        }
    }

    @Test
    fun `fail when the sum doesn't match the letter`(){
        assertFailsWith<IllegalArgumentException>{
            DNI("64620834N")
        }
    }

    @Test
    fun `create a DNI`(){
        assertIs<DNI>(DNI("64620835N"))
    }

}