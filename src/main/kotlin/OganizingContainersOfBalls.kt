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

// Complete the organizingContainers function below.
fun organizingContainers(container: Array<Array<Int>>): String {

    val containers = mutableListOf<Int>()
    val balls = mutableListOf<Int>()
    val n = container.size
    for (i in 0 until n) {
        var rowSum = 0
        var colSum = 0
        for (j in 0 until n) {
            rowSum += container[i][j]
            colSum += container[j][i]
        }
        balls.add(colSum)
        containers.add(rowSum)
    }

    //Check if the two bags are equal
    containers.removeAll(balls)
    return if (containers.isEmpty()) "Possible" else "Impossible"

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val n = scan.nextLine().trim().toInt()

        val container = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

        for (i in 0 until n) {
            container[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        }

        val result = organizingContainers(container)

        println(result)
    }
}
