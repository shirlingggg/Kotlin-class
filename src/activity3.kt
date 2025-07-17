//program to check whether a number is a prime number or not
import java.util.Scanner

fun main() {
    var read= Scanner(System.`in`)
    println("Enter number:")
    var number= read.nextInt()

    if (number<=1){
        println("$number is not a prime number! ")
    }
    else{
        var y=2
        while (y<number){
            if (number%y==0){
                println("$number is not a prime number!")
                return
            }

            y++
        }
        println("$number is a prime number")
    }

}