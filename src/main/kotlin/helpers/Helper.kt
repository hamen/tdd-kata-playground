package helpers

fun leapYear(year: Int): Boolean {
    return when {
        year < 1580 -> throw IllegalArgumentException("First valid year should be 1580!")
        year % 100 == 0 -> {
            (year % 400 == 0)
        }
        else -> (year % 4 == 0)
    }
}

fun addInt(numbers: String): Int? {
    return if (numbers.isBlank()) 0
    else {
        return numbers.split(Regex("(,+)|(;+)"))
            .mapNotNull { it.toIntOrNull() }
            .sum()
    }
}
