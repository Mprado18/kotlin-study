package topics

/*
assim como as funções de nível superior que são declaradas no escopo global do programa
temos as funções aninhadas ou funções locais que são funções dentro de outras funções
*/

fun main() {

    fun printCircumferenceAndArea(radius: Double): Unit {

        //temos duas funções locais(aninhadas) dentro de uma função, não poderão ser chamadas fora deste escopo
        /*também não precisamos passar os mesmos parametros da função circundante as funções locais, visto
        que as funções locais possuem acesso a variaveis e parametros da função circundante*/

        fun calCircumference(): Double = (2 * Math.PI) * radius
        val circumference = "%.2f".format(calCircumference())

        fun calArea() = Math.PI * Math.pow(radius, 2.0)
        val area = "%.2f".format(calArea())

        print("The circle circumference of $radius radius is $circumference and area is $area")
    }

    printCircumferenceAndArea(3.0)

}