val name: String = "Nate"
val name2: String? = "a"


fun sayHello(g: String, ii: List<String>) {
    ii.forEach { ixi ->
        println("$g $ixi")
    }
}


fun helloArg(g: String, vararg ii: String) {
    ii.forEach { j ->
        println("$g $j")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    println("Hello world")

    println(name)
    println(name2)

    when (name2) {
        "a" -> print("OI KOTLIN")
    }

    val arrInt = arrayOf(1, 2, 3, 4)
    val arrStr = arrayOf("Gerson", "Isabela", "Erika")

    println("\narrInt.forEach")
    arrInt.forEach { println(it) }

    println("\narrStr.forEach")
    arrStr.forEach { people ->
        println("$people")
        println(arrStr[0])
        println(arrStr.get(0))

    }

    println("\narrInt.forEachIndexed")
    arrInt.forEachIndexed { index, i ->
        println("$index $i")
    }

    val interestingThings = listOf("Kotlin", "Programmin", "Comic Books")
    println("\nfor(i in interestingThings){")
    for (i in interestingThings) {
        println("$i")
    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    println("\nmap.forEach")
    map.forEach { key, value -> println("$key $value") }

    val iThingsMutList = mutableListOf("K", "P", "C")
    iThingsMutList.add("W")


    val iThingsMutMap = mutableMapOf(1 to "K", 2 to "P", 3 to "C")
    iThingsMutMap.put(4, "W")

    println("FUN sayHello")
    sayHello("hi", interestingThings)


    helloArg("Hi", "Alo", "Caralho", "De", "Spread")
    helloArg("HELLO", *arrStr)

    greetPerson(name="Gerson", greeting = "Num sei")
    greetPerson("q",name="Gerson")


    val person = Person("Natalia","Abelia")
    println(person.firstName)
    println(person.lastName )
}
