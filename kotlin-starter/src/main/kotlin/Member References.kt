fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)

    println(::message.name)
    println(::message.get())

    // ::message.set("Kotlin Academy") <- Error : Unresolved reference.

    println(::message.get())
}
val message = "Kotlin"

fun Int.isEvenNumber() = this % 2 == 0