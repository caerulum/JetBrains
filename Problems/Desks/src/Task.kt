import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val classA = a % 2 + a / 2
    val classB = b % 2 + b / 2
    val classC = c % 2 + c / 2

    println(classA + classB + classC)
}