fun add(numbers: String): Int? {
    return if (numbers.isBlank()) 0
    else {
        try {
            numbers
                .split(",")
                .map { it.toInt() }
                .sum()
        } catch (e: NumberFormatException) {
            null
        }
    }
}