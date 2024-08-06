import java.util.Scanner

// reverse an array

fun main()  {
    println("Enter the size of the array")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val numbers = IntArray(n)

    for (i in 0 until n){
        println("Enter the value in position $i")
        numbers[i] = reader.nextInt()
    }
    val reverse = numbers.joinToString().reversed()
    println("The reversed array is $reverse")
}