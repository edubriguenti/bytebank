package collections.listas


fun List<Livro?>.imprimeComMarcadores() {
    val testoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ##### Lista de Livros ##### \n$testoFormatado")
}