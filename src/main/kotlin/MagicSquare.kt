import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val possiblePermutations = arrayOf(
        arrayOf(intArrayOf(8, 1, 6), intArrayOf(3, 5, 7), intArrayOf(4, 9, 2)),
        arrayOf(intArrayOf(6, 1, 8), intArrayOf(7, 5, 3), intArrayOf(2, 9, 4)),
        arrayOf(intArrayOf(4, 9, 2), intArrayOf(3, 5, 7), intArrayOf(8, 1, 6)),
        arrayOf(intArrayOf(2, 9, 4), intArrayOf(7, 5, 3), intArrayOf(6, 1, 8)),
        arrayOf(intArrayOf(8, 3, 4), intArrayOf(1, 5, 9), intArrayOf(6, 7, 2)),
        arrayOf(intArrayOf(4, 3, 8), intArrayOf(9, 5, 1), intArrayOf(2, 7, 6)),
        arrayOf(intArrayOf(6, 7, 2), intArrayOf(1, 5, 9), intArrayOf(8, 3, 4)),
        arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8))
    )
    val given = Array(3) { IntArray(3) }
    for (i in 0..2) {
        for (j in 0..2) given[i][j] = input.nextInt()
    }
    var minCost = Int.MAX_VALUE
    for (permutation in 0..7) {
        var permutationCost = 0
        for (i in 0..2) {
            for (j in 0..2) permutationCost += Math.abs(given[i][j] - possiblePermutations[permutation][i][j])
        }
        minCost = Math.min(minCost, permutationCost)
    }
    println(minCost)
}