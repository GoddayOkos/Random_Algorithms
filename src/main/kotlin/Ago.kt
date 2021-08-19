import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    var test = s.substring(0, 2).toInt()
    return if (s.contains("P") && test in 0..11) {
        test += 12
        "$test:${s.substring(3, 5)}:${s.substring(6, 8)}"
    } else if (s.contains("P")) {
        s.split("PM").joinToString("")
    } else if (s.contains("A") && test in 0..11) {
        s.split("AM").joinToString("")
    }
    else "00:${s.substring(3,5)}:${s.substring(6,8)}"
}




fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
