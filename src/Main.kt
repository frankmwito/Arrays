import java.util.*

//find the maximum Element

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter size of the array or max number of values")
    val n = reader.nextInt()
    val numbers   =  IntArray(n)

    for (i in 0 until n){
        println("Enter the precise value for element $i")
        numbers[i] = reader.nextInt()
    }
    val maxValue = numbers.maxOrNull()
    if (maxValue != null){
        println("The maximum value of the array is $maxValue")
    }else{
        println("The array is empty:")
    }
}