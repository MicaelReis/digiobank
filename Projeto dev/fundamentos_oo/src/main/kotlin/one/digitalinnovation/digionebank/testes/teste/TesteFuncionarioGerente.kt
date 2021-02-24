package one.digitalinnovation.digionebank.testes.teste


import one.digitalinnovation.digionebank.testes.Gerente

fun main() {
    val Maria = Gerente("Maria do Marco", "12454613", 5000.0, "senha124")
    imprimerelatoriofuncionario.imprime(Maria)

    TesteAutenticacao().autentica(Maria)
}

