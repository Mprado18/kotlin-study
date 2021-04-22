package poo

// classes enum podemos listas possibilidades para reduzir chances de erros
// com as enum classes podemos ter um conjunto de valores constantes
// é possível herdar de interface, porém as enum classes não herdar de outras classes

enum class House(val words:String) {
    //Podemos definir customizações para os valores e acessa-los como propriedades
    BARATHEON("Ours Is the Fury"),
    BOLTON("Our Blades Are Sharp"),
    LANNISTER("A Lannister Always Pays His Debts"),
    MARTELL("Unbowed, Unbent, Unbroken"),
    STARK("Winter Is Coming"),
    TARGARYEN("Fire and Blood"),
    TULLY("Family, Duty, Honor");

    // as enum classes também podem ter funções
    fun sayWords() = "Words: $words"
}

fun main() {
    println(House.LANNISTER.words)
    println(House.STARK.sayWords())

}