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

// Complete the funnyString function below.
//fun funnyString(s: String): String {
//    val chars = s.toCharArray()
//    var j = chars.size - 1
//    for (i in 1 until chars.size) {
//        if (abs(chars[i].toInt() - chars[i - 1].toInt()) ==
//            abs(chars[j].toInt() - chars[j - 1].toInt())
//        ) {
//            j--
//            continue
//        } else {
//            return "Not Funny"
//        }
//    }
//    return "Funny"
//
//}

fun funnyString(s: String): String {
    var j = s.length - 1
    for (i in 0 until s.lastIndex) {
        if (abs(s[i].toInt() - s[i+1].toInt()) == abs(s[j - 1].toInt() - s[j].toInt())) {
            j--
            continue
        } else {
            return "Not Funny"
        }
    }
    return "Funny"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = funnyString(s)

        println(result)
    }
}
