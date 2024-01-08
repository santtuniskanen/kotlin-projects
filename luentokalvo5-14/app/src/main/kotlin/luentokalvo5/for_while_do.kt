package luentokalvo5

fun forLoopThing() {
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

fun itemInArray() {
    val interestingThings = arrayOf("Kotlin", "Java", "Programming")
    println(interestingThings.size)
    println(interestingThings[2])
    println(interestingThings.get(0))
    for (interestingThings in interestingThings) {
        println(interestingThings)
    }
}

fun doWhile() {
    var x = 5
    while (x > 0) {
        println("Variable x is ${x} in while loop")
        x--
    }
    x = 6
    do {
        println("Variable x is ${x} in do..while loop")
        x--
    } while (x > 0)
}