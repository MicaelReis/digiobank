package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Cliente
import one.digitalinnovation.digionebank.testes.ClienteTipo


fun main() {
    val jose = Cliente(
        nome = "jose da silva",
        cpf = "1234546",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}




