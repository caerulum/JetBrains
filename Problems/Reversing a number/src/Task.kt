import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val i1 = n % 10
    val i2 = n / 10 % 10
    val i3 = n / 100
    println(i1 * 100 + i2 * 10 + i3)
}