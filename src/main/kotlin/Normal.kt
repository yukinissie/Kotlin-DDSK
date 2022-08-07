import kotlin.random.Random

fun ddskNormal() {
    // DDSK
    val ddsk = arrayListOf("ドド", "スコ")
    // Queue（FIFO）を使う
    val queue = ArrayDeque<Int?>()
    // 求めているパターン（0がドドで1がスコ）
    val expectPattern = arrayListOf(
        0, 1, 1, 1,
        0, 1, 1, 1,
        0, 1, 1, 1
    )

    while (true) {
        // 0か1をランダムに選ぶ
        val select = Random.nextInt(2)
        // ドドかスコを出力
        print(ddsk[select])
        // 出力した文字をキューに入れる
        queue.add(select)
        // キューが12個以下なら何もしない
        if (queue.size < 12) {
            continue
        }
        // キューが13個以上なら最も前に入れた文字を出す
        if (queue.size == 13) {
            queue.removeFirst()
        }
        // キューが求めているパターンになったらラブ注入♡を出力して終了
        if (queue == expectPattern) {
            println("ラブ注入♡︎")
            break
        }
    }
}