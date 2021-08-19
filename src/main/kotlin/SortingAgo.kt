
fun selectionSort(array: IntArray): IntArray? {
    for (i in 0 until array.size - 1) {
        var index = i // the index of the found min

        /* Iterating over the unsorted subarray to find the min */
        for (j in i + 1 until array.size) {
            if (array[j] < array[index]) {
                index = j
            }
        }

        /* Exchanging the found min and the current element */
        val min = array[index]
        array[index] = array[i]
        array[i] = min
    }
    return array
}


fun bubbleSort(array: IntArray): IntArray? {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            /* if a pair of adjacent elements has the wrong order it swaps them */
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    return array
}


fun insertionSort(array: IntArray): IntArray? {
    /* iterating over elements in the unsorted part */
    for (i in 1 until array.size) {
        val elem = array[i] // take the next element
        var j = i - 1

        /* find a suitable position to insert and shift elements to the right */
        while (j >= 0 && array[j] > elem) {
            array[j + 1] = array[j] // shifting
            j--
        }
        array[j + 1] = elem // insert the element in the found position in the sorted part
    }
    return array
}


fun countingSort(numbers: IntArray): IntArray? {
    val maxVal = 10 // we suppose the maximum is 10
    val k = maxVal + 1 // the length of the array containing counts
    val counts = IntArray(k) // it stores 11 zeros with indexes from 0 to k-1

    /* in this loop we count distinct numbers in the input array */
    for (i in numbers.indices) {
        counts[numbers[i]]++
    }
    var pos = 0 // a position in the numbers array

    /* in this loop we modify the input array to make it sorted */
    for (num in 0 until k) { // get the next element
        var count = counts[num] // get the count of the element
        while (count > 0) {
            numbers[pos] = num // write it in the numbers array
            pos++
            count--
        }
    }
    return numbers
}

fun mergeSort(array: IntArray?, leftIncl: Int, rightExcl: Int) {
    // the base case: if subarray contains <= 1 items, stop dividing because it's sorted
    if (rightExcl <= leftIncl + 1) {
        return
    }
    /* divide: calculate the index of the middle element */
    val middle = leftIncl + (rightExcl - leftIncl) / 2
    mergeSort(array, leftIncl, middle) // conquer: sort the left subarray
    mergeSort(array, middle, rightExcl) // conquer: sort the right subarray

    /* combine: merge both sorted subarrays into sorted one */
    merge(array!!, leftIncl, middle, rightExcl)
}

private fun merge(array: IntArray, left: Int, middle: Int, right: Int) {
    var i = left // index for the left subarray
    var j = middle // index for the right subarray
    var k = 0 // index for the temp subarray
    val temp = IntArray(right - left) // temporary array for merging

    /* get the next lesser element from one of two subarrays
       and then insert it in the array until one of the subarrays is empty */
    while (i < middle && j < right) {
        if (array[i] <= array[j]) {
            temp[k] = array[i]
            i++
        } else {
            temp[k] = array[j]
            j++
        }
        k++
    }

    /* insert all the remaining elements of the left subarray in the array */
    while (i < middle) {
        temp[k] = array[i]
        i++
        k++
    }

    /* insert all the remaining elements of the right subarray in the array */
    while (j < right) {
        temp[k] = array[j]
        j++
        k++
    }

    /* effective copying elements from temp to array */
    System.arraycopy(temp, 0, array, left, temp.size)
}


fun quickSort(array: IntArray?, left: Int, right: Int) {
    if (left < right) {
        val pivotIndex: Int = partition(array!!, left, right) // the pivot is already on its place
        quickSort(array, left, pivotIndex - 1) // sort the left subarray
        quickSort(array, pivotIndex + 1, right) // sort the right subarray
    }
}


private fun partition(array: IntArray, left: Int, right: Int): Int {
    val pivot = array[right] // choose the rightmost element as the pivot
    var partitionIndex = left // the first element greater than the pivot

    /* move large values into the right side of the array */for (i in left until right) {
        if (array[i] <= pivot) { // may be used '<' as well
            swap(array, i, partitionIndex)
            partitionIndex++
        }
    }
    swap(array, partitionIndex, right) // put the pivot on a suitable position
    return partitionIndex
}

private fun swap(array: IntArray, i: Int, j: Int) {
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}

