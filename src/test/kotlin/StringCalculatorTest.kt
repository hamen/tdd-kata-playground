import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import helpers.addInt
import org.junit.jupiter.api.Test

class StringCalculatorTest {

    @Test
    fun `Empty input returns 0`() {
        val input = ""
        val output = addInt(input)
        assertThat(output).isEqualTo(0)
    }

    @Test
    fun `String returns null`() {
        val input = "Horse"
        val output = addInt(input)
        assertThat(output).isNull()
    }

    @Test
    fun `String of number returns Int`() {
        val input = "22"
        val output = addInt(input)
        assertThat(output).isEqualTo(22)
    }
}
