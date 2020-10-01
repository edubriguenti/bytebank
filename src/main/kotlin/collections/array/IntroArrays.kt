package collections.array

fun main() {
    val idades = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = idades[0]
    for(index in 1 until idades.size) {
        if (idades[index] > maiorIdade){
            maiorIdade = idades[index]
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade){
            menorIdade = idade
        }
    }
}