package daw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoarEjercicios {
    public static void main(String[] args) {

        int respuesta = preguntaUsuario();
        int[] arrayFInal = arrayDel1al5(respuesta);
        arrayConteoNumeros(arrayFInal);

        int [] arrayOriginal = {4,5,6,7,8};

        int[] arraycopiado = Copiar(arrayOriginal);
        System.out.println(Arrays.toString(arraycopiado));

        int[] inversoo = copiaInvertida(arraycopiado);
        System.out.println(Arrays.toString(inversoo));

    }

    // Pedir al usuario meter en un array de 10 posiciones un numero del 1 al 5
    // Otra funcion a partir del array anterior(parametro) que devuelva otro array
    // contando los numeros que se repiten de cada uno

    private static Random ran = new Random(); // La hacemos privada para usar solo en esta CLASE (public class)
    private static Scanner tec = new Scanner(System.in);

    public static int preguntaUsuario() {
        int respuesta;
        System.out.println("DIme un numero del 1 al 5 para rellenar el array");
        respuesta = tec.nextInt();
        return respuesta;
    }

    // Creamos un array desde el 1 hasta al numero que diga el usuario, el array es
    // del tamaño [10] ya predefinido por el ejercicio
    public static int[] arrayDel1al5(int respuesta) {
        int[] arrayDel1al5 = new int[10];
        for (int i = 0; i < arrayDel1al5.length; i++) {
            int numeroAñadir = ran.nextInt(1, respuesta);
            arrayDel1al5[i] = numeroAñadir;
            System.out.println(arrayDel1al5[i]);

        }
        return arrayDel1al5;
    }

    public static int[] arrayConteoNumeros(int[] arrayDel1al5) {
        int[] arrayConteado = arrayDel1al5;
        for (int i = 0; i < arrayDel1al5.length; i++) {
            if (arrayDel1al5[i] == 1) {
                arrayConteado[0]++;
            }
            if (arrayDel1al5[i] == 2) {
                arrayConteado[1]++;
            }
            if (arrayDel1al5[i] == 3) {
                arrayConteado[2]++;
            }
            if (arrayDel1al5[i] == 4) {
                arrayConteado[3]++;
            }
            if (arrayDel1al5[i] == 4) {
                arrayConteado[4]++;
            }
        }
        System.out.println(Arrays.toString(arrayConteado));
        return arrayConteado;
    }

    //Hacer un array de numeros o letras, hacer una funcion Copiar que reciba el array y que haga una copia del array original
    //Hacer una funcion copiaINvertida()
    
    public static int[] Copiar(int[] aCOpiar){
        int[] arrayCopiado = new int[aCOpiar.length];
        for (int i = 0; i < aCOpiar.length; i++) {
            arrayCopiado[i] = aCOpiar[i];
        }
        

        return arrayCopiado;
    }

    public static int[] copiaInvertida(int[] copiado){
        int[] inverso = new int[copiado.length];
        int j = -1;
        for (int i = 0; i < copiado.length; i++) {
            copiado[j] = inverso[i];
            
        }

        return inverso;
    }
}
