//Kotlin program to check leap year
import java.util.Scanner

fun main() {
    var read= Scanner(System.`in`)
    println("Enter year:")
    var year= read.nextInt()
    if (year%4==0){
        println("$year is a leap year.")
    }
    else{
        println("$year is not a leap year!")
    }
}



