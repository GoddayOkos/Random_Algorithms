
import java.util.*


//@JvmStatic
fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val q: Int = `in`.nextInt()
    for (a0 in 0 until q) {

        ///////////BUILD THE INPUT MATRIX///////////
        val n: Int = `in`.nextInt()
        val M = Array(n) { IntArray(n) }
        for (M_i in 0 until n) {
            for (M_j in 0 until n) {
                M[M_i][M_j] = `in`.nextInt()
            }
        }
        ////////////////////////////////////////////


        //Create a bag for the amount of  each ball and the sizes of containers
        val containers = LinkedList<Int>()
        val balls = LinkedList<Int>()
        for (i in 0 until n) {
            var rowSum = 0
            var colSum = 0
            for (j in 0 until n) {
                rowSum += M[i][j]
                colSum += M[j][i]
            }
            balls.add(colSum)
            containers.add(rowSum)
        }

        //Check if the two bags are equal
        containers.removeAll(balls)
        if (containers.isEmpty()) println("Possible") else println("Impossible")
    }
}