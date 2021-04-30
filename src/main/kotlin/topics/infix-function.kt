package topics

// funções infix funcionam apenas com um parametro
// funções infix nos permitem chama-las sem a convenção padrão de chamada de função, sem . e ()

// podemos utilizar funções infix dentro de classes também
class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHalfOf (value: Int) = value / 2 == this

fun main() {

    10.isHalfOf(40) //podemos acessar a função desta forma
    10 isHalfOf 30 // ou desta forma sem a convenção de ponto e ()

    val p1: Person = Person("Marcos")
    p1 isName "Marcos"
}