import java.util.Scanner

fun main() {
    var read= Scanner(System.`in`)

    println("Enter num1: ")
    var num1= read.nextInt()


    println("Enter operator(+, -, *, /):")
    var operate = read.next()

    println("Enter num2: ")
    var num2= read.nextInt()

    if (operate == "/" && num2 ==0){
        println("You can't enter 0!")
        return
    }

    println("$num1 $operate $num2")

    var answer= when{
        operate== "+" -> num1 + num2
        operate== "-" -> num1 - num2
        operate== "*" -> num1 * num2
        operate== "/" -> num1 / num2
        else -> "Invalid operator!"

    }
    println("The answer is: $answer")

}