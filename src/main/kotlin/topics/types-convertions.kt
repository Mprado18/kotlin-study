package topics
/*
* Double 64
* Float 32
* Long 64
* Int 32
* Short 16
* Byte 8
*/

// Podemos converter tipos de dados em outros tipos, exemplo Byte em Int
// Porém devemos apenas cuidar com conversões de tipos menores para maiores

val myInt = 1
val myDouble = myInt

fun main() {

    println(myInt)
    println(myDouble)

    // exemplo convertendo tipo maior em menor
    val n1: Double = Double.MAX_VALUE

    println(n1)
    println(n1.toByte()) // perdemos o número devido Byte armazenar muito menos que Double

    // Também conseguimos converter strings em números (claro se forem números em strings)
    val str1 = "25"
    val str2 = "aaaa23"

    println(str1.toInt())
    println(str2.toInt()) //erro
}