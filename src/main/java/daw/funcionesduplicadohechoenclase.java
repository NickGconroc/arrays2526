package daw;

import java.util.Random;

public class funcionesduplicadohechoenclase {

    /* ....................................................................
       Atributo de clase
       - Random privado para generar números aleatorios
       - Solo accesible dentro de esta clase
       .................................................................... */
    private static Random ran = new Random();

    /* ....................................................................
       FUNCIÓN EJERCICIO 8
       quitarDuplicados(int[] array)
       - Recibe un array de números y devuelve un array nuevo sin duplicados
       - Explicación paso a paso:
         1) Creamos un array temporal del mismo tamaño que el original para ir almacenando
            los números únicos encontrados.
         2) Recorremos el array original y usamos la función 'esta' para verificar duplicados.
         3) Guardamos solo los elementos únicos en 'arraySinDuplicados'.
         4) Contamos cuántos elementos únicos tenemos (distintos de cero) con 'contarNumeros'.
         5) Creamos un array final con el tamaño exacto y copiamos los valores.
       .................................................................... */
    public static int[] quitarDuplicados(int[] array) {
        int[] arrayFinal; // Array que contendrá los números finales sin duplicados
        int[] arraySinDuplicados = new int[array.length]; // Array temporal para almacenar únicos

        // Recorremos cada elemento del array original
        for (int i = 0; i < array.length; i++) {
            if (!esta(array[i], arraySinDuplicados)) { // Si el número no está ya en el temporal
                arraySinDuplicados[i] = array[i]; // Guardamos el número
            }
        }

        // Contamos cuántos elementos únicos tenemos
        int contador = contarNumeros(arraySinDuplicados);

        // Creamos array final con el tamaño exacto de elementos únicos
        arrayFinal = new int[contador];

        int posicion = 0;
        for (int i : arraySinDuplicados) {
            if (i != 0) { // Solo copiamos valores distintos de cero
                arrayFinal[posicion++] = i;
            }
        }

        return arrayFinal; // Devolvemos el array sin duplicados
    }

    /* ....................................................................
       FUNCIÓN AUXILIAR
       contarNumeros(int[] array)
       - Cuenta cuántos números distintos de cero hay en el array
       .................................................................... */
    public static int contarNumeros(int[] array) {
        int contador = 0;
        for (int i : array) {
            if (i != 0) {
                contador++;
            }
        }
        return contador;
    }

    /* ....................................................................
       FUNCIÓN AUXILIAR
       esta(int numeroABuscar, int[] arrayDondeBuscar)
       - Devuelve true si el número está en el array, false si no está
       .................................................................... */
    public static boolean esta(int numeroABuscar, int[] arrayDondeBuscar) {
        for (int elemento : arrayDondeBuscar) {
            if (numeroABuscar == elemento) {
                return true; // Número encontrado
            }
        }
        return false; // Número no encontrado
    }

    /* ....................................................................
       FUNCIÓN EJERCICIO 7
       generarArrayAleatorios(int tam)
       - Genera un array de tamaño especificado con números aleatorios entre 1 y 30
       - Si el tamaño no es válido (<=0) lanza IllegalArgumentException
       .................................................................... */
    public static int[] generarArrayAleatorios(int tam) {
        if (tam <= 0) {
            throw new IllegalArgumentException("El tamaño del array no puede ser <=0");
        }

        int[] array = new int[tam]; // Creamos el array

        // Recorremos cada posición y asignamos un número aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(1, 31); // Números entre 1 y 30
        }

        return array; // Devolvemos el array generado
    }
}
