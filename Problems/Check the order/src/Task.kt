import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var num = Int.MIN_VALUE
    var ascending = "YES"
    for (i in 1..n) {
        val n = scanner.nextInt()
        if (n > num) num = n else ascending = "NO"
    }
    print(ascending)
}