fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val testFun : (Int, Int, Int) -> String = { number1, number2, number3 ->
        val number = "Hello World"
        "$number, $number1, $number2, $number3"
    }

    println(testFun(1, 2, 3))
}