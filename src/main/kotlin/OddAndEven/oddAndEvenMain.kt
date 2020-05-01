package OddAndEven

fun oddOrEven(list: List<Int>): String {
    return when {
        list.isEmpty() || list.sum() % 2 == 0 ->"pari"
        else -> "dispari"
    }
}