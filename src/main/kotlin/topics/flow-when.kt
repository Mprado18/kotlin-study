package topics

// when é um fluxo de controle assim como o if-else, onde podemos colocar condicionais
// segue a mesma lógica de switch e case das outras linguagens

fun operations(a: Int, b: Int, c: String): Int {
    when (c) {
        "+" -> return a + b
        "-" -> return a - b
        else -> {
            println("operação incorreta")
            return 0
        }
    }
}

fun validate(a: Int) {
    // Aqui estamos utilizando Range, que é um intervalo de valores - ..
    when (a) {
        in 1..99 -> {
            println("Valor está entre 1 e 99")
        }
        else -> {
            println("Valor não está entre 1 e 99")
        }
    }
}

fun main() {
    println(operations(10,15,"+"))
    println(operations(15,10,"-"))
    println(operations(10,15,"*"))

    validate(15)
    validate(100)
}