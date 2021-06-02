package topics

/*funções membro ou member functions são funções que podemos definir em classes, interfaces ou objetos, nos
ajudando a deixar o código mais legível*/
class Circle {
    //função membro da classe Circle
    fun calculateArea(radius: Double): Double {
        require(radius > 0, { "Radius must be greather than 0" })
        return Math.PI * Math.pow(radius, 2.0)
    }
}

fun main() {

    //exemplo de função membro
    val circle = Circle()
    println(circle.calculateArea(4.5))

    //funções anonimas são parecidas com lambdas na questão de não terem nome, porém sua declaração é com fun
    val stringList = listOf("in", "the", "club")
    val strLenThree = stringList.last( fun(string): Boolean {
        return string.length == 3
    } )
    println(strLenThree)

}