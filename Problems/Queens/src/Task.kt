import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    println(if (abs(x1 - x2) == abs(y1 - y2) || x1 == x2 || y1 == y2) "YES" else "NO")
}