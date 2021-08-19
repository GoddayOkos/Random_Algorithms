
import java.util.BitSet

import java.math.BigInteger


// 1st approach
fun acmTeam(topic: Array<String?>): IntArray? {
    val n = topic.size
    val bi = arrayOfNulls<BigInteger>(n)
    for (i in 0 until n) bi[i] = BigInteger(topic[i], 2)
    var maxTopic = 0
    var teamCount = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val iuj = bi[i]!!.or(bi[j])
            val bitCount = iuj.bitCount()
            if (bitCount > maxTopic) {
                maxTopic = bitCount
                teamCount = 1
            } else if (bitCount == maxTopic) {
                teamCount++
            }
        }
    }
    return intArrayOf(maxTopic, teamCount)
}

// 2nd approach--using java BitSet class
fun acmTeamUsingBitSet(topic: Array<String?>): IntArray? {
    var teamCount = 0
    var maxTopic = 0
    val size = topic.size
    val bitset = arrayOfNulls<BitSet>(size)
    for (i in 0 until size) {
        val b1 = BigInteger(topic[i], 2)
        bitset[i] = BitSet.valueOf(b1.toByteArray())
    }
    for (i in 0 until size - 1) {
        val bitset1 = bitset[i]
        for (j in i + 1 until size) {
            val bitset2 = bitset[j]
            val tmpset = BitSet()
            tmpset.or(bitset1)
            tmpset.or(bitset2)
            if (tmpset.cardinality() > maxTopic) {
                maxTopic = tmpset.cardinality()
                teamCount = 1
            } else if (maxTopic == tmpset.cardinality()) {
                teamCount++
            }
        }
    }
    return intArrayOf(maxTopic, teamCount)
}