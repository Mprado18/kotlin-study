package poo

// interfaces são similares com classe abstrata, a definimos como se fosse um contrato
// quem a implementa deve obrigatoriamente receber seus métodos
// não é possível classes terem herança multipla, mas é possível implementar mais de uma interface

interface Machine2 {
    // interface não pode ter estado, ou seja, uma variável com valor atribuido
    // podemos ter variáveis definidas, mas sem o valor e as classes deverão atribui-lo

    fun turnOn()
    fun turnOff()
}

// classe que implementa a interface, deverá receber todos seus métodos
class Computer : Machine2 {
    override fun turnOn() {
        TODO("Not yet implemented")
    }

    override fun turnOff() {
        TODO("Not yet implemented")
    }

}

interface Interface1 {
    fun hello()
}

interface Interface2 {
    fun hello() {
        println("Hello interface 2")
    }
    fun bye()
}

// classes que implementam mais de uma interface e que as interfaces possuam funções com mesmo nome
// será feito override em apenas uma, não poderá ter as duas repetidas
class ImplementInterfaces : Interface1, Interface2 {

//    override fun hello() {
//        TODO("Not yet implemented")
//    }

    // caso essas funções iguais entre as interfaces possuam um comportamento, ai sim é possível chamar, exemplo:
    override fun hello() {
        super<Interface2>.hello()
    }

    override fun bye() {
        TODO("Not yet implemented")
    }

}

fun main() {

}