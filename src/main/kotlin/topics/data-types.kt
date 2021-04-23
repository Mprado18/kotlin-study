package topics

fun main() {
    // declaração de variáveis

    // variável mutável sem inferir seu tipo, Kotlin faz automáticamente
    var nome = "Marcos"
    var idade: Int = 25 //inferindo tipo do dado (não obrigatório)

    println("idade: $idade")

    idade = 26
    println("idade: $idade")

    // variável imutável
    val name = "Marcos"
    val age = 25
    // age = 26 não pode ser atribuido um novo valor (gera um erro)

    val x: Int // podemos declarar variável val sem valor inicial
    x = 15

    // tamanho dos valores que cada tipo de dado pode armazenar
    println("Double: Max " + Double.MAX_VALUE + " / Double: Min " + Double.MIN_VALUE)
    println("Float: Max " + Float.MAX_VALUE + " / Float: Min " + Float.MIN_VALUE)
    println("Long: Max " + Long.MAX_VALUE + " / Long: Min " + Long.MIN_VALUE)
    println("Int: Max " + Int.MAX_VALUE + " / Int: Min " + Double.MIN_VALUE)
    println("Short: Max " + Short.MAX_VALUE + " / Short: Min " + Short.MIN_VALUE)
    println("Byte: Max " + Byte.MAX_VALUE + " / Byte: Min " + Byte.MIN_VALUE)

    // String não pode ter limitação de tamanho, visto que pode ser infinitos valores
}