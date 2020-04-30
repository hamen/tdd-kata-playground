import assertk.assertThat
import assertk.assertions.isEqualTo
import helpers.leapYear
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class LeapYearTest {
    @Test
    fun `2015 is false`() {
        val isLeapYear: Boolean = leapYear(year = 2015)
        assertThat(isLeapYear).isEqualTo(false)
    }

    @Test
    fun `1000 is invalid`() {
        assertThrows(IllegalArgumentException::class.java) { leapYear(1000) }
    }

    @Test
    fun `1580 is leap year`() {
        val isLeapYear: Boolean = leapYear(year = 1580)
        assertThat(isLeapYear).isEqualTo(true)
    }

    @Test
    fun `2020 is leap year`() {
        val isLeapYear: Boolean = leapYear(year = 2020)
        assertThat(isLeapYear).isEqualTo(true)
    }

    @Test
    fun `1800 is not leap year`() {
        val isLeapYear: Boolean = leapYear(year = 1800)
        assertThat(isLeapYear).isEqualTo(false)
    }


    @Test
    fun `2000 is leap year`() {
        val isLeapYear: Boolean = leapYear(year = 2000)
        assertThat(isLeapYear).isEqualTo(true)
    }

    @Test
    fun `1984 is leap year`() {
        val isLeapYear: Boolean = leapYear(year = 1984)
        assertThat(isLeapYear).isEqualTo(true)
    }

    @Test
    fun `2021 is leap year`() {
        val isLeapYear: Boolean = leapYear(year = 2021)
        assertThat(isLeapYear).isEqualTo(false)
    }

}
