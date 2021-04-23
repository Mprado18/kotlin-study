package topics
// além do for temos o while e também o do while para estrutura de repetições (loop)
// while é mais utilizado para quando não sabemos qual é o range a ser percorrido

fun main() {

    // devemos cuidar com loops infinitos
    // abaixo um exemplo de loop infinito, como não temos condição de parada, seguirá rodando
    /*
    while (true) {
        println("Marcos")
    }
     */

    // termina a execução em 90 devido o while parar 1 antes
    var index = 10
    while (index < 100) {
        println("index: $index")
        index += 10
    }

    var i = 100
    while (i > 1) {
        println("i: $i ")
        i -= 10

        // estamos colocando uma condição de parada do loop
        // caso resultado do if seja true o break para execução do loop
        if (i == 50) {
            break
        }
    }

}