package collections

// criamos uma data class com nome da comida, total calorias e lista de ingredientes
// essa lista é genérica e irá se adequar a comida que foi implementada
data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun hasIngredient(list: List<Ingredients>, name: String) : Boolean {
    return list.filter { it.name == name }.any()
}

fun main() {
    val data = listOf(
        // estamos dizendo que está comida tem uma lista de ingredientes
        Food("Lasanha", 1200.0,
            listOf(Ingredients("Farinha", 1),
                    Ingredients("Presunto", 5),
                    Ingredients("Queijo", 10),
                    Ingredients("Molho de tomate", 2),
                    Ingredients("Manjericão", 3)
            )
        ),
        //essas não possuem, temos apenas a comida direta
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de feijão", 300.0),
        // novamente usando a lista genérica de ingredientes
        Food("Hamburguer", 2000.0,
            listOf(Ingredients("Pão", 1),
                    Ingredients("Queijo", 3),
                    Ingredients("Hamburguer", 3),
                    Ingredients("Catupiry", 1),
                    Ingredients("Bacon", 3),
                    Ingredients("Alface", 1),
                    Ingredients("Tomate", 1)
            )
        )
    )
        println(data)

    // Tenho receitas na lista?
        println("Tenho receitas? ${if (data.any()) "Sim" else "Não"}.")

    // Quantas receitas tenho na coleção?
        println("Tenho ${data.count()} receitas")

    // Qual a primeira e última receita?
        println("A primeira receita é: ${data.first().name}.")
        println("A última receita é: ${data.last().name}.")

    // Qual a soma de calogias?
        val sumCalories = data.sumByDouble { it.calories }
        println("A soma total de calorias é: $sumCalories!")
        //caso tenhamos apenas uma lista de inteiros podemos usar apenas o listOf(1,2,3).topics.sum()

    // Me dê as duas primeiras receitas!
        val firstAndTwo = data.take(2)
        for (food in firstAndTwo.withIndex()) {
            println("${food.index + 1} - ${food.value.name}")
        }

    // Sei fazer panqueca? e Sushi?
        val knowPancake = data.filter { it.name == "Panqueca" }.any()
        println("Sei fazer panqueca? ${if (knowPancake) "Sim" else "Não"}")
        val knowSushi = data.filter { it.name == "Sushi" }.any()
        println("Sei fazer panqueca? ${if (knowSushi) "Sim" else "Não"}")

    // Quais são as comidas com mais de 500 calorias?
        val more500Calories = data.filter { it.calories > 500 }.forEach { println(it.name) }

    // Par (chave, valor) de comidas com mais de 500 calorias, (name, calories)
        data.filter { it.calories > 500 }
            .map { Pair(it.name, it.calories) }
            .forEach { println("Food: ${it.first}: ${it.second} calories") }

    // Quais das receitas possui farinha como ingrediente?
        val farinha = data.filter { hasIngredient(it.ingredients, "Farinha") }
            .forEach { println(it.name) }
}