import kotlin.math.sqrt

fun main() {
    val bin = arrayOf(700, 810, 930, 1100, 1230, 1250, 1310, 1330)
    val bin2 = emptyArray<Int>()
    println(binarySearch(bin, 1230))
    println(linearSearch(bin, 1230))
    println(sortedLinearSearch(bin, 1230))
    println(binarySearch(bin.toIntArray(), 1230, 0, 7))
    println(java.util.Arrays.binarySearch(bin, 1230))
    println(recBinarySearch(bin, 1230))
}

fun binarySearch(arr: Array<Int>, value: Int): Int {
    var low = 0
    var high = arr.lastIndex
    while (low <= high) {
        val mid = (low + high) / 2
        if (arr[mid] == value) {
            return arr.indexOf(arr[mid])
        } else if (arr[mid] < value) {
            low = mid + 1
        } else {
            high = mid - 1
        }
    }
    return -1
}

fun recBinarySearch(arr: Array<Int>, value: Int): Int {
    val low = 0
    val high = arr.size
    if (low >= high) {
        return -1
    }
    val mid = low + (high - low) / 2
    return if (arr[mid] == value) {
        mid
    } else if (arr[mid] < value) {
        recBinarySearch(arr.sliceArray((mid + 1) until high), value)
    } else {
        recBinarySearch(arr.sliceArray(low until mid), value)
    }
}


fun linearSearch(arr: Array<Int>, value: Int): Int {
    var index = -1
    for (i in arr.indices) {
        if (arr[i] == value) {
            index = i
            break
        }
    }
    return index
}

fun jumpSearch(arr: Array<Int>, value: Int): Int {

    return -1
}

fun sortedLinearSearch(array: Array<Int>, value: Int): Int {
    var index = -1
    for (i in array.indices) {
        if (array[i] == value) {
            index = i
            break
        } else if (array[i] > value) {
            break
        }
    }
    return index
}

fun binarySearch(array: IntArray, elem: Int, left: Int, right: Int): Int {
    if (left > right) {
        return -1 // search interval is empty, the element is not found
    }
    val mid = left + (right - left) / 2 // the index of the middle element
    return if (elem == array[mid]) {
        mid // the element is found, return its index
    } else if (elem < array[mid]) {
        binarySearch(array, elem, left, mid - 1) // go to the left subarray
    } else {
        binarySearch(array, elem, mid + 1, right) // go to the right subarray
    }
}