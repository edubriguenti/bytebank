package br.com.alura.bytebank.teste
fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        println("Executa como função anônima")
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))


    val calculaBonificacaoAnonima = fun(salario: Double): Double {
        println("Calcula bonificacao funcao anonima")
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100
    }

    println(calculaBonificacaoAnonima(1100.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        println("Executa como lambda")
        a + b
    }
    println(minhaFuncaoLambda(5, 6))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        println("Calcula bonificacao")
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100
    }

    println(calculaBonificacao(1100.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    val soma = minhaFuncaoClasse(5, 2)

    val teste2 = Teste2()
    teste2(10)
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(10, 5))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int) : Int {
        println("Executa invoke do Teste")
        return a + b
    }

}

class Teste2: () -> Unit {

    operator fun invoke(valor: Int){
        println(valor)
    }

    override fun invoke() {
        println("executa invoke do Teste2")
    }


}