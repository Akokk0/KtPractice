fun main() {
    // 匿名函数
//    showPersonInfo("zs", 18, '男') {
//        println("PersonInfo:$it")
//    }


    // 具名函数
//    showPersonInfo("ls", 20, '女', ::showResult)

    showPersonInfo {
        println(it)
    }
}

fun showResult(result: String) {
    println("PersonInfo:$result")
}

//inline fun showPersonInfo(name: String, age: Int, sex: Char, showResult: (String) -> Unit) {
//    val str = "name:$name, age:$age, sex:$sex"
//    showResult(str)
//}

inline fun showPersonInfo(showResult: (String) -> Unit) {
    val str = "name, age"
    showResult(str)
}
