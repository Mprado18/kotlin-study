// Kotlin é uma linguagem null safety, podemos definir quais variáveis podem ser nulas
// temos o operador Elvis ?: e Safe ?

fun main() {

    // declarar a forma abaixo quer dizer que a variável pode ser nula
    // se não for colocado o operador safe ?, teremos o erro de NullPointerException

    val test: Int? = null
    val op = test ?: "novo valor string, expressão, number"

    // o operador Elvis ?: verifica se a variável for nula irá atribuir um novo valor
    val x: Int? = 10
    val y: Int? = null
    val z = y ?: 15

    println(y)
    println(z)
}