import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()
    val box1 = x1 * y1 * z1
    val box2 = x2 * y2 * z2

    val numbers1 = listOf(x1, y1, z1).sorted()
    val min1 = numbers1[0]
    val mid1 = numbers1[1]
    val max1 = numbers1[2]

    val numbers2 = listOf(x2, y2, z2).sorted()
    val min2 = numbers2[0]
    val mid2 = numbers2[1]
    val max2 = numbers2[2]

    if (box1 > box2 && min1 >= min2 && mid1 >= mid2 && max1 >= max2) {
        println("Box 1 > Box 2")
    } else if (box1 < box2 && min1 <= min2 && mid1 <= mid2 && max1 <= max2) {
        println("Box 1 < Box 2")
    } else if (box1 == box2) {
        println("Box 1 = Box 2")
    } else {
        println("Incomparable")
    }
}