package helpers

fun leapYear(year: Int): Boolean {
    if (year < 1580) throw IllegalArgumentException("First valid year should be 1580!")
    else if (year % 100 == 0) {
        return (year % 400 == 0)
    } else return (year % 4 == 0)
}

fun addInt(numbers: String): Int? {
    return if (numbers.isBlank()) 0
    else {
        numbers.toIntOrNull()
        /*numbers.split(",")
            .mapNotNull { it.toIntOrNull() }
            .sum()*/
    }
}
