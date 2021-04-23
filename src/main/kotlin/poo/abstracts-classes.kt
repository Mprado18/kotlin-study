package poo

// classes abstratas não podem ser instanciadas
// classes abstratas são utilizadas para definir comportamentos para outras classes

abstract class Mammal(var name: String) {
    var weight = 0 //variável para definir atributos para as classes que herdem dizerem os valores

    abstract fun talk()
    // podemos ter funções que definam comportamentos gerais
    fun sleep() {
        println("Estou dormindo") //também podemos aplicar override para caso o padrão não se aplique a alguma classe especifica
    }
}

// classes que herdam de classe abstrata devem definir os métodos abstratos da classe pai
class Dog(name: String, weight: Int) : Mammal(name) {

    // tudo que estiver dentro do init será executado
    // nesse caso estamos passando um construtor secundário atráves da variável da classe abastrata
    init {
        this.weight = weight
    }

    override fun talk() {
        println("au au")
    }
}

class Cat(name: String) : Mammal(name) {
    override fun talk() {
        println("miau")
    }
}

fun main() {
    Dog("Winky", 15).sleep()
}