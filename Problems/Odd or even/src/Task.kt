import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println(if (scanner.nextInt() % 2 == 0) "EVEN" else "ODD")
}