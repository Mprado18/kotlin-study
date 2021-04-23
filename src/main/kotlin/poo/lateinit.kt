package poo

// muitas vezes precisamos criar variáveis sem atribuição para posteriormente serem atribuidos seus valores
// uma alternativa seria o uso do null tornando-a nula, porém a mesma precisaria ser tratada depois
// para isso temos o lateinit

class Peoples {
    // dessa forma dizemos que a variável será inicializada depois da chamada da função
    lateinit var name: String

    fun generateName() {
        name = "nome aleatório"
    }
}

fun main() {
    val p = Peoples()
    p.generateName()
}