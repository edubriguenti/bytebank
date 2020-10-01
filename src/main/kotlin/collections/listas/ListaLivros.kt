package collections.listas

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros = mutableListOf(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()
    livros.remove(livro1)
    livros.imprimeComMarcadores()
    val livrosOrdenadosPorAno = livros.sorted()
    livrosOrdenadosPorAno.imprimeComMarcadores()

    val livrosOrdenadosPorTitulo = livrosOrdenadosPorAno.sortedBy { it.autor }
    livrosOrdenadosPorTitulo.imprimeComMarcadores()

    val titulos = listaLivros
        .filter { it.autor == "Guimarães Rosa" }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)
}
