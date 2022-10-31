import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    var name: String? = null

    try {
        // 判断是否有异常，异常检测
        checkException(name)
        println(name!!.length)
    } catch (e: Exception) {
        println("ヤバい:$e")
    }
}

fun checkException(e: String?) {
    e ?: throw CustomException()
}

class CustomException : IllegalArgumentException("你的代码也太不严谨了")
