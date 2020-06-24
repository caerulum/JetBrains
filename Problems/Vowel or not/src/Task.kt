import java.util.Scanner

fun isVowel(c: Char): Boolean {
    val a = c.toLowerCase()
    return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}