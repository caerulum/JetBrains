import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var positive = 0
    repeat(n) {
        val next = scanner.nextInt()
        if (next > 0) positive++
    }
    println(positive)
}