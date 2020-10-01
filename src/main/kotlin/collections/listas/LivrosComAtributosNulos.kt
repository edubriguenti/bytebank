package collections.listas

fun main() {
    listaLivros
        .groupBy { it.editora ?: "EDITORA DESCONHECIDA" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }} ")
        }
}