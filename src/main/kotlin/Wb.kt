fun main() {
   val arr = arrayOf(1,1,3,2,1)
    val res = Array<Int>(100){0}
    for (i in arr.indices) {
        res[arr[i]] += 1
    }
    println(res.joinToString(","))
}