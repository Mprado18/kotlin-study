package poo

// data classes é uma classe bastante utilizada para transitar dados, exemplos parametros diversos, funções
// com os dados das data classes, podemos transitar os dados entre diversos outras classes e arquivos
// toda classe quando criada permite o uso de 3 funções próprias: .toString(), .hashCOde(), .equals()

class Square (val area: Float)

data class Triangle (val area: Float)

fun main() {
    val s1 = Square(10f)
    val s2 = Square(10f)

    val t1 = Triangle(10f)
    val t2 = Triangle(10f)

    // as data classes facilitam a visualização dos dados de uma classe conforme abaixo
    println(s1) //poo.Square@5b2133b1
    println(t1) //Triangle(area=10.0)

    // data class nos permite comparar classes, pois ele compara os valores e não a posição na memória
    println(s1 == s2) // false devido estarem em posições diferentes na memória
    println(s1.hashCode())
    println(s2.hashCode())
    println(t1 == t2) //true, valores são iguais
    println(t1.hashCode())
    println(t2.hashCode())

    // para realizar uma comparação de classe entre classe devemos criar o equals na mão com suas especifidades
    // a data classe já faz essa comparação de forma direta

    // temos também a possibilidade de copiar todos valores de uma data class para outra
    val t3 = t2.copy()
    println(t3)
}