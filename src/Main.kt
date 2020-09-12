
val name: String = "Nate"
val name2: String?  = "a"

fun main() {
    println("Hello world")

    println(name)
    println(name2)

    when(name2){
        "a" -> print("OI KOTLIN")
    }

    val arrInt = arrayOf(1,2,3,4)
    val arrStr = arrayOf("Gerson","Isabela","Erika")
    arrInt.forEach { println(it) }
    arrStr.forEach { people ->
        (
                println("$people")
                )
    }
}