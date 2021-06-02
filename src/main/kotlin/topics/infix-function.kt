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

    //com infix functions podemos também fazer o uso do Pair de forma mais concisa com o infix to
    val callingCodesMap: Map<Int, String> = mapOf(1 to "number one", 2 to "number two")
    //da forma abaixo estamos utilizando o construtor Pair para criar as chaves e valores
    val callingCodesPairMap: Map<Int, String> = mapOf(Pair(1, "number one"), Pair(2, "number two"))
}