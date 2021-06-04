package poo

/*temos a possibilidade de ter um ou mais de um construtor em uma classe em Kotlin, o que nos possibilita
abranger uma maior gama de possíveis cenários em nossos programas*/

//classe com constructor primário
class Car(val name: String, val plateNo: String) {
    var new: Boolean? = null //em kotlin a palavra new não é reservada como no Java e em outras linguagens
    var colour: String = ""

    //constructor secundário sendo inicializado
    constructor(name: String, plateNo: String, new: Boolean) : this(name, plateNo) {
        this.new = new
    }

    //outro constructor sendo inicializado
    constructor(name: String, plateNo: String, new: Boolean, color: String) :
            this(name, plateNo, new) {
        this.colour = colour
    }
}

fun main() {

    val car = Car("Peugeot 504", "XYZ234") //instanciando classe com apenas constructor primário
    val car2 = Car("Peugeot 504", "XYZ234", false) //instanciando com constructor secundário
    val car3 = Car("Peugeot 504", "XYZ234", false, "grey") //instanciando com outro constructor secundário

}