package one.digitalinnovation.digionebank.testes

class Gerente(
    nome : String,
    cpf : String,
    salario : Double,
    val senha : String

) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxiolio() : Double = salario * 0.4


    override fun login() : Boolean = "senha124" == senha
}