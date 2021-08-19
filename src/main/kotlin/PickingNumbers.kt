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
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here

//    val arr = mutableListOf<Int>()
//    for (i in a.indices) {
//        for (j in a.indices) {
//            if (abs(a[i] - a[j]) <= 1) {
//                arr.add(a[i])
//            }
//        }
//    }
//    var max = a.max()!!
//    val arr = mutableListOf<Int>()
//    for (i in a) {
//        if ((abs(max - i) <= 1)) {
//            arr.add(i)
//            min = i
//        }
//    }
//    println(arr)
//    println(arr.size)

//    var n = 0
//    var max = a.max()!!
//    val arr = mutableListOf<Int>()
//    while (n < a.size) {
//        if (abs(a[n] - max) <= 1 || a[n] < max) {
//            max = a[n]
//            arr.add(a[n])
//            n++
//        }
//    }


//    val arr = a.toMutableList()
//    var i = 1
//    while (i < arr.size) {
//        if (Math.abs(arr[i] - arr[i - 1]) > 1) {
//            arr.remove(arr[i])
//        }
//        i++
//    }

    //return arr.size
    return if (a.size == 2) {
        2
    } else {
        val arr = mutableListOf<Int>()
        val top = a.sum()
        val bot = a.size
        val test = top / bot
        for (i in a) {
            if (Math.abs(test - i) <= 1) {
                arr.add(i)
            }
        }
        println(arr)
        arr.size
    }




}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}

//var leftSum = 0
//var rightSum = 0
//var result = 0
//for (i in 1 until A.size) {
//    rightSum += A[i]
//}
//leftSum = A[0]
//result = abs(leftSum - rightSum)
//
//for (P in 1 until A.size) {
//    if (abs(leftSum - rightSum) < result) {
//        result = abs(leftSum - rightSum)
//    }
//    leftSum += A[P]
//    rightSum -= A[P]
//}
//return result