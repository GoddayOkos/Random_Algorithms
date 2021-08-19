import org.junit.Assert.*
import org.junit.Test

class SolutionTest {
    @Test
    fun testSolutionAgainstTime() {
        val actual = 0
        val maxTime = 0.01
        val expected = measureTimeMillis {
            Solution.longestGap(15)
        }
        assertEquals(actual, expected.first)
        assert(maxTime > expected.second)
    }

    @Test
    fun testSecondSolutionAgainstTime() {
        val actual = 0
        val maxTime = 0.01
        val expected = measureTimeMillis {
            Solution.secondSolution(15)
        }
        assertEquals(actual, expected.first)
        assert(maxTime > expected.second)
    }

}