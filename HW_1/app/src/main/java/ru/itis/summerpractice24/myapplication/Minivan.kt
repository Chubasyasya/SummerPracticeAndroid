package ru.itis.summerpractice24.myapplication

class Minivan(
    mark: String,
    model: String,
    issueDate: Int,
    horsepower: Int,
    val numberOfDoors: Int,
    val numberOfSeats: Int
) : Car(mark, model, issueDate, horsepower) {
    override fun printInfo() {
        super.printInfo()
        println("numberOfDoors: $numberOfDoors; numberOfSeats: $numberOfSeats")
    }
}