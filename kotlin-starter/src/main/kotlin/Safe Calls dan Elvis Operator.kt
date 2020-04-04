fun main(){
    val text: String? = null
    text?.length
    val textLength = text?.length ?: 7
    val textLength2 = text!!.length // ready to go ???
}