import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'nonDivisibleSubset' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY s
 */

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {

    val bucket = IntArray(k)
    var size = 0
    for (i in s.indices) {
        bucket[s[i] % k]++
    }
    for (i in 1..k / 2) {
        if (i * 2 == k) {
            size++
        } else {
            size += bucket[i].coerceAtLeast(bucket[k - i])
        }
    }
    return if (bucket[0] != 0) size + 1 else size
    // Write your code here
//    val s = arr.sorted()
//    val list = mutableSetOf<Int>()
//    for (i in 0 until s.lastIndex) {
//        for (j in 0..s.lastIndex) {
//            if ((s[i] + s[j]) % k != 0) {
//                list.add(s[i])
//                list.add(s[j])
//            }
//        }
//    }
//    println(list)
   // return list.size
//    val list = s.filter { (it + it) % k != 0 }.toMutableList()
//    println(list.size)
//    for (i in s.indices) {
//        if ((list[1] + s[i]) % k == 0) {
//            println("${s[i]}")
//            list.remove(s[i])
//        }
//    }
//
//    println(list)
//    return list.size



//    val bucket = IntArray(k)
//    println(bucket.toList())
//    var counter = 0
//    for (i in ar) {
//        val rem = i % k
//        val comp = (k - rem) % k
//        counter += bucket[comp]
//        bucket[rem]++
//    }
//    return counter
  //  return list.size

}

fun main(args: Array<String>) {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(k, s)

    println(result)
}
