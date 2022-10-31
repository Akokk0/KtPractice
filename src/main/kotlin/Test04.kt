fun main() {
    var name: String? = "李小龙"
//    name = null

    println(name?.let { "「$it」" } ?: "name是一个空值")
}