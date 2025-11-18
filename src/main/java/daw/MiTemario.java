package daw;

import java.util.Arrays;

public class MiTemario {
    public static void main(String[] args) {

        //--------------------------------------------------------
        // Uso de .charAT

        String texto = "Hola Mundo";

        // Obtener el primer carácter
        char primeraLetra = texto.charAt(0);

        // Obtener el quinto carácter
        char quintaLetra = texto.charAt(4);

        System.out.println("Primer carácter: " + primeraLetra);
        System.out.println("Quinto carácter: " + quintaLetra);

        //--------------------------------------------------------
        
        //Uso de Arrays.sort  Para ordenar todos los arrays de menor a mayor

        int [] array = {4,7,1,9,0,45,3};
        Arrays.sort(array);
        System.out.println(Arrays.toString((array)));

        //Excepciones
        //Para Capturar y Gestionar, TRY CATCH
        //Para Lanzar/Generar, THROW (REPASAR ESTO)
        
        //NumberFormat
        //Inputmismatch
        //ArrayIndexoutofBound
        //NegativeArraySize
        //IllegalArgument

        //Arrays, String Double Int
        //Funciones, Public Static <- se llama firma a esto


    }
}
