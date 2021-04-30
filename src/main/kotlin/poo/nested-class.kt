package poo

// Nested classes são classes aninhadas em outras classes, ou classes internas
class PC(val processorModel: String) {

    // para uma nested class poder acessar as propriedades de sua classe pai, devemos declarar como inner class
   inner class Memory {
        fun getMemoryLevel(): Int {
            println(processorModel) //aqui conseguir acessar propriedades da classe pai
            return 70
        }
    }
}

fun main() {
    // para acessarmos os métodos e atributos da nested class devemo instanciar a classe pai e classe interna
    val m1: PC.Memory = PC("AMD").Memory()
    m1.getMemoryLevel()

    // caso a classe interna não for declarada como inner, a instancia seria dessa forma:
    /*
    val m1: PC.Memory = PC.Memory()
     */
}