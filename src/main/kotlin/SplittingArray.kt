

//fun solution(A: IntArray): Int {
//    var sumRight = 0
//    var sumLeft = 0
//    var res = 0
//    for (i in 1 until A.size) {
//        sumRight += A[i]
//    }
//    sumLeft = A[0]
//    res = abs(sumRight - sumLeft)
//    for (P in 1 until A.size) {
//        if (abs(sumLeft - sumRight) < res) {
//            res = abs(sumLeft - sumRight)
//        }
//        sumLeft += A[P]
//        sumRight -= A[P]
//    }
//    println(res)
//    return res
//}