import java.util.*

// check if array is sorted

fun main() {
    println("Enter the size of the array")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val numbers = IntArray(n)

    for (i in 0..<n){
        println("Enter the value of position $i")
        numbers[i] = reader.nextInt()
    }
    val isSorted = isArraySorted(numbers)
    println("$isSorted")

    }

fun isArraySorted(arr: IntArray):Boolean {
    for (i in 0 until arr.size-1){
        if (arr[i] > arr[i+1]){
            return false
        }
    }
    return true
}
