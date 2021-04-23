package topics
// Os packages são pacotes, ou arquivos separados, exemplo classes, funções em outros arquivos
// É realizado dessa forma para manter organizado e não deixar tudo em um local só, (SOLID)
// Para utilizar outros packages, devemos importa-los.
// Funcionado parecido com importações de componentes e módulos do React

fun main() {
    basic.hello() // função está em outro arquivo em outro package
    hello() // função do root
    basic.sum() // função está em outro arquivo em outro package
}

/*
Se tentarmos usar uma função com mesmo nome de topics.hello, teremos um erro de conflito, devido já conter uma função
com este nome em outro pacote.
Para isso podemos indicar colocando o nome do pacote a frente da função, exemplos acima.
 */

fun hello() {
    println("Olá função do arquivo root")
}

// Algumas vezes são importados packages de funções Java para o Kotlin
// Libs quando usamos alguma função são importadas da lib para nosso código
