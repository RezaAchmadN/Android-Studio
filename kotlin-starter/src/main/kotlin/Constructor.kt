class Animal2(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

fun main() {
    val dicodingCat = Animal2("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}