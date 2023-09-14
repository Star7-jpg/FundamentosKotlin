fun main() {
    //Variables y Tipos de Datos Kotlin
    // val para constantes
    // var para variables

    val name = "Star Butterfly"
    var age = 14

    println("Hola, soy $name y tengo ")
    println(" $age años")

    //name = "Luz" las variables var no cambian  (inmutables)
    age = 24
    age = age +15

    //age = "diez" variables var cambian de valor pero no de tipo

    //Especificar Tipo de Dato en declaración

    //Declaración
    val city: String

    //inicialización
    city="Huamantla"

    //Declaración e inicialización
    val isMarried: Boolean = false

    val children: Int = 0
    val height: Double = 1.68

    println(isMarried)
    

    //String Templates
    //$ para imprimir valor de variables
    //${}para procesos antes de imprimir
    println("Hola soy $name y tengo $age años")
    println("Vivo en $city, tengo $children hijos")

    println("En 2030 tendré ${children +3} hijos")
}