fun main() {
    //while loop

    var count = 45
    while (count<=50){
        println("Number is $count")
        count++
    }

    //print numbers from 10 to 5 (descending order)
    var num= 10
    while (num>=5){
        println("The number is $num")
        num--
    }

    //Do while loop
    var x= 1
    do {
        println("Number is $x")
        x++
    }
        while (x<=5)

    //for loop
    for (number in 30..40){
        println("Number is $number")
    }

    //print letters from a-d
    for (letter in 'a'..'d'){
        println(letter)
    }

    println()

    //demonstrating programs that implement break(stops the loop) and continue(skips an element in the loop)

    for (x in 20..50){
        if (x==49){
            break
        }
        println(x)
    }

    println()

    for (y in 'g'..'l'){
        if (y=='i'){
            continue
        }
        println(y)
    }



}