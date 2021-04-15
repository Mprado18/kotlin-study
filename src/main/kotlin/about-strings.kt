fun main() {

    // sobre strings
    val phrase = "Kotlin é uma linguagem "
    val complement = "Show!"
    val num = 15

    println(phrase + complement) //realizando concatenção
    println(phrase + complement + num) //realizando concatenção, se foi soma string + num, se torna tudo em string

    println("Aqui temos a frase concatenada com template strings: ${phrase+complement}")

    // strings multi-linha
    val str = """String 1
        |String 2
        |String 3
        |String 4 final
    """.trimMargin() //função automática para quebra a linha com as margens, (default |)

    println(str)

    // temos possibilidade de executar expressões e lógicas dentro de template strings
    val x = 15
    val y = 25

    println("A soma de x com y é: ${x+y}")
}