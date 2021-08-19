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

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

//    val k1 = x2 * (x1 + v1)
//    val k2 = v2 * (x2 + v2)
//
//    return if (x2 > x1 && v2 > v1) {
//        "NO"
//    } else if (x1 == v2 && v1 == x2) {
//        "YES"
//    } else if (k1 == k2) {
//        "YES"
//    }else {
//        "NO"
//    }

//    val k1 = x2 * (x1 + v1)
//    val k2 = v2 * (x2 + v2)
//    val k22 = x2 * (x2 + v2)
//
//    return if (x2 > x1 && v2 > v1) {
//        "NO"
//    } else if (x1 == v2 && v1 == x2) {
//        "YES"
//    } else if (k1 == k2) {
//        "YES"
//    } else if (k1 == k22) {
//        "YES"
//    } else {
//        "NO"
//    }

    val k1 = x2 * (x1 + v1)
    val k2 = v2 * (x2 + v2)
    val k22 = x2 * (x2 + v2)

    return if (x2 > x1 && v2 > v1) {
        "NO"
    } else if (x1 == v2 && v1 == x2) {
        "YES"
    } else if (k1 == k2) {
        "YES"
    } else if (k1 == k22) {
        "YES"
    } else if (v1 == v2 && x2 > x1) {
        "NO"
    } else if (x1 == x2 && v1 == v2) {
        "YES"
    } else if ( (x2 - x1) % (v1 - v2) == 0 ) {
        "YES"
    } else {
        "NO"
    }


  //  println(k1)
   // println(k2)





}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val x1V1X2V2 = scan.nextLine().split(" ")
//
//    val x1 = x1V1X2V2[0].trim().toInt()
//
//    val v1 = x1V1X2V2[1].trim().toInt()
//
//    val x2 = x1V1X2V2[2].trim().toInt()
//
//    val v2 = x1V1X2V2[3].trim().toInt()
//
//    val result = kangaroo(x1, v1, x2, v2)

   // println(result)
    val arr = intArrayOf(1,2,3,4,5,6,1,2,3,4,6)
    val odd = arr.forEach { i -> if (arr.count { it == i} % 2 != 0) println(i) }
}
