package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(10, 2, resultado = {
        println("1")
        println(it)
        println("2")
    })

    somaReceiver(10, 2, resultado = {
        println("1")
        println(this)
        println("2")
    })


    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(autenticavel, 1234) {
        println("Realizar pagamento")
    }

    sistemaInterno.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Antes da soma")
    val total = a + b
    total.resultado()
    println("Depois da soma")
}