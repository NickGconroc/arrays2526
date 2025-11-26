package daw;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principaldeduplicadohechoenclase {

    public static void main(String[] args) {

        /* ....................................................................
           EJERCICIO 7 y 8
           - Generar un array de tamaño especificado con números aleatorios (1-30)
           - Eliminar duplicados del array generado
           .................................................................... */

        int tam = 0; // Tamaño del array que introducirá el usuario
        int[] arrayMain = null; // Variable para almacenar el array generado y poder usarla fuera del bucle
        boolean salir = false; // Controla el do-while para repetir si hay error en la entrada
        Scanner tec = new Scanner(System.in); // Scanner para leer entrada del usuario

        do {
            System.out.println("Introduce el tamaño del array (número positivo): ");

            try {
                tam = tec.nextInt(); // Leemos el tamaño del array introducido por el usuario

                // Llamamos a la función que genera el array con números aleatorios
                arrayMain = funcionesduplicadohechoenclase.generarArrayAleatorios(tam);

                // Mostramos el array generado correctamente
                System.out.println("Array generado: " + Arrays.toString(arrayMain));

                salir = true; // Salimos del do-while si todo ha ido bien

            } catch (IllegalArgumentException iae) {
                // Si el usuario introduce un número negativo o cero
                System.out.println("ERROR: El tamaño del array no puede ser negativo ni cero.");

            } catch (InputMismatchException ime) {
                // Si el usuario introduce texto en lugar de un número
                System.out.println("ERROR: Por favor, introduce un número entero válido.");
                tec.nextLine(); // Limpiamos el Scanner para la próxima lectura
            }

        } while (!salir);

        System.out.println("---------------------------");

        /* ....................................................................
           EJERCICIO 8
           - Eliminar duplicados del array generado
           - Mostramos al usuario el array sin duplicados
           .................................................................... */
        int[] arraySinDuplicados = funcionesduplicadohechoenclase.quitarDuplicados(arrayMain);
        System.out.println("Array sin duplicados: " + Arrays.toString(arraySinDuplicados));
    }
}
