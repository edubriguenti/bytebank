package br.com.alura.bytebank.modelo

import java.lang.Exception

class FalhaAutenticacaoException(messagem: String = "Mensagem") : Exception(messagem)
