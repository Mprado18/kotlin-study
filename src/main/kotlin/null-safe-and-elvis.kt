// Kotlin é uma linguagem null safety, podemos definir quais variáveis podem ser nulas
// temos o operador Elvis ?: e Safe ?

fun main() {

    // declarar da forma abaixo quer dizer que a variável pode ser nula
    // se não for colocado o operador safe ?, teremos o erro de NullPointerException (erro chatão)

    val test: Int? = null
    val op = test ?: "novo valor string, expressão, number"

    // o operador Elvis ?: verifica se a variável for nula irá atribuir um novo valor
    val x: Int? = 10
    val y: Int? = null
    val z = y ?: 15

    println(y)
    println(z)

    // da forma abaixo dizemos que a variável pode ser nula e assim podemos acessar as propriedades
    // caso não digamos que a variável pode ser nula ao tentar acessar as propriedades, teremos erro
    val str: String? = null
    println(str?.length) // (null) devido ser null não teremos o valor da propriedades, mas foi acessada

    // alternativa para validar se null conforme acima:
    if (str != null)
        println(str.length) // essa forma é a mesma que acima usando o ?

    // temos a alternativa de assumir que dará erro com !!
    println(str!!.length) // dessa forma sabemos que dará erro e avisamos ao Kotlin para seguir, será tratado
}