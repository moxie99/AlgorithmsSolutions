import kotlin.math.sqrt

fun main(args: Array<String>) {

    var personObj = Person()
    personObj.name = "Oluwasegun"

    personObj.displayName()

    println("The name of the person is " + personObj.name)
    println("The name of the person is ${personObj.name}")

    var rect = Rectangle()
    var rectLength = rect.length
    var rectBreadth = rect.breadth

    var rectArea = rectLength * rectBreadth


    println("The length of the rectangle is $rectLength meters and the breadth is $rectBreadth meters. The area is $rectArea metres square")


    var r1 = "a" .. "z"
    var r2 = 5..1 step 2
    var r3 = 100..0 step 5
    var r4 = 10.downTo(1)step 3
    var r5 = 1.rangeTo(10) step 4

//    println(Arrays.toList(r2))

    println(r1)
    println(r3)

    val v = 3

    var str: String = when (v) {
        1-> "x is 1"
        2 -> "x is 2"
        else -> "x is not a valid number"
    }
    println(str)

//    for(i in 1..50 ){
//        if (i % 2 == 0){
//            println(i)
//        }else{
//            continue
//        }
//
//    }

    thisLoop@for (i in 1..3){
        for (j in 1..7){
            if (i == 2 && j == 2){
                break@thisLoop
            }
            println("[$i, $j]")
        }
    }

    fun quadratic(a: Int, b: Int, c: Int): Double{
        var numerator: Int = -b +(b * b - (4 * a * c))
        var denominator = 2 * a
        var squareRootNumerator = sqrt(numerator.toDouble())

        return squareRootNumerator / denominator
    }

    var answer = quadratic(12,5,6)
    println(answer)

}

class Person{

   var name = ""
    fun displayName(){
        println(name)
  }
}

class Rectangle {
    var length: Int = 10
    var breadth: Int = 30
}
