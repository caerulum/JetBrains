import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
//    var result = 0
//    for (i in a..b) {
//        if (i % n == 0) result++
//    }
//    println(result)
    var result = b / n - a / n
    if (a % n == 0) result++
    println(result)
}