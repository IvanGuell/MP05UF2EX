package org.example

fun qVegadesNumero(dades:Array<Int>, numeroABuscar:Int):Int {
    // Declarem i inicialitzem la variable qVegades que emmagatzemarà la quantitat de repeticions del número a cercar
    var qVegades = 0

    // Recorrem l'array dades buscant el número rebut com a paràmetre
    for (numero in dades) {
        if (numero == numeroABuscar) qVegades++
    }

    return qVegades
}

fun contarNumerosRepetidos(dades: Array<Int>): Int {
    // Declarem un map per emmagatzemar la freqüència de cada número
    val qVegadesMap = mutableMapOf<Int, Int>()

    // Contem la freqüència de cada número a l'array
    for (numero in dades) {
        val qVegades = qVegadesMap.getOrDefault(numero, 0)
        qVegadesMap[numero] = qVegades + 1
    }

    // Contem quants números tenen una freqüència major a 1 (estàn repetits)
    val qNumerosRepetits = qVegadesMap.values.count { it > 1 }

    return qNumerosRepetits
}

fun ordenarArray(dades: Array<Int>):Array<Int> {
    // Declarem l'array dadesOrdenat que és una còpia de l'array rebut, i que ens permetrà modificar els seus valors
    var dadesOrdenat = dades.copyOf()

    // Fem una ordenació pel mètode més senzill: bombolla o bubblesort
    for (i in 0 until dadesOrdenat.size-1){
        for (j in i+1 until dadesOrdenat.size){
            if (dadesOrdenat[i]>dadesOrdenat[j]){
                val aux = dadesOrdenat[i]
                dadesOrdenat[i] = dadesOrdenat[j]
                dadesOrdenat[j] = aux
            }
        }
    }

    return dadesOrdenat
}

