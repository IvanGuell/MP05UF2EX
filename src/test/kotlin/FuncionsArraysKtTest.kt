import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

fun qVegadesNumero(dades: Array<Int>, numeroABuscar: Int): Int {
    var qVegades = 0
    for (numero in dades) {
        if (numero == numeroABuscar) qVegades++
    }
    return qVegades
}

class FuncionsArraysKtTest {

    @Test
    // Verifica que la función cuente correctamente las repeticiones de un número en un array no vacío.
    fun testQVegadesNumero_CasoBasico() {
        val dades = arrayOf(1, 2, 3, 4, 5, 1, 2, 1)
        val numeroABuscar = 1
        val resultado = qVegadesNumero(dades, numeroABuscar)
        assertEquals(3, resultado, "La cantidad de repeticiones para el número 1 debería ser 3.")
    }

    @Test
    // Verifica que la función devuelva 0 repeticiones para un número que no está en el array.
    fun testQVegadesNumero_NumeroNoEncontrado() {
        val dades = arrayOf(1, 2, 3, 4, 5)
        val numeroABuscar = 8
        val resultado = qVegadesNumero(dades, numeroABuscar)
        assertEquals(0, resultado, "El número 8 no debería estar presente en el array.")
    }

    @Test
    // Verifica que la función devuelva 0 repeticiones para un array nulo.
    fun testQVegadesNumero_CasoNulo() {
        val dades: Array<Int>? = null
        val numeroABuscar = 3
        val resultado = qVegadesNumero(dades ?: emptyArray(), numeroABuscar)
        assertTrue(resultado == 0, "No debería haber repeticiones en un array nulo.")
    }

    @Test
    // Verifica que la función devuelva 0 repeticiones para un array vacío.
    fun testQVegadesNumero_ArrayVacio() {
        val dades = emptyArray<Int>()
        val numeroABuscar = 5
        val resultado = qVegadesNumero(dades, numeroABuscar)
        assertNotEquals(1, resultado, "No debería haber repeticiones en un array vacío.")
    }
}
