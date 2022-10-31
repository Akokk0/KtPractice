fun main() {
    // Kotlin默认不能赋空值
    var name = "Akokko"
    // 报错
    // name = null
    println(name)

    // 必须要赋值为空可以使用可空变量
    var age: Number? =11
    age = null

    println(age)
}