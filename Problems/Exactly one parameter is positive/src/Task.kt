import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    println((num1 <= 0 && num2 <= 0) xor (num1 <= 0 && num3 <= 0) xor (num2 <= 0 && num3 <= 0))
}