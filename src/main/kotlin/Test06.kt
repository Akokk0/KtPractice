fun main() {
    val name = "cdioschdisosdio"
    val name1 = name.apply {
        lowercase()
    }
    val name2 = name.run {
        this.uppercase()
    }
    println(name)
    println(name1)
    println(name2)
}