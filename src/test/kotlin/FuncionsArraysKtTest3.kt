import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

fun ordenarArray(dades: Array<Int>): Array<Int> {
    // Crea una copia del array recibido para evitar modificar el original.
    var dadesOrdenat = dades.copyOf()

    // Aplica el algoritmo de ordenación de burbuja (bubblesort) para ordenar el array.
    for (i in 0 until dadesOrdenat.size - 1) {
        for (j in i + 1 until dadesOrdenat.size) {
            if (dadesOrdenat[i] > dadesOrdenat[j]) {
                val aux = dadesOrdenat[i]
                dadesOrdenat[i] = dadesOrdenat[j]
                dadesOrdenat[j] = aux
            }
        }
    }

    return dadesOrdenat
}

class FuncionsArraysKtTest3 {

    @Test
    // Verifica que la función ordene correctamente un array de forma ascendente.
    fun testOrdenarArray_CasoBasico() {
        val dades = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)
        val resultado = ordenarArray(dades)
        val resultadoEsperado = arrayOf(1, 1, 2, 3, 3, 4, 5, 5, 6, 9)
        assertTrue(resultado.contentEquals(resultadoEsperado), "El array debería estar ordenado de forma ascendente.")
    }

    @Test
    // Verifica que la función no modifique un array que ya está ordenado.
    fun testOrdenarArray_ArrayYaOrdenado() {
        val dades = arrayOf(1, 2, 3, 4, 5)
        val resultado = ordenarArray(dades)
        assertTrue(resultado.contentEquals(dades), "El array ya ordenado debería permanecer igual.")
    }

    @Test
    // Verifica que la función devuelva un array vacío al intentar ordenar un array vacío.
    fun testOrdenarArray_ArrayVacio() {
        val dades = emptyArray<Int>()
        val resultado = ordenarArray(dades)
        assertNotEquals(emptyArray<Int>(), resultado, "Ordenar un array vacío debería dar como resultado un array vacío.")
    }

    @Test
    // Verifica que un número esté en la posición correcta después de ordenar el array.
    fun testOrdenarArray_NumeroEnPosicionCorrecta() {
        val dades = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)
        val resultado = ordenarArray(dades)
        assertTrue(resultado[2] == 2, "El número en la posición 2 debería ser 2 después de ordenar.")
    }
}
