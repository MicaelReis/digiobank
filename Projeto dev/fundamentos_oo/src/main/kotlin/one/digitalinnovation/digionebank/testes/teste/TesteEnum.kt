package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name}  - ${elemento.descricao}")
    }


    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}