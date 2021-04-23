package topics
// Em Kotlin já temos algumas funções prontas para o tipo de dado String

fun main() {
    val str = "lorem ipsum"
    println(str.capitalize()) //coloca primeira letra em maiúsculo
    println(str.decapitalize()) //coloca primeira letra em maiúsculo
    println(str.contains("test")) //valida se string contém x valor -> return boolean
    println(str.startsWith("l")) //valida se string começa com x valor -> return boolean
    println(str.startsWith("L")) //valida se string começa com x valor -> return boolean

    //Existem diversas outras na documentação, cada uma para alguma finalidade.
    //Também existem diversas funções prontas para arrays e listas
}