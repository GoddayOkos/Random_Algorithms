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

// Complete the camelcase function below.
fun camelcase(s: String): Int = s.split(Regex("[A-Z]")).size

fun numberOfWords(s: String): Int = s.split(Regex(" ")).size

fun numberOfWords2(s: String): Int {
    if (s.trim().isEmpty()) {
        return 0
    }
    var count = 1
    for (i in s) {
        if (i == ' ') {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

   // val result = camelcase(s)
    val result = numberOfWords(s)

    println(result)
    println(numberOfWords2(s))
}
