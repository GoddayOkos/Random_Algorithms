import Solution.Companion.longestGap

fun main() {
    println(longestGap(1041))
}

class Solution {
    companion object {
        fun longestGap(N: Int): Int {
            val s = Integer.toBinaryString(N)
            println(s)
            var count = 0
            var gap = 0
            for (e in s) {
                if (e == '0') {
                    count++
                } else {
                    if (count >= gap) {
                        gap = count
                        count = 0
                    }
                }
            }
            return gap
        }

        fun secondSolution(N: Int): Int {
            var N = N
            var max = 0
            var count = 0
            while (N % 2 == 0) {
                N /= 2
            }
            if (N == 1) {
                return 0
            }
            N /= 2
            while (N >= 1) {
                if (N % 2 == 0) count++ else {
                    max = count.coerceAtLeast(max)
                    count = 0
                }
                N /= 2
            }
            return max
        }
    }
}
fun longestUniqueSubSttr(N: Int): Int {

    val s = Integer.toBinaryString(N)

    // Creating a set to store the last positions of occurrence
    val seen: HashMap<Char, Int> = HashMap()
    var maximum_length = 0

    // starting the initial point of window to index 0
    var start = 0
    for (end in s.indices) {
        // Checking if we have already seen the element or not
        if (seen.containsKey(s[end])) {
            // If we have seen the number, move the start pointer
            // to position after the last occurrence
            start = Math.max(start, seen[s[end]]!! + 1)
        }

        // Updating the last seen value of the character
        seen[s[end]] = end
        maximum_length = Math.max(maximum_length, end - start + 1)
    }
    return maximum_length
}

fun <T> measureTimeMillis(function: () -> T): Pair<T, Double> {
    val startTime = System.currentTimeMillis()/1000.0
    println("startTime: 0:00")
    var result:T = function.invoke()
    var endTime = System.currentTimeMillis()/1000.0 - startTime
    println("endTime: $endTime")
    if (endTime > 0.04){
        throw Exception("RunTimeError")
    }
    else{
        return Pair(result, endTime)
    }

}