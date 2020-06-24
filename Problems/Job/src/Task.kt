import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val age = scanner.nextInt()
    println(age in 18..59)
}