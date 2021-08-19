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


// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, n: Int): Int {
    var currentCount = 0
    var minJumps = 0

    while (currentCount < n - 1) {
        if (currentCount + 2 >= n || c[currentCount + 2] == 1) {
            currentCount += 1
            minJumps++
        } else {
            currentCount += 2
            minJumps++
        }
    }

    return minJumps
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c, n)

    println(result)
}
