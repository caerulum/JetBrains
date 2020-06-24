import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val side1 = scanner.nextInt()
    val side2 = scanner.nextInt()
    val side3 = scanner.nextInt()
    println(if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) "YES" else "NO")
}