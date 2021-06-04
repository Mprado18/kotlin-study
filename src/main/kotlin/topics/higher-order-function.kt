package topics

//as higher order functions são funções que que aceitam outras funções ou lambdas como parametros
//um exemplo é a função last que já foi visto no tópico de lambdas a qual passamos uma lambda como parametro

fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sumN(x: Int, y: Int) = x + y

fun multiplyN(x: Int, y: Int) = x * y

fun main() {

    val stringList = listOf("in", "the", "club")
    println(stringList.last { it.length == 3 }) //retorna apenas "the" que está na condição

    /*um exemplo abaixo é a função circleOperation que tem dois parametros, o primeiro é um Double e o segundo
    é uma função que recebe um Double e retorna um Double*/

    fun calCircumference(radius: Double) = (2 * Math.PI) * radius

    fun calArea(radius: Double): Double = (Math.PI) * Math.pow(radius, 2.0)

    fun circleOperation(radius: Double, op: (Double) -> Double): Double {
        val result = op(radius)
        return result
    }

    //Para invocar a higher order function nós passamos outra função como argumento, usando :: antes da função e sem os ()
    println(circleOperation(3.0, ::calArea)) //vai compilar
    //println(circleOperation(3.0, calArea())) //não vai compilar
    //println(circleOperation(3.0, calArea())) //não vai compilar
    println(circleOperation(6.7, ::calCircumference)) //vai comppilar

    //podemos passar lambdas em higher order function da seguinte forma
    println(circleOperation(5.3, { (2 * Math.PI) * it }))

    //com higher order function também podemos retornar uma função em outra função
    fun multiplier(factor: Double): (Double) -> Double = { number -> number * factor }

    val doubler = multiplier(2.0)
    println(doubler(5.6))

    println(operator(10, 5, ::sumN))
    println(operator(10, 5, ::multiplyN))
}