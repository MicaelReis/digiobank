package one.digitalinnovation.digionebank.testes

abstract class Pessoa(
    val nome : String,
    val cpf : String
) {
    abstract fun login() : Boolean
}