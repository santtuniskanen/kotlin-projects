package luentokalvo5

fun rangeDice() {
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("Random number: ${randomNumber}")
}

fun firstDice() {
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
        
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
    
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}