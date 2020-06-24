import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var min = Int.MAX_VALUE
    for (i in 1..n) {
        val num = scanner.nextInt()
        if (num < min) min = num
    }
    println(min)
}