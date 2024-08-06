import java.util.*

// Merge two sorted arrays and sorted in ascending order


fun main() {
    println("Enter the size of the first array")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var numbers = IntArray(n)


    for (i in 0..<n) {
        println("Enter the value of position $i")
        numbers[i] = reader.nextInt()
    }


    println("Enter the size of the second array")
    val n1 = reader.nextInt()
    val numbers1 = IntArray(n1)

    for (i in 0..<n1) {
        println("Enter the value of position $i")
        numbers1[i] = reader.nextInt()
    }
     numbers += numbers1
    val sorted = numbers.sorted()
    println("The sorted array is $sorted")
}