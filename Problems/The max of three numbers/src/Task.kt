import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    if (a > b && a > c) println(a)
    if (c > b && c > a) println(c)
    if (b > a && b > c) println(b)
}