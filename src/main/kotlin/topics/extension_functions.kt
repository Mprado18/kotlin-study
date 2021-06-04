package topics

/*extension functions nos permite extender de uma classe com novas funcionalidades sem ter que herdar da mesma,
essas funções são declaradas fora do escopo da classe, sendo parecido top level function*/
class Student {

    fun printResult() {
        println("Printing student result")
    }

    fun expel() {
        println("Exprelling student from school")
    }

}

//criamos uma extension function com mesma assinatura e mesmo comportamento
//própria IDE já aponta que a função não está sendo usada e podemos deletar devido já ter outra igual
fun Student.printResult() {
    println("Extension function printResult()")
}

//criamos uma extension function com mesma assinatura, porém novo comportamento
fun Student.expel(reason: String) {
    println("Exprelling student from school. Reason \"$reason\"")
}

fun main() {

    /*as extension functions poderão ter a mesma assinatura da função membro da classe, porém devem
    set um comportamento diferente para que sejam consideradas como extension.*/

    val student = Student()
    student.printResult() //irá invocar a função membro e não a extensão, são iguais
    student.expel() //irá invocar a função membro
    student.expel("stole money") //irá invocar a extension function já que requer um argumento

    //A própria IDE já nos facilita em qual selecionar na hora caso tenham a mesma assinatura

}