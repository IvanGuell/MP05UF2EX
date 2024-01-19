package org.example

fun main() {
    val arrayOriginal = arrayOf(3, 7, 2, 9, 3, 4, 7, 6)

    val numABuscar = 3
    val numVegadesRepetit = qVegadesNumero(arrayOriginal, numABuscar)
    println("El número $numABuscar està $numVegadesRepetit vegades a l'array ${arrayOriginal.contentToString()}")

    val hiHaRepetits = contarNumerosRepetidos(arrayOriginal)
    println("A l'array ${arrayOriginal.contentToString()} hi ha $hiHaRepetits elements repetits")

    val arrayOrdenat = ordenarArray(arrayOriginal)
    println("L'array ${arrayOriginal.contentToString()} ordenat és ${arrayOrdenat.contentToString()}")
}