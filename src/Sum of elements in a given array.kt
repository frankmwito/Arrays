import java.util.Scanner

// sum of elements in a given array

fun main()  {
    println("Enter the size of the array")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val numbers = IntArray(n)

    for (i in 0..<n){
        println("Enter the value of position $i")
        numbers[i] = reader.nextInt()
    }
    val sum = numbers.sum()

    if (sum != null){
        println("The sum is:  $sum")
    }
    else{
        println("The string is empty")
    }
}