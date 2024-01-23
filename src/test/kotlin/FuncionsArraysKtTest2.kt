import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

fun contarNumerosRepetidos(dades: Array<Int>): Int {
    // Utiliza un mapa mutable para almacenar la frecuencia de cada número en el array.
    val qVegadesMap = mutableMapOf<Int, Int>()

    // Calcula la frecuencia de cada número en el array.
    for (numero in dades) {
        val qVegades = qVegadesMap.getOrDefault(numero, 0)
        qVegadesMap[numero] = qVegades + 1
    }

    // Cuenta cuántos números tienen una frecuencia mayor a 1 (están repetidos).
    val qNumerosRepetits = qVegadesMap.values.count { it > 1 }

    return qNumerosRepetits
}

class FuncionsArraysKtTest2 {

    @Test
    // Verifica que la función cuente correctamente la cantidad de números repetidos en un array.
    fun testContarNumerosRepetidos_CasoBasico() {
        val dades = arrayOf(1, 2, 3, 4, 5, 1, 2, 1)
        val resultado = contarNumerosRepetidos(dades)
        assertEquals(2, resultado, "Debería haber dos números repetidos en el array.")
    }

    @Test
    // Verifica que la función devuelva 0 para un array sin números repetidos.
    fun testContarNumerosRepetidos_ArraySinRepetidos() {
        val dades = arrayOf(1, 2, 3, 4, 5)
        val resultado = contarNumerosRepetidos(dades)
        assertEquals(0, resultado, "No debería haber números repetidos en el array.")
    }

    @Test
    // Verifica que la función devuelva 0 para un array vacío.
    fun testContarNumerosRepetidos_CasoVacio() {
        val dades = emptyArray<Int>()
        val resultado = contarNumerosRepetidos(dades)
        assertNotEquals(1, resultado, "No debería haber repetición en un array vacío.")
    }

    @Test
    // Verifica que la función devuelva al menos un número repetido en un array.
    fun testContarNumerosRepetidos_NumeroRepetidoTrue() {
        val dades = arrayOf(1, 2, 3, 4, 5, 1, 2, 1)
        val resultado = contarNumerosRepetidos(dades)
        assertTrue(resultado > 0, "Debería haber al menos un número repetido en el array.")
    }
}
