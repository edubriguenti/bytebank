package br.com.alura.bytebank


fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse : () -> Unit = Teste()
    minhaFuncaoClasse()

    val teste2 = Teste2()
    teste2(10)

}

fun teste() {
    println("Teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")
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