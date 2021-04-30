package topics

import java.text.SimpleDateFormat
import java.util.*

// funções locais são funções dentro de algum escopo local
// exemplo uma função dentro do escopo de uma função

// podemos ter uma outra função log(), pois aqui está no escopo global
fun log(str: String) {
    println(str)
}

fun top() {

    // não é possível chamar função local antes de ser definida também
    // log() teriamos um erro aqui

    // função log é local do escopo da função top()
    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formattedHour = SimpleDateFormat("hh:mm:ss")
        println("$str - ${formattedHour.format(calendar.time)}")
    }

    // para acessarmos a função externa no escopo local de outra função devemos chamar da seguinte forma
    topics.log("Função do escopo global dentro do escopo local")

    log("Inicio")

    val interval = 1..10000
    var sum: Double = 0.0
    for (i in interval) {
        sum += i * 2 * 1
    }

    log("Fim")
}

fun main() {

    // para acessarmos a função log, basta chamarmos a função top()
    top()

    // aqui estamos acessando a função externa log() do escopo global do arquivo
    log("Escopo global")
}