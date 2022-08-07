import kotlin.random.Random

fun ddskMini() {
    val q = ArrayDeque<Int?>()
    while (true) {
        val s = Random.nextInt(2); print(arrayListOf("ドド", "スコ")[s]); q.add(s)
        if (q.size < 12) continue
        if (q.size == 13) q.removeFirst()
        if (q == Array(12) { if (it % 4 == 0) 0 else 1 }.toList()) {
            println("ラブ注入♡︎"); break
        }
    }
}
