// for é utilizado para realizar estrutura de repetição e não precisar repetir o código infinitas vezes

fun main() {
    // isso faz uma estrutura de repetição em um range definido
    for (item in 1..50) {
        print("$item ")
    }

    println(" ")

    // podemos definir loops com algum step também
    for (i in 1..20 step 2) {
        print("$i ")
    }

    println("")
    // podemos fazer loop decrescentes também
    // o for pode ser executado sem abertura de {}, porém deve-se atentar a identação
    for (j in 20 downTo 1)
        print("$j ")

}