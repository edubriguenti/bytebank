package collections.listas

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAno = prateleira.organizarPorAnoPublicacao()

    porAno.imprimeComMarcadores()
    porAutor.imprimeComMarcadores()
}