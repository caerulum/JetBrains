import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val int1 = scanner.nextInt()
    val int2 = scanner.nextInt()
    val int3 = scanner.nextInt()
    val int4 = scanner.nextInt()
    val int5 = scanner.nextInt()
    println(int5 in int1..int2 || int5 in int3..int4)
}