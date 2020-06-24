import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val first = n / 100
    val second = n % 100 / 10
    val third = n % 10

    println(first + second + third)
}