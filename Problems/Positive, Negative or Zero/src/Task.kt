import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    println(if (num == 0) "zero" else if (num < 0) "negative" else "positive")
}