fun main() {
    //Standard library functions/built-in functions
    var result = Math.sqrt(81.0)
    println("The result is $result ")

    var number= Math.round(67.8)
    println(number)

    school()
    divide()
    student("Joe", 56, "Male")
    student("Jane", 27, "Female")
    student("Ann", 34, "Female")

}

//User-defined functions-call the function inside main
fun school(){
    println("eMobilis")

}

fun divide(){
    var num1= 56
    var num2= 7
    println(num1/num2)
}

//parameters and arguments
fun student(name: String, age: Int, gender: String){
    println("$name $age $gender")

}