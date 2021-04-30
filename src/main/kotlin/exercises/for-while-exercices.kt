package exercises

/*
1. Imprima os números pares de 100 a 200.
 */
fun loop() {
    for (x in 1..200) {
        if (x % 2 == 0) {
            print("$x ")
        }
    }
}

/*
2. Faça uma função capaz de receber uma String e fazer a inversão.
    Valor do parâmetro: Teste
    Resultado esperado: etseT
 */
fun reverseString(text: String) {
    println("Texto de entrada: $text, texto de saída: ${text.reversed()}")
}

/*
3. Faça uma função que receba dois números e mostre todos os números entre eles. Além dos
dois números, permita receber um terceiro parâmetro que diz se os números serão impressos de
forma crescente ou decrescente. Considere que sempre o primeiro valor será menor que o segundo.
 */
fun numbers(order: String, a: Int, b: Int) {
    if (order == "crescente" || order == "Crescente") {
        for (x in a..b) {
            print("$x ")
        }
    } else if (order == "decrescente" || order == "Decrescente") {
        var x = b
        while (a < x) {
           x-=1
           print("$x ")
        }

    }

}

/*
4. Considere uma escada de tamanho n = 4:
#
##
###
####
Perceba que o número de linhas é igual o número do tamanho N da escada. Perceba também que
a quantidade de # é igual ao tamanho N da escada na última linha.
Escreva um algoritmo que seja capaz de receber um valor inteiro N e escrever essa escada de
tamanho N.
 */
fun ladder(n: Int) {
    var x = 0
    val str = ""
    var sharp = ""
    while (x < n) {
        x++
        sharp += "#"
        println(str + sharp)
    }
}

fun main() {
    loop()
    println("")

    reverseString("Texto")

    numbers("crescente", 10, 20)
    println("")
    numbers("decrescente", 10, 20)
    println("")

    ladder(5)
}