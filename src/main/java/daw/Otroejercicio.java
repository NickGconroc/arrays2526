package daw;

import java.util.Random;
import java.util.Scanner;

public class Otroejercicio {

    // 7. Crear una funcion que devuelva un array de tamaño especificado en el
    // parametro con numero aleatorios entre 1 y 30
    // 8. Funcion que recibe un array de numeros 8array del paso 7) y Devuelve un
    // nuevo array sin duplicados.
    public static void main(String[] args) {

        arrayAleatorio(15);
        int numerodeseado = 15;

    }

    public static int[] quitarDuplicado(int[] arrayaleat) {
        int[] arraySinDuplicado = new int[8];
        for (int i = 0; i < arrayaleat.length; i++){
            if (arrayaleat[i] != arrayaleat[i++]) {
                 arraySinDuplicado[i] = arrayaleat[i];
                
            }
        }

            return arraySinDuplicado;

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

}