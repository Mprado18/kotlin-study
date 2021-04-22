package poo

// Em Kotlin não precisamos ficar nos preocupando em repetir métodos get e set igual ao Java
// Por trás dos panos o Koltin já tratar disso para nós, reduzindo muito a qtd de boilerplate


class Machine(var type: String) {
    // Podemos também criar Get e Set customizado, então nesse caso devemos declara-los
    var cores: Int = 0
        get () {
            println("Get foi chamado")
            return field // em Kotlin utilizando o field evitar infinitas chamadas recursivas
        }
        set (value) {
            println("Set foi chamado")
            field = value
        }

    fun turnOn() {
        println("Máquina ligada")
    }

    fun process() {
        println("Máquina processando")
    }

    fun turnOff() {
        println("Máquina desligada")
    }
}

fun main() {
    // acessando os métodos e variáveis sem necessidade de uso do get e set
    var m = Machine("xpto")
    println(m.cores)
    m.cores = 10

    // with em Kotlin nos permite acessar métodos da mesma classe com a mesma variável de forma mais prática
    // como seria sem with
    println("Sem with: ")
    m.turnOn()
    m.process()
    m.turnOff()
    // utilizando o with não é necessáio indicar a variável toda vez
    println("Com with: ")
    with(m) {
        turnOn()
        process()
        turnOff()
    }
}