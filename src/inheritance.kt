//Parent class/super/base

open class Animal{
    var hasFeathers= true
    var hasWings= false

    fun speak(){
        println("Animal is speaking")
    }
}


//child/derived class
class Duck:Animal(){
    var color= "white"
    fun swim(){
        println("Duck is swimming")
    }
}

fun main() {
    var a= Animal()


    var d=Duck()
    d.speak()
    println(d.color)
}