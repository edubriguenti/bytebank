package collections.array

fun main(){
    val range = 1.rangeTo(10)
    for (s in range) {
        print("$s ")
    }
    println()

    val numerosPares = 2 until 100 step 2
    for(numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    val paresReverso = 100 downTo 0 step 2
    paresReverso.forEach { print("$it ") }

    /////
    println()

    val intervalo = 1500.0..5000.0
    val salario = 5001.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Está fora do intervalo")
    }

}