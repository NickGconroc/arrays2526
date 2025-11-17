package daw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Otroejercicio {

    // 7. Crear una funcion que devuelva un array de tamaño especificado en el
    // parametro con numero aleatorios entre 1 y 30
    // 8. Funcion que recibe un array de numeros 8array del paso 7) y Devuelve un
    // nuevo array sin duplicados.
    public static void main(String[] args) {

        // Creamos el array para usar la funcion arrayAleatorio con el parametro del
        // numero de
        // numeros que queremos que tenga
        int[] arrayaleatorioo = arrayAleatorio(10);

        // esta forma es la incorrecta de imprimir un arra
        System.out.println(arrayaleatorioo);
        // La dos formas correctas de imprimir un array son
        // 1. usando Arrays.toString
        System.out.println(Arrays.toString(arrayaleatorioo));
        // 2. con un for
        for (int i = 0; i < arrayaleatorioo.length; i++) {
            System.out.println(arrayaleatorioo[i]);
        }

        // Creando otro array para crear un array que asi
        // Quitamos los duplicados llamando a la función
        int[] arraySinDuplicados = quitarDuplicado(arrayaleatorioo);

        // Mostramos el array resultante sin duplicados
        System.out.println("Array sin duplicados:");
        System.out.println(Arrays.toString(arraySinDuplicados));
        for (int j = 0; j < arraySinDuplicados.length; j++) {
            System.out.println(arraySinDuplicados[j]);
        }

    }

    public static int[] arrayAleatorio(int numerodeseado) {
        Random ran = new Random();
        int[] arrayaleat = new int[numerodeseado];

        for (int i = 0; i < arrayaleat.length; i++) {
            int numeroAñadir = ran.nextInt(31);
            arrayaleat[i] = numeroAñadir;
            System.out.println(arrayaleat[i]);

        }

        return arrayaleat;
    }

    public static int[] quitarDuplicado(int[] arrayaleat) {
        // Creamos un array auxiliar del mismo tamaño que el original
        // (por si todos los números fueran diferentes)
        int[] temporal = new int[arrayaleat.length];

        // contadorUnicos indicará cuántos números únicos llevamos guardados
        int contadorUnicos = 0;

        // Recorremos todos los elementos del array original
        for (int i = 0; i < arrayaleat.length; i++) {
            int numeroActual = arrayaleat[i];
            boolean repetido = false; // bandera para saber si el número ya estaba guardado

            // Segundo bucle: comprobamos si el número actual ya existe en el array temporal
            for (int j = 0; j < contadorUnicos; j++) {
                if (temporal[j] == numeroActual) {
                    // Si encontramos el mismo número, marcamos como repetido
                    repetido = true;
                    break; // salimos del bucle, ya no hace falta seguir buscando
                }
            }

            // Si el número NO está repetido, lo guardamos en el array temporal
            if (!repetido) {
                temporal[contadorUnicos] = numeroActual; // guardamos el número único
                contadorUnicos++; // aumentamos el contador de elementos únicos
            }
        }

        // Ahora sabemos cuántos números únicos tenemos (contadorUnicos)
        // Creamos un nuevo array con ese tamaño exacto
        int[] arraySinDuplicado = new int[contadorUnicos];

        // Copiamos los elementos únicos del array temporal al definitivo
        for (int i = 0; i < contadorUnicos; i++) {
            arraySinDuplicado[i] = temporal[i];
        }

        // Devolvemos el array sin duplicados
        return arraySinDuplicado;
    }
}
