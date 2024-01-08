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