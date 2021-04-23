package poo

// polimorfismo é quando algo está assumindo várias formas
interface Employee {
    fun bonusCalc()
}

class Manager : Employee {
    override fun bonusCalc() {
        println("Bonus: 500")
    }
}

class Technician : Employee {
    override fun bonusCalc() {
        println("Bonus: 200")
    }
}

//este conceito de polimosfimo auxilia em mudanças futuras, caso entre outro funcionário após programas estar ok
//apenas criamos sua classe e nem mexemos na função de calcular, pois ela irá assumir a forma do calculo para o novo funcionário

fun main() {
    val emp1: Employee = Manager()
    val emp2: Employee = Technician()

    //estamos chamando uma função que calcula tanto para Manager quanto Technician
    //está função está se moldando ao comportamento da função de bonusCalc
    calc(emp1)
    calc(emp2)
}

fun calc(employee: Employee) {
    employee.bonusCalc()
}