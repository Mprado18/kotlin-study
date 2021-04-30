package topics

// operator overloading nos permite sobrecarregar comportamentos padrões de funções de operação matemática
// o plus() tem como função somar, mas no caso abaixo seria uma soma de frações e não uma soma comum a ser feita
// essa sobrecarga nas funções nos permitem realizar operações em classes
data class Fraction (val numerator: Int, val denominator: Int) {
    operator fun plus (add: Fraction): Fraction {
        if (denominator == add.denominator) {
            return Fraction (numerator + add.numerator, denominator)
        } else {
            val commum = denominator * add.denominator
            return Fraction(((commum / denominator) * numerator) + ((commum / add.denominator) * add.numerator), commum)
        }
    }
    operator fun inc(): Fraction {
        return this
    }
}

fun main() {

    var f1: Fraction = Fraction(3,2)
    var f2: Fraction = Fraction(5,3)

    //com a função operator fun plus podemos realizar está operação matematica
    println(f1 + f2) // sem a operator fun o compilador não iria reconhecer o +

    f1++ // mesmo caso acima está criando uma customização para a incrementação
}