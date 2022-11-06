// 内部类和嵌套类
class Test07(val name: String, val age: Int) {

    // 内部类 必须创建出Test07实例再.IClass
    inner class InnerClass(val name: String, val age: Int) {

    }

    // 嵌套类 可以直接 Test07.IClass
    class IClass(val name: String, val age: Int) {

    }

}

fun main() {
    Test07("ls", 18).InnerClass("zs", 20)
    Test07.IClass("zs", 22)
    "Hello World".run {  }

    "HHH".apply {
        this
    }

    "Hello" plus "World"
}

// apply实现
private inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

// infix函数
private infix fun String.plus(a: String) {
    println("$this $a")
}