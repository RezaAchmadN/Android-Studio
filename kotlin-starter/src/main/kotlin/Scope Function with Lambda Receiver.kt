fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    val message = "Hello Kotlin!"
    val result2 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
    println("result : $result2")

    val message2 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message2.toString())

    val message3: String? = null
    message3?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run {
        val text = "message is null"
        println(text)
    }

    val text1 = "Hello Kotlin"
    val result1 = text1.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result1")
}