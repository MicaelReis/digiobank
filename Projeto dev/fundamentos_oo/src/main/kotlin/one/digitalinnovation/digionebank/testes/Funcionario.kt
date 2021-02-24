package one.digitalinnovation.digionebank.testes

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
    ): Pessoa(nome, cpf) {
      protected abstract fun calculoAuxiolio(): Double


    override fun toString() : String = """
        Nome: $nome
        Nome: $cpf
        Nome: $salario
        Nome: ${calculoAuxiolio()}
    """.trimIndent()
}