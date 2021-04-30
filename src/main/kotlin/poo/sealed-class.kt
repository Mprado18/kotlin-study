package poo

// sealed classes são classes seladas em um arquivo, não possibilitando a herança para outros arquivos
// possibilita a herança para classes do mesmo arquivo

sealed class Result() {
    class Success(val message: String): Result()
    class Error(val message: String, val errorCode: Int): Result()
}

class Repo {
    fun execute(): Result {
        return Result.Success("Deu certo")
        // return Result.Error("Deu erro", 404) é possível retornar todas as classes que herdam de Result
    }
}

fun main() {

    val r1 = Repo()
    val result: Result = r1.execute()

    when (result) {
        is Result.Success -> {
            println("Deu sucesso")
        }
        is Result.Error -> {
            println("Deu erro")
        }
    }

}