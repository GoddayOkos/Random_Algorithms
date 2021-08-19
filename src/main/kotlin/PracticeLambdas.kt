

fun main() {
    val a = arrayOf("Godday", "Obehi", "James", "Okoduwa")
    val sorted = a.sortedWith(compareBy { -it.length })
 //   println(sorted)
   // a.forEach { println("${a.indexOf(it) + 1}: $it") }
    val empty = a.mapNotNull { it.toIntOrNull() }
    val nullList = a.map { it.toIntOrNull() }
 //   println(nullList)
    val shortName = a.filter { it.length == 5 }
    val reversedNames = a.map { it.reversed() }
 //   println(a.find { it == "Godday" })
    val b = reverseOrder<String>()
 //   println("=================")
//    println(a.sortedWith(b))
//    println(a.reversed())
//    println("=================")
//    println(reversedNames)
//    println(shortName)
//    println(empty)
  //  repeatTask(10) { println("Kotlin Apprentice is a great book!") }

    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )
    val averageRatings = mutableMapOf<String, Double>()

   // appRatings.forEach { averageRatings[it.key] = (it.value.reduce { acc, i -> acc + i }).toDouble()/it.value.size}
  //  println(averageRatings)
    val final = averageRatings.filter { it.value > 3 }.map { it.key }
  //  println(final)

    val arr = arrayOf(1, 5, 5, 4, 2, 1, 5, 4)
//    println(arr.reduce { acc, i -> acc + i })
//    println(arr.reduce { acc, i -> acc * i })
//    println(arr.reduce { acc, i -> acc - i })

    val animals = listOf("raccoon", "reindeer", "cow", "camel", "giraffe", "goat")
    val comparator = compareBy<String> {s -> s.count { it in "aeiou" }  }
    val maxVowel = animals.groupingBy { it.first() }.reduce { _, a, b -> maxOf(a,b,comparator) }
  //  println(maxVowel)



}

fun repeatTask(times: Int, task: () -> Unit) {
    repeat(times) {
        task()
    }
}





