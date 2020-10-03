package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno


fun main() {

    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 2)
    val enderecoEmMaiusculo = "${endereco.logradouro} , ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)

    Endereco(logradouro = "Rua Vergueiro", numero = 2)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let {enderecoEmMaiusculo: String ->
            println(enderecoEmMaiusculo)
        }

    listOf(Endereco(complemento = "Apartamento"), Endereco(), Endereco(complemento = "casa"))
        .filter { it.complemento.isNotEmpty() }
        .let(::println)

    soma(10, 2, resultado = {
        println("1")
        println(it)
        println("2")
    })


    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 123) {
        println("Realizar pagamento")
    }

}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}