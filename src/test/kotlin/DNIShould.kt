import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

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

}