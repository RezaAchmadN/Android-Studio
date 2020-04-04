class User(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main(){
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user.equals(user2))
    println(user.equals(user3))
}