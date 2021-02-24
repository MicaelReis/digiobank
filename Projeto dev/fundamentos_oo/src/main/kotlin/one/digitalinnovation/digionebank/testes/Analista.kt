package one.digitalinnovation.digionebank.testes

import java.math.BigDecimal

class Analista(
    nome : String,
    cpf : String,
    salario : Double
): Funcionario(nome, cpf, salario) {
    override fun calculoAuxiolio() = salario * 0.1
    override fun login() : Boolean {
        TODO("Not yet implemented")
    }

}