fun main(){
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")

    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.dropLast(3)

    println(drop)

    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.takeLast(3)

    println(take)

    val index = listOf(2, 3, 5, 8)
    val total1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total1.slice(index)

    println(slice)

    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val word = "QWERTY"
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}