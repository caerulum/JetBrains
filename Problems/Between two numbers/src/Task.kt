import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val int1 = scanner.nextInt()
    val int2 = scanner.nextInt()
    val int3 = scanner.nextInt()
    println(int1 in int2..int3)
}