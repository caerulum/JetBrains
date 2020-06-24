import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val day = scanner.nextInt()
    val foodCostPerDay = scanner.nextInt()
    val flightCostOneWay = scanner.nextInt()
    val hotelCostPerDay = scanner.nextInt()

    val totalFoodCost = foodCostPerDay * day
    val totalFlightCost = flightCostOneWay * 2
    val totalHotelCost = hotelCostPerDay * (day - 1)

    println(totalFoodCost + totalFlightCost + totalHotelCost)
}