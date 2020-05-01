import OddAndEven.oddOrEven
import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotEqualTo
import org.junit.Test


class OddAndEvenTest {

    @Test
    fun `if input is an empty list, the return is "pari"`(){
        val list = listOf<Int>()
        val expected: String = "pari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `if input is a list containing only zero, the return is "pari"`(){
        val list = listOf(0)
        val expected: String = "pari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `first test`(){
        val list = listOf(1)
        val expected : String = "dispari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `second test`(){
        val list = listOf(4)
        val expected : String = "dispari"
        val actual = oddOrEven(list)
        assertThat(actual).isNotEqualTo(expected)
    }

    @Test
    fun `third test`(){
        val list = listOf(4)
        val expected : String = "pari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `fourth test`(){
        val list = listOf(3)
        val expected : String = "dispari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `fifthTest`(){
        val list = listOf(3,3)
        val expected : String = "pari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `sixth test`(){
        val list = listOf(3,-3)
        val expected : String = "pari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `seventh test`(){
        val list = listOf(3,-5)
        val expected : String = "pari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `eighth test`(){
        val list = listOf(3,-5,9)
        val expected : String = "dispari"
        val actual = oddOrEven(list)
        assertThat(actual).isEqualTo(expected)
    }

}