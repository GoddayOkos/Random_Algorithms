import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the closestNumbers function below.
fun closestNumbers(arr: Array<Int>): Array<Int> {
    val sortArr = arr.sorted()
    val list = ArrayList<Int>()
    var test = Int.MAX_VALUE
    for (i in 0 until sortArr.lastIndex) {
        var check = kotlin.math.abs(sortArr[i + 1] - sortArr[i])
        if (check < test) {
            test = check
            list.clear()
        }
        if (check == test) {
            list.add(sortArr[i])
            list.add(sortArr[i + 1])
        }
    }
    println(list.toList())
    return list.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = closestNumbers(arr)

    println(result.joinToString(" "))
}
