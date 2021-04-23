package topics

import java.lang.NumberFormatException

// As excções são erros que acabam quebrando a execução dos programas
// Podemos tratar as exceções com try e catch, dessa forma nos prevenimos com um possível erro

fun main() {

    println("código rodando antes do erro")
    try {
        // try irá tentar executar uma lógica, se der erro cai no catch
        println("tentando converter strings em number".toInt())
    }
    // Os erros especificos devem vir antes do Exception, para não serem considerados genéricos
    catch (e: NumberFormatException) {
        println("ERRO: Não é possível converter strings apenas texto em number")
    }
    // O Exception tratar os erros mais genéricos, para tratar erros especificos, devemos usar o tipo do erro
    catch (e: Exception) {
        // com o catch ele captura o erro, nos alerta do mesmo e prossegue com o programa sem para-lo
        println("Erro genérico")
    }
    // o finally irá executar uma lógica mesmo dando algum erro capturado no catch
    finally {
        println("Código dentro do finally")
    }

    println("Código rodando após o erro")

    /*
    Um tipo de erro de exemplo para prevenir com finally são aqueles onde abrimos um arquivo no windows
    e depois fechamos e quando tentamos abrir novamente ele diz que já está aberto.
    No finally poderiamos definir o fechamento a força do arquivo, para não gerar esse erro de dizer que
    já está aberto.
     */
}