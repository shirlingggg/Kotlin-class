import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your full name:")
    var fullname = readln()
    println("Fullname: $fullname")


    println("Enter your age(in years): ")
    var age = read.nextInt()
    println("Age : $age")

    println("Enter your weight(in kgs): ")
    var weight = read.nextDouble()
    println("Weight: $weight")

    println()

    println("Summary of your information:")
    println("Fullname: $fullname")
    println("Age: $age years old")
    println("Weight: $weight kgs")
    println("-------Thank You!--------")
}