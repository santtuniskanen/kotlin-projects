package luentokalvo5

fun ifElse() {
    val num = 3
    if (num > 4) {
        println("The variable is greater than 4!")
    } else {
        println("The variable is less than 4!")
    }
}

fun ifElseIf() {
    var num = 4
    num = 3
    // num = 6
    if (num > 4) {
        println("The variable is greater than 4!")
    } else if(num == 4) {
        println("The variable is equal to 4!")
    } else {
        println("The variable is less than 4!")
    }
}

fun largerRangeWhen() {
    val n = 4 // test also 0, 1 and 4
    when(n) {
        in 4..10 -> println("A positive number between 4 and 10.")
        1, 2 ,3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero.")
        -1, -2 -> {
            println("n is a negative integer greater than -3.")
        }
    }
}