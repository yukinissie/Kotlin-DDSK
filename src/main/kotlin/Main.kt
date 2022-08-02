import kotlin.random.Random

fun main() {
    val ddsk = arrayListOf("ドド", "スコ")
    val queue = ArrayDeque(arrayListOf<Int?>(null))
    val expectPattern = arrayListOf(
        0, 1, 1, 1,
        0, 1, 1, 1,
        0, 1, 1, 1
    )

    while (true) {
        val select = Random.nextInt(2)

        print(ddsk[select])

        queue.add(select)

        if (queue.size == 13) {
            queue.removeFirst()
        }

        if (queue.size < 12) {
            continue
        }

        if (queue == expectPattern) {
            println("ラブ注入♡︎")
            break
        }
    }
}
