package topics

// if-else para realizar controles de fluxo
fun validateAge(age: Int) {
    if (age >= 18) {
        println("Maior de idade")
    } else {
        println("Não é maior de idade")
    }
}

// forma de retornar boolean para condição verdade, retirando necessidade de if-else
fun validadeAge2(age: Int): Boolean {
    return age >= 18
}

// utilizando if-else if-else para realizar mais de uma condição
fun calculate(position: String, salary: Float): Float {
    var total: Float
    if (position == "cordinator") {
        total = (salary * 0.2f) + salary
    } else if (position == "manager1") {
        total = (salary * 0.5f) + salary
    } else {
        total = salary * 2
    }
    return total
}

// versão concisa da função anterior, é possível deixar mais reduzido de outros métodos
fun calculateConcise(position: String, salary: Float): Float {
    return if (position == "cordinator") {
        (salary * 0.2f) + salary
    } else if (position == "manager1") {
        (salary * 0.5f) + salary
    } else {
        salary * 2
    }
}

fun main() {
    validateAge(18)
    validateAge(15)
    validateAge(35)

    println(validadeAge2(18))

    println(calculate("cordinator", 1500f))
    println(calculate("manager1", 2000f))
    println(calculate("manager2", 3000f))

    // Como representar ternário no Kotlin (não possui da forma comum)
    //String str = valor == 10 ? "Sim" : "Não"; (Java)
    val valor = 10
    val str = if (valor == 10) "Sim" else "Não"
}