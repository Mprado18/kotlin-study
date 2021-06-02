package topics

/*
funções lambdas nos permitem deixar nosso código mais conciso e também realizar diversas
lógicas de forma mais fácil
*/
/*
podemos ter expressões lambda, passar funções lambda como parametros de outros funções,
funções curtas de única linha
*/

/*
lambdas são compostas por {}, não precisa do fun, não possui nome, compilador infere seu tipo de retorno,
parametros não são dentro de ().
*/

fun main() {

    //estamos atribuindo uma expressão lambda a uma variável
    val message = { println("Hello World") }
    message() //seu método de invocação é igual função comum

    //podemos incluir parametros em lambdas também, a frente do -> é seu parametro e após seu corpo(lógica)
    val message2 = { myString: String -> println(myString) }
    message2("Hello World na lambda com parametro")

    //exemplo com mais de um parametro, podemos ter vários separados por vírgula
    val addNumbers = { x: Int, y: Int ->
        println("Adding $x and $y")
        val result = x + y
        println("The result is $result")
    }
    addNumbers(1, 3)

    //passando lambda como parametro de função chamadas de funções de ordem superior
    val stringList: List<String> = listOf("in", "the", "club")
    println(stringList.last()) //retorna último elemento da lista

    /*passamos a lambda como parametros da função last
    que só irá pegar o último elemento que atingir a condição da lambda, podemos retirar o tipo String também
    já que o compilador irá inferir para nós e os () da função se o último ou único parametro for uma
    lambda, deixando o código mais legível*/
    println(stringList.last { s -> s.length == 3 })
    //podemos simplificar a função com o uso do it no lugar do argumento
    println(stringList.last { it.length == 3 })

}