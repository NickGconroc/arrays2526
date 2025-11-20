package daw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoarEjercicios {

    private static Random ran = new Random(); // Mantengo el nombre del Random tal cual está
    private static Scanner tec = new Scanner(System.in); // Mantengo el nombre del Scanner tal cual está

    public static void main(String[] args) {
        // Ejercicio 1: Array de números aleatorios entre 1 y 5, y contar repeticiones
        System.out.println("Ejercicio 1: Array de números aleatorios entre 1 y 5");
        int maxValor = obtenerEntradaUsuario(); // Obtener el número que define el rango
        int[] arrayNumerosAleatorios = generarArrayAleatorio(maxValor); // Generar el array con números aleatorios
        contarRepeticiones(arrayNumerosAleatorios, maxValor); // Contar las repeticiones de cada número

        System.out.println("\n--- Fin del Ejercicio 1 ---\n");

        // Ejercicio 2: Copiar un array e invertirlo
        System.out.println("Ejercicio 2: Copiar e invertir un array");
        int[] arrayOriginal = {4, 5, 6, 7, 8}; // Array original para copiar e invertir
        int[] arrayCopia = copiarArray(arrayOriginal); // Copiar el array original
        System.out.println("Array copiado: " + Arrays.toString(arrayCopia));

        int[] arrayInvertido = invertirArray(arrayCopia); // Invertir el array copiado
        System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));

        System.out.println("\n--- Fin del Ejercicio 2 ---\n");
    }

    // Ejercicio 1: Preguntar al usuario un número entre 1 y 5
    public static int obtenerEntradaUsuario() {
        System.out.println("Dime un numero del 1 al 5 para rellenar el array");
        return tec.nextInt(); // Leemos el valor que introduce el usuario
    }

    // Ejercicio 1: Generar un array con números aleatorios entre 1 y el número dado por el usuario
    public static int[] generarArrayAleatorio(int maxValor) {
        int[] arrayAleatorio = new int[10]; // Creamos un array de 10 posiciones
        for (int i = 0; i < arrayAleatorio.length; i++) {
            int valorAleatorio = ran.nextInt(1, maxValor + 1); // Generamos un valor aleatorio entre 1 y 'maxValor'
            arrayAleatorio[i] = valorAleatorio;
            System.out.println(arrayAleatorio[i]); // Imprimimos el número generado
        }
        return arrayAleatorio;
    }

    // Ejercicio 1: Contar las repeticiones de cada número en el array
    public static void contarRepeticiones(int[] arrayAleatorio, int maxValor) {
        int[] contadorRepeticiones = new int[maxValor]; // Array para contar cuántas veces aparece cada número

        // Contamos cuántas veces se repite cada número en el array
        for (int i = 0; i < arrayAleatorio.length; i++) {
            contadorRepeticiones[arrayAleatorio[i] - 1]++; // Incrementamos el contador para el número encontrado
        }

        // Imprimimos el conteo de cada número
        for (int i = 0; i < contadorRepeticiones.length; i++) {
            System.out.println("El número " + (i + 1) + " se repite " + contadorRepeticiones[i] + " veces.");
        }
    }

    // Ejercicio 2: Copiar un array
    public static int[] copiarArray(int[] arrayAcopiar) {
        int[] arrayCopia = new int[arrayAcopiar.length]; // Creamos un nuevo array con el mismo tamaño
        for (int i = 0; i < arrayAcopiar.length; i++) {
            arrayCopia[i] = arrayAcopiar[i]; // Copiamos los valores del array original
        }
        return arrayCopia; // Devolvemos el array copiado
    }

    // Ejercicio 2: Invertir un array
    public static int[] invertirArray(int[] arrayAinvertir) {
        int[] arrayInvertido = new int[arrayAinvertir.length]; // Creamos un nuevo array para el array invertido
        for (int i = 0; i < arrayAinvertir.length; i++) {
            arrayInvertido[i] = arrayAinvertir[arrayAinvertir.length - 1 - i]; // Asignamos los elementos en orden invertido
        }
        return arrayInvertido; // Devolvemos el array invertido
    }
}