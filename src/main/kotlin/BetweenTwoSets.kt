import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    // To find gcd of a & b, use if b == 0, return a
    // else gcd = find gcd of b, a % b

    // set gcd = 0 and find gcd of array b
    // set lcm = a[0]
    // find the lcm of a using the formula
    // lcm = lcm * a[i + 1] / findGCD(a[i + 1], lcm)

    // find the count gcd % (lcm * n) where n = k [1, 100]
    // return the count

    var gcd = 0
    for (i in b) {
        gcd = findGCD(i, gcd)
    }
    var lcm = a[0]
    for (i in 0 until a.size - 1) {
        lcm = lcm * a[i + 1] / findGCD(a[i + 1], lcm)
    }
    var count = 0
    var temp = 0
    var inc = 1
    while (inc <= gcd && temp <= gcd) {
        temp = lcm * inc
        if (gcd % (lcm * inc) == 0) {
            count++
        }
        inc++
    }
    return count
}

fun findGCD(a: Int, b: Int): Int = if (b == 0) a else findGCD(b, a % b)


fun main(args: Array<String>) {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
