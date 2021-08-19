fun main() {
    val arr = arrayOf(10, 13, 19, 20, 24, 26, 30, 34, 35 )
    println(sort(arr, 39, 0, 8))
}


//fun sort(arr: Array<Int>, e: Int, l: Int, r: Int): Int {
//    var a = l
//    var b = r
//    while (a <= b) {
//        var mid = (a + b) / 2
//        if (e == arr[mid]) {
//            return mid
//        } else if (e < arr[mid]) {
//            b = mid - 1
//        } else {
//            a = mid + 1
//        }
//    }
//    println("Not found")
//    return -1
//}

fun sort(arr: Array<Int>, e: Int, a: Int, b: Int): Int {
    val mid = (a + b) / 2
    if (a > b) {
        println("invalid subArray")
        return -1
    }
    if (e == arr[mid]) {
        return mid
    } else if (e < arr[mid]) {
        return sort(arr, e, a, mid - 1)
    } else {
        return sort(arr, e, mid + 1, b)
    }
}