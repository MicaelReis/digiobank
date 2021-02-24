package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Cliente
import one.digitalinnovation.digionebank.testes.Gerente

class TesteAutenticacao {
    fun autentica(logavel : Gerente) = println(logavel.login())


    fun autentica(logavel : Cliente) = println(logavel.login())
}


