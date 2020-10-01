package collections.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.0", "5000.0", "10000.0")

    println(salarios.contentToString())

    val aumento = BigDecimal("1.1")
    val salariosComAumento = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoPrimeiroMes = salariosComAumento.somatoria()
    println(gastoPrimeiroMes)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoPrimeiroMes) { acc, salario ->
        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total: $gastoTotal")

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(media)
}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
): BigDecimal {
    return if (salario > "5000.0".toBigDecimal()) {
        (salario * aumento).setScale(2, RoundingMode.UP)
    } else {
        salario + "500".toBigDecimal()
    }
}

