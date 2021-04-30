package exercises

/*
1. Crie uma função que recebe dois valores inteiros e imprima o maior deles. Considere
que não serão informados dois valores iguais.
 */
/*
2. Faça uma alteração na função do exercício acima e considere que pode haver dois
valores informados iguais. Caso isso aconteça, imprima “Valores iguais.”.
 */
fun intValues(a: Int, b: Int) {
    if (a == b) {
        println("Valores são iguais")
    } else if (a > b) {
        println("Valor maior é: $a")
    } else {
        println("Valor maior é: $b")
    }
}

/*
3. Considere que um abacaxi custa 3 reais quando comprados em quantidade menor que
10. Se for comprado 10 ou mais abacaxis, o valor cai para 2 reais a unidade.
Escreva uma função capaz de receber a quantidade de abacaxis comprados e o valor total
da compra.
 */
fun pineapple(volume: Int) {
    if (volume >= 10) {
        println("O total de abacaxis comprados foi de $volume e o valor total da compra é: ${volume * 2}")
    } else {
        println("O total de abacaxis comprados foi de $volume e o valor total da compra é: ${volume * 3}")
    }
}

/*
4. Lutadores de boxe são classificados em categorias de acordo com o peso. Escreva um
programa usando o comando when que receba a descrição da categoria e informe o
intervalo de peso usando println.
    Pena: menos de 57 kg
    Leve: mais de 57 kg e menos de 61 kg
    Médio: mais de 61 kg e menos de 73 kg
    Pesado: igual ao acima de 73 kg
 */
fun fighters(weight: Int) {
    when (weight) {
        in 30..56 -> println("Pena: menos de 57 kg")
        in 57..60 -> println("Leve: mais de 57 kg e menos de 61 kg")
        in 61..72 -> println("Médio: mais de 61 kg e menos de 73 kg")
        in 73..110 -> println("Pesado: igual ou acima de 73 kg")
        else -> println("Peso não categorizado")
    }
}

fun main() {
    intValues(10, 11)
    intValues(8, 16)
    intValues(10, 10)

    pineapple(15)
    pineapple(8)

    fighters(62)
    fighters(73)
    fighters(65)
    fighters(32)
}