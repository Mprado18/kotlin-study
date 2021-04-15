// não é possível declarar os parametros sem o tipo de dado
fun calculate(a: Int, b: Int, c: Int): Int {
    var total = (a + b) * 2
    println("O total é de: $total")
    return total
}

/*
caso não especificamos qual é o tipo de retorno da função o Kotlin irá retornar Unit,
que é uma função apenas de execução
*/
fun hello(name: String) {
    println("Olá $name!")
}

// simplificando funções e linha única
// para executar em linha única deve ter apenas uma instrução
fun sum(x: Int, y: Int) = println("A soma de x + y é: ${x + y}")

fun main() {
    calculate(20, 10, 1) //chamando a função passando os argumentos aos parametros

    hello("Marcos")

    sum(10,10)
}