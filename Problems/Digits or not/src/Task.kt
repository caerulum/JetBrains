import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val ch1 = scanner.next().first()
    val ch2 = scanner.next().first()
    val ch3 = scanner.next().first()
    val ch4 = scanner.next().first()
    print(ch1.isDigit())
    print('\\')
    print(ch2.isDigit())
    print('\\')
    print(ch3.isDigit())
    print('\\')
    print(ch4.isDigit())
}