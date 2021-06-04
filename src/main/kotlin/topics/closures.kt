package topics

//closures são funções que tem acesso a variáveis e parametros que estão definidos em outro escopo

fun main() {

    fun printFilterNamesByLength(length: Int) {
        val names = arrayListOf("Kratos", "Velkana", "Yulhin")
        val filterResult = names.filter {
            it.length == length
        }
        println(filterResult)
    }

    printFilterNamesByLength(6)

    //na função acima no filter usamos o parametro length que de outra função

}