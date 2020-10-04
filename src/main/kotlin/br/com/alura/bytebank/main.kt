package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaHOF


fun main() {
    testaHOF()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")
    val contaPoupanca = ContaPoupanca(Cliente(nome = "Eduardo", cpf = "123", senha = 123), 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.also {
        println("Rediemnto mensal: $it")
    }


    val redimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println("Simulacao rendimento anual $redimentoAnual")
}

private fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua vergueiro"
        numero = 2
        estado = "SP"
        cep = "060030"
        cidade = "Sao Paulo"
        bairro = "Bela Vista"
        complemento = "Apt"
        completo()
    }.also(::println)
}





