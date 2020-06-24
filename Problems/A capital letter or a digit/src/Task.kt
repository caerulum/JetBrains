import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val ch = scanner.next().single()
    println(ch in 'A'..'Z' || ch in '1'..'9')
}