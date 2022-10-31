fun main() {
    var name: String? = null
    name = "Akokko"
//    name = ""
    val r = name?.let {
        it.ifBlank { "Default" }
    }
    println(r)
}