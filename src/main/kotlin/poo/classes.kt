package poo

// não possível criar classes com mesmo nome no mesmo arquivo
// classes devem sempre iniciar com primeira letra maiúscula
// nas classes para definir atributos devemos colocar se é val ou var
class People (var name: String, val year: Int) {

}

// definindo uma classe com atributos e comportamentos (métodos)
// classe com construtor primário
class People2 (var name: String) {
    //atribuindo construtor secundário
    var year: Int? = null //criando variável local para poder usar o atributo year
    constructor(name: String, year: Int): this(name) {
        this.year = year //atribuindo atributo year a variável local
    }

    fun hello() {
        println("Olá meu nome é $name e nasci em $year")
    }
}

fun main() {
    // aqui estamos atribuindo a variável o tipo People2 e instanciando a classe People2
    val p1: People2 = People2("Marcos", 1995)
    println(p1.name) //estamos acessando o atributo name da classe People2
    p1.hello() //podemos também acessar os métodos de uma classe

    // aqui estamos usando a classe apenas com um atributo do construtor primário
    val p2: People2 = People2("Angie")
    p2.hello() //podemos acessar seus métodos também
}