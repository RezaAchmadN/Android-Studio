fun main(){
    val text = "Hello"
    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }
}