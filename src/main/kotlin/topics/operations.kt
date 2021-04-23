fun main() {
    //operações matemáticas básicas
    println("2 + 2 = ${2 + 2}")
    println("2 - 2 = ${2 - 2}")
    println("2 / 2 = ${2 / 2}")
    println("2 * 2 = ${2 * 2}")
    println("10 % 4 = ${2 % 2}")
    println("10 % 2 = ${2 % 2}")

    // incremetações e decrementações

    var num = 10

    println("num++ = ${num++}") //usa valor inicial e depois incrementa
    println("num-- = ${num--}") //usa valor inicial e depois decrementa

    println("++num = ${++num}") //incrementa o valor inicial e depois usa
    println("--num = ${--num}") //decrementa o valor inicial e depois usa

    num += 2
    println("num += 2 = ${num}")

    num -= 2
    println("num -= 2 = ${num}")

    num /= 2
    println("num /= 2 = ${num}")

    num *= 2
    println("num *= 2 = ${num}")

    num %= 3
    println("num %= 3 = ${num}")
}