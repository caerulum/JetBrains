import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reeses = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    val a = reeses >= 10 && reeses <= 20 && weekend == false
    val b = reeses >= 15 && reeses <= 25 && weekend == true
    println(a || b)
}