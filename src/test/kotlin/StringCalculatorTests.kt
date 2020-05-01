import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import org.junit.jupiter.api.Test


class StringCalculatorTests {

    @Test
    fun x(){
        val input: String = ""
        val result = add(input)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun ifEmptyStringReturnsZero(){
        val input: String = "   "
        val result = add(input)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun ifInputOneResultOne(){
        val input: String = "1"
        val result = add(input)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun pippo(){
        val input: String = "2"
        val result = add(input)
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun ifInputNotValidString(){
        val input = "cavallo"
        val result = add(input)
        assertThat(result).isNull()
    }

    @Test
    fun pluto(){
        val input = "1,2"
        val result = add(input)
        assertThat(result).isEqualTo(3)
    }
}