import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var sum = 0
    for (i in a..b) { sum += i }
    println(sum)
}