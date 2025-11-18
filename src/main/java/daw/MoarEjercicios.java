package daw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoarEjercicios
 {
    public static void main(String[] args) {

        int respuesta = preguntaUsuario();
        Arrays.toString(arrayDel1al5(respuesta));
        Arrays.toString(arrayConteoNumeros(null));
        
      
    }

    //Pedir al usuario meter en un array de 10 posiciones un numero del 1 al 5
    //Otra funcion a partir del array anterior(parametro) que devuelva otro array 
    //contando los numeros que se repiten de cada uno

    private static Random ran = new Random(); // La hacemos privada para usar solo en esta CLASE (public class)
    private static Scanner tec = new Scanner(System.in);

    public static int preguntaUsuario(){
        int respuesta;
        System.out.println("Hasta que numero quieres que rellenemos el array?");
        respuesta = tec.nextInt();
        return respuesta;
    }

    public static int[] arrayDel1al5(int respuesta){
        int[] arrayDel1al5 = new int[respuesta];
        for (int i = 0; i < arrayDel1al5.length; i++) {
            int numeroAñadir = ran.nextInt(1, respuesta);
            arrayDel1al5[i] = numeroAñadir;
            System.out.println(arrayDel1al5[i]);
            
        }
        return arrayDel1al5;
    }

    public static int[] arrayConteoNumeros(int[] arrayDel1al5){
        int[] arrayConteoNumeros = null;
        int z = 0;
        int i  = 0;
        int j = arrayDel1al5.length -1;
        while (i < j) {
            if (arrayDel1al5[i] == arrayDel1al5[j]) {
                i++;
                arrayConteoNumeros[0] = i;
                
            }
            i++;
            j--;
        }
        return arrayConteoNumeros;
    }



}
