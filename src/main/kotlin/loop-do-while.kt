// o do while é igual ao while, porém ele executa o código 1 vez antes da condição
// caso a condição seja falsa, o loop para

fun main() {
    var index: Int = 10
    do {
        println("index: $index") // executa uma vez antes da condição
    } while (index > 100) // loop para devido condição dar false

    var i = 10
    do {
        println("i: $i")
        i += 15
    } while (i <= 100)
}