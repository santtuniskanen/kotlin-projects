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

fun sameThingWithWhen() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    val message = when (rollResult) {
        4 -> "Congratulations, you won!"
        1 -> "So sorry! You rolled a 1. Try again!"
        2 -> "Sadly, you rolled a 2. Try again!"
        3 -> "Unfortunately, you rolled a 3. Try again!"
        5 -> "Don't cry! You rolled a 5. Try again!"
        else -> "Apologies! You rolled a 6. Try again!"
    }
    println(message)
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}