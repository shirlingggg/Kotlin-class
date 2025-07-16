import java.util.Scanner

fun main() {
    var read= Scanner(System.`in`)

    println("Enter number: ")
    var num= read.nextInt()

    if (num == 0){
        println("Invalid input!")
    }
    else if (num % 2== 0){
        println("$num is even")
    }
    else{
        println("$num is odd")
    }

}