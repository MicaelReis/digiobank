package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Funcionario

class imprimerelatoriofuncionario {
    companion object{
        fun imprime(funcionario : Funcionario){
            println(
                funcionario.toString()
            )
        }

    }
}