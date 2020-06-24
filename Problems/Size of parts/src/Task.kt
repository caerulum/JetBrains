import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(n) {
        val part = scanner.nextInt()
        if (part == 1) larger++
        if (part == -1) smaller++
        if (part == 0) perfect++
    }
    println("$perfect $larger $smaller")
}