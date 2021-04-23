package poo

// A Herança nos permite herdar funções, propriedades e comportantes de outras classes
// Isso ajuda na redução de boilerplate e no re-uso de códigos
// Uma classe pai para herdar para as demais deve ser declarada com a palavra reservada open no inicio

open class Machines(val mark: String) {
    fun myMark() {
        println("Minha marca é $mark")
    }

    // existe a possibilidade de herdarmos funções da classe pai e sobrescreve-las com novo comportamento
    open fun defaultOverride() {
        println("Função default para ser sobrescrita")
    }
}

// Quando inferimos o nome de uma classe ao tipo de outra, estamos herdando da mesma
// Devemos herdar todos seus construtores também
class Computers(mark: String, val cores: Int) : Machines(mark) {
    /*
    Essa função já existe na classe pai (superclass), não é necessário cria-la novamente
    fun myMark() {
        println("Minha marca é $mark")
    }
     */

    fun turnOn() {
        println("Ligando...")
    }

    fun process() {
        println("Processando...")
    }

    // override - sobrescrita
    override fun defaultOverride() {
        // super.defaultOverride() super quer dizer que estamos referenciando a classe pai
        // se usarmos o super.default() estaremos chamando o comportamento da classe pai
        // podemos criar uma nova lógica e também utilizar o que já era da classe pai
        super.defaultOverride() //usando comportamento padrão
        // usando novo comportamento
        println("Função padrão agora está sobrescrita para padrão Computer")
    }

    // overload - sobrecarga
    // overload nos permite utilizar métodos/funções com mesmo nome, porém com tipos, qtd, parametros diferentes
    // exemplo abaixo um soma apenas Int e outro apenas Double
    // isso nos permite separar lógica para abranger mais cenários diferentes
    fun defaultOverload(x: Int, y: Int) = println("${x + y}")
    fun defaultOverload(x: Double, y: Double) = println("${x + y}")
}

fun main() {
    // aqui estamos dizendo que a variável instancia uma classe
    val c: Computers = Computers("xpto", 10)
    with(c) {
        turnOn()
        process()
        myMark() //usando função definida na classe pai (superclass)
        defaultOverride() //usando função com comportamento padrão e sobrescrito
        defaultOverload(5,5)
        defaultOverload(15.5,10.5)
    }
}