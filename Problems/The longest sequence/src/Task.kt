import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sequence = 1
    var aux = 0
    var b: Int
    var a = scanner.nextInt()
    for (i in 1 until n) {
        b = scanner.nextInt()
        if (b >= a) {
            sequence++
        } else {
            if (sequence > aux) aux = sequence
            sequence = 1
        }
        a = b
    }
    println(if (sequence > aux)sequence else aux)
}