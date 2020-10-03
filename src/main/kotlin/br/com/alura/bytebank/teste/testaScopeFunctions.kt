package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaScopeFunctions() {
    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 2)
    val enderecoEmMaiusculo = "${endereco.logradouro} , ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)

    Endereco(logradouro = "Rua Vergueiro", numero = 2)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let { enderecoEmMaiusculo: String ->
            println(enderecoEmMaiusculo)
        }

    listOf(Endereco(complemento = "Apartamento"), Endereco(), Endereco(complemento = "casa"))
        .filter { it.complemento.isNotEmpty() }
        .let(::println)
}