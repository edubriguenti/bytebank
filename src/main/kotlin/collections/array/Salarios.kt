package collections.array

fun main(){
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    for((indice, salario) in salarios.withIndex()) {
        salarios[indice] = salario * aumento
    }

    println(salarios.contentToString())
}