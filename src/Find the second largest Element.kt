import java.util.*

// Find the second-largest element in an array

fun main() {
    println("Enter the size of the array")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    // Check if the array has at least two elements
    if (n < 2) {
        println("Array should have at least two elements")
        return
    }

    val numbers = IntArray(n)

    for (i in 0 until n) {
        println("Enter the value of position $i")
        numbers[i] = reader.nextInt()
    }

    // Sort the array and reverse it to get descending order
    val sortedDescending = numbers.sortedDescending()
    println("The second largest element is ${sortedDescending[1]}")
}

