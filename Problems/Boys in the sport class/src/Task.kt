import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val h3 = scanner.nextInt()
    val ascending = h2 >= h1 && h2 <= h3
    val descending = h2 <= h1 && h2 >= h3
    println(ascending || descending)
}