fun main() {
    greetings()
    greetingsTo("Star Butterfly")
    greetingsTo("Luz Noceda")
    println("El doble de 5 es: ${duplicate(5)}")
    println("100 / 3 es ${divided(10.0, 3.0)}")
    println(fullName("John", "snow"))
    sayHello()
    greetingtoMexico()
}

//Function without params and without return
fun greetings(){
    println("Saludos para todos")
}

//Function with params and without return
fun greetingsTo(name: String){
    println("Hello $name")
    println("Welcome")
}

//functions with params and return
//We must specify data type
fun duplicate(num: Int): Int{
    return num * 2
}

fun fullName(firstName: String, lastName: String): String{
    return "$firstName $lastName"
}

fun divided(num1: Double, num2:Double): Double{
    return num1/num2
}

//Specify Data Type Unit as Void
fun sayHello():Unit{
    println("Holis *^*")
}

//Functions with default values
fun greetingtoMexico(name: String="Mexico"){
    println("Hi $name")
}