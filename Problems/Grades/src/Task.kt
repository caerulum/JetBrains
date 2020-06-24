import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0
    repeat(n) {
        val grade = scanner.nextInt()
        if (grade == 2) d++
        if (grade == 3) c++
        if (grade == 4) b++
        if (grade == 5) a++
    }
    println("$d $c $b $a")
}