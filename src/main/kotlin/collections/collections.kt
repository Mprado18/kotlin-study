package collections

fun main() {
    // List - Array - Set - Hashmap

    // Assim como variáveis, temos listas mutáveis e imutáveis

    val l1 = listOf("EUA", "Canadá") //imutável, aceita elementos repetidos
    val l2 = mutableListOf("EUA", "Canadá") //mutável
    println(l2)
    l2.add("Brasil")
    println(l2)

    val a1 = arrayListOf("EUA", "Canadá") //mutável
    a1.add("Peru")
    println(a1)

    val s1 = setOf("EUA", "Canadá", "Canadá") //imutável, aceita elementos repetidos mas não os contabiliza
    println(s1.size)
    val s2 = mutableSetOf("EUA", "Canadá", "Canadá") //mutável, não contabiliza repetidos também
    println(s2.size)

    /* temos coleções de hashMapOf, mapOf e mutableMapOf
    na prática são quase todos iguais, exceto que o mapOf é imutável e os demais são mutáveis
    pode ter também alguns métodos diferentes entre o hashMapOf e mutableMapOf */
    val h1 = hashMapOf(("key" to "value"), Pair("Canadá", "Toronto"))
    println(h1.entries)
    val m1 = mapOf(("key" to "value"), Pair("Canadá", "Toronto"))
    println(m1.entries)
    val m2 = mutableMapOf(("key" to "value"), Pair("Canadá", "Toronto"))
    println(m2.entries)
}