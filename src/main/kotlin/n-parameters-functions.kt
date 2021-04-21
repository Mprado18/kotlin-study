// Podemos ter funções com infinitos parametros
// Com o vararg isso é possível, não precisando colocar todos os parametros de forma manual

// Exemplo de função com vários parametros colocados manualmente
// Nesses exemplos o number não está sendo utilizado, poderiamos deixa-lo com valor default
// Podemos deixar a rua como default também
fun address(street: String = "", city: String, state: String, cep: String, number: Int = 0) {
    // os parametros irão seguir sua ordem definida, a menos que: (exemplo abaixo)
    println("Street: $street")
    println("City: $city, $state - $cep, $number")
}

// Função com N parametros
// Se fossem diversos semestres não seria necessário atribuir vários parametros para isso
fun calcAverage(vararg values: Float) {
    if (values.isNotEmpty()) {
        var sum = 0f
        for (value in values) {
            sum += value / values.size
        }
        println(sum)
    }
}

fun main() {
    // Caso coloquemos os nomes dos parametros, poderemos chamar de forma desordenada
    // Não precisa chamar o default a menos que o valor vá trocar
    address(city = "Curitiba", cep = "123456789", street = "Rua Brasil", state = "Paraná")
    // Caso não coloquemos o nome deve ser na ordem inicialmente denifinda, e os default devem ser atribuidos
    address("Rua Brasil", "Curitiba", "Paraná", "123456789", 185)

    // exemplo colocando muitos argumentos para os parametros
    // calcAverage(1f,5f,6f,10f,10.5f,55f,65.6f,89.89f,12f,5584f)
    calcAverage(5.5f,10f,8.8f,9.3f) // dessa forma se precisar adicionar mais valores está ok
}