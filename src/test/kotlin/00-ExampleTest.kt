import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class `00-ExampleTest` {

    /**
     * Assert equality
     */
    @Test
    fun testAdd() {
        assertThat(42).isEqualTo(Integer.sum(19, 23))
    }

    /**
     * Assert that an exception is thrown
     */
    @Test
    fun testDivide() {
        assertThrows(ArithmeticException::class.java) { Integer.divideUnsigned(42, 0) }
    }
}
