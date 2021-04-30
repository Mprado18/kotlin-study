package exercises

/*
1. Crie uma função que recebe uma String e retorne a quantidade de caracteres.
*/
fun str(text: String): Int {
    val string = text
    return text.length
}

/*
2. Crie uma função que recebe uma String e mostre na tela a quantidade de caracteres.
Resultado esperado: “A String -PARAMETRO- possui X caracteres.”
Considere que PARAMETRO é o nome do parâmetro recebido pela função.
*/
fun str2(text: String) {
    println("A string text: $text possui ${text.length} caracteres")
}

fun main() {
    println(str("Hello"))

    str2("TEXTO INSERIDO NO PARAMETRO")
}