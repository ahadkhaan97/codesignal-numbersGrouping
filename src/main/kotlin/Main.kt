fun main() {
    print(
        solution(
            mutableListOf(
                10000, 1
            )
        )
    )
}

fun solution(a: MutableList<Int>): Int {
    val list = IntArray(100000) { 0 }
    for (i in 0 until a.size) {
        val mod = (a[i] - 1) / 10000
        if (list[mod] == 0) {
            list[mod] += 2
        } else {
            list[mod]++
        }
    }
    return list.sum()
}
