package collections.listas

val listaLivros = mutableListOf<Livro>(
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1941
    ),
    Livro(
        titulo = "Grande Sertão Veredas",
        autor = "Guimarães Rosa",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Livro3",
        autor = "Helena Morley",
        anoPublicacao = 1943,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Livro3",
        autor = "Helena Morley",
        anoPublicacao = 1944,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Livro4",
        autor = "Helena Morley",
        anoPublicacao = 1945,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Livro5",
        autor = "Helena Morley",
        anoPublicacao = 1946,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Livro6",
        autor = "Helena Morley",
        anoPublicacao = 1947,
        editora = "Editora A"
    )

)

val listaLivrosComNulo : MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    null,
    null
)