package collections.array

fun main(){
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println(maiorIdade)

    val menorIdade = idades.minOrNull()
    println(menorIdade)

    val media = idades.average()
    println("Média: $media")

    //verificando se todos são maior de idade
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maior de idade? $todosMaiores")

    val algumMaiorDeIdade = idades.any { it >= 18 }
    println("Algum maior de idade? $algumMaiorDeIdade")

    val maiores = idades.filter { it >= 18 }
    println("Maiores $maiores")
}