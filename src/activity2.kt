//program to generate a multiplication table
import java.util.Scanner

fun main() {
    var read= Scanner(System.`in`)
    println("Enter number:")
    var number= read.nextInt()
    for (num in 1..10){
        println("$number * $num = ${number * num}")
    }
}