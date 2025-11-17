package daw;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principaldeduplicadohechoenclase {
    public static void main(String[] args) {
        int tam = 0;
        int[] arrayMain = null;  // Con esto inicializamos la variable para usarla fuera despues del do while!!!!
        boolean salir = false;
        Scanner tec = new Scanner(System.in);
        do{

            System.out.println("Introduce el tamaño del array: ");
            
            try{
                tam = tec.nextInt();                                                        //Podriamos hacer esto en otra funcion que controle el try catch y errores
                arrayMain = funcionesduplicadohechoenclase.generarArrayAleatorios(tam);
                System.out.println(Arrays.toString(arrayMain));     //y asi evitamos hacerlo en el Main
                salir = true;
            }catch (IllegalArgumentException iae){                                          //COn esta excepcion controlamos que el numero no sea negativo
                System.out.println("El tamaño del array no puede ser negativo");
                
            }catch(InputMismatchException ime){                                             //COn esta excepcion controlamos que no se 
                System.out.println("Por favor no pongas letras");                           //introduza texto en vez de numero
                tec.nextLine();  //Recordar que hay que limpiar el Scanner
              
            }
           
            
        }while (!salir);

        System.out.println(Arrays.toString(arrayMain)); 
        System.out.println("---------------------------");
        funcionesduplicadohechoenclase.quitarDuplicados(arrayMain);
        
    }

}
