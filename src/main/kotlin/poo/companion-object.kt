package poo

//companion objects são utilizados para criarmos métodos estáticos em nosso código
//pode apenas existir apenas uma instancia de objeto de classe comparion.

//se deixarmos o constructor da classe como private não será possível instanciar a classe
class Constants private constructor() {
    companion object {
        const val TABLE = "Pessoa"

        fun printValue() {
            println("Sou um método estático")
        }
    }
}

class Person private constructor(val firstName: String, var lastName: String) {
    init {
        count++
    }

    //podemos definir nomes a nossos companion objects
    companion object Factory {
        var count: Int = 0
        fun create(firstName: String, lastName: String): Person = Person(firstName, lastName)

        init {
            println("Person companion object created")
        }
    }
}

//é possível também extender funcionalidades de um companion object
class ClassA {
    companion object {
        fun extFunc() {
            // ... do implementation
        }
    }
}

fun ClassA.Companion.extFunc() {
    // ... do implementation
}

fun main() {

    println(Constants.TABLE)//sem necessidade de instanciar a classe
    Constants.printValue()

    val person = Person.create("Cersei", "Lannister")
    println(person.firstName)
    println(person.lastName)
    Person.create("Arya", "Stark")
    Person.create("Daenerys", "Targaryen")
    Person.Factory.create("Petyr", "Baelish") //usando nome, porém fica mais verboso
    println(Person.count)

    //acessando método estático do companion object
    ClassA.extFunc() //não precisa ser instanciado conforme alguns exemplos acima do create

}