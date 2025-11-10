package daw;

import java.util.Random;

public class EjerciciodeArrays {

    public static void main(String[] args) {

        // Sumar los elementos de un array y mostrar resultado
        // Media aritmetica de los numeros de un array
        // Contar numero de veces que aparece un numero en un array

        // Probamos en el main el ejercicio de la función de encontrarLetra
        char[] arrayLetras = { 'd', 't', 'p', 'r', 'e', 'q' };
        System.out.println("EL tamaño del array es " + arrayLetras.length);
        char letraBuscar = 'p';

        int posicion = encontrarLetra(letraBuscar, arrayLetras);
        System.out.println("La posicion es " + posicion);

        // Probamos en el main el ejercicio de la función de valorMaximodeArray
        int[] arrayNumeros = { 5, 7, 8, 9, 6 };
        int maximo = valorMaximodeArray(arrayNumeros);
        System.out.println("EL valor maximo es " + maximo);

        // Probamos en el main el ejercicio de la función de valorMinimodeArray
        int[] arrayNum = { 5, 7, 8, 9, 6 };
        int minimo = valorMinimodeArray(arrayNum);
        System.out.println("El valor minimo es " + minimo);

        // Probamos en el main el ejercicio de la función de multiplicaNumeroporArray
        double[] arrayNume = { 4.5, 7.8, 9.6, 5.4 };
        double numeropamulti = 7.5;
        double multiplicacion = multiplicaNumeroporArray(numeropamulti, arrayNume);

        // Probamos en el main el ejercicio de la función de multiplicaNumeroporArray
        char[] ejercicio = letrasAleatorias(5);
        System.out.println(ejercicio);

        // foreach. Recorre el array completo. NO usa indices. En cada iteracion coge el
        // elemento que toca y lo guarda en la variable que
        // se indica en el bucle
        // INternamente usa un objeto de tipo iterator
        // La variable de la parte izquierda es del tipo que contiene el array
        // En la parte derecha ponemos la estructura de datos ( el array a recorrer)
        // EL foreach sirve para leer datos no para modificaciones

        char[] arrayLEtrasforeach = { 'd', 't', 'p', 'q' };
        for (char letrita : arrayLEtrasforeach) {
            // primera iteracion -> letrita <-'d'
            // segunda iteracion -> letrita <-'t'
            // tercera iteracion-> letrita <-'p'
            // ultima interacion -> letrita <-'q'
            System.out.println("El valor de la letra es " + letrita);

        }

    }

    // Funcion que recibe(parametros) un valor de char y un array de char y
    // devuelve(return) la posicion (int)
    // en la que se encuentra el char que se pasa como parametro o -1 si no esta
    // em el array1
    // Probamos en el main esta función

    public static int encontrarLetra(char letra, char[] array) {
        // RECORREMOS EL ARRAY CON FOR SIEMPRE
        for (int i = 0; i < array.length; i++) {
            if (letra == array[i]) {
                return i;
            }
        }
        return -1;

    }
    // Más Ejercicios

    // 1. Funcion que reciba un array de int y devuelva el valor maximo

    public static int valorMaximodeArray(int[] array) {
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];

            }
        }
        return mayor;
    }

    // 2. Funcion que reciba un array de int y devuelve el valor minimo
    public static int valorMinimodeArray(int[] array) {
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];

            }
        }
        return menor;
    }

    // 3. Funcion que reciba un array de double y un numero y multiplica
    // todos los elementos del array por ese numero. Muestra el array en el main
    // antes
    public static double multiplicaNumeroporArray(double numero, double[] array) {
        double resultado = 0;
        for (int i = 0; i < array.length; i++) {
            resultado = array[i] * numero;
            System.out.println("La " + i + " multiplicacion es " + resultado);
        }

        return resultado;
    }
    // 4. Funcion que recibe un tamaño y genera un array de letras aleatorias (entre
    // a y z) del tamaño especificado. La funcion devuelve el array generado.

    public static char[] letrasAleatorias(int numero) {
        Random ran = new Random();
        char[] letras = new char[numero];
        for (int i = 0; i < numero; i++) {
            // Genera una letra aleatoria entre 'a' y 'z'
            letras[i] = (char) ('a' + ran.nextInt(26));
        }

        return letras;
    }

    // 5.Funcion que recibe dos arrays de String y devuelve si son iguales o no.
    // Dos arrays son iguales si tienen mismo tamaño y los elementos de la misma
    // posicion son iguales

}
