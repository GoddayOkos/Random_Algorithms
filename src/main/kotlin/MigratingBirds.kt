import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    var counter = 0
    var num = 0
    val freq = IntArray(arr.size)

    for (i in arr) {
        freq[i]++
    }

    for (i in arr.indices) {

        if (freq[i] > counter) {
            counter = freq[i]
            num = i
        }
    }

    return num
}


fun main(args: Array<String>) {
//    val arrCount = readLine()!!.trim().toInt()
//
//    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val result = migratoryBirds(arr)

    val cities = listOf("Jeddah", "Bengaluru", "Shenzhen", "Abu Dhabi", "Mountain View", "Tripoli", "Bengaluru", "Lima", "Mandalay", "Tripoli")
    val oneWordCities = cities.toSet().toList().filter { !it.contains(" ")}.sorted()
    println(oneWordCities)

   // println(result)
}
