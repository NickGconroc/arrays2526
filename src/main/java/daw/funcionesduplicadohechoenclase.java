package daw;

import java.util.Arrays;
import java.util.Random;

public class funcionesduplicadohechoenclase {
    // 7. Crear una funcion que devuelva un array de tamaño especificado en el
    // parametro con numero aleatorios entre 1 y 30
    // 8. Funcion que recibe un array de numeros 8array del paso 7) y Devuelve un
    // nuevo array sin duplicados.

    // Atributo de clase privado, accesible desde todos los metodos de esta clase
    // NO accesible desde otras clases
    private static Random ran = new Random(); // La hacemos privada para usar solo en esta CLASE (public class)

    // Funcion que recibe un array de numeros y devuelve un array sin duplicados
    public static int[] quitarDuplicados(int[] array) {
        int[] arrayFinal = null; // Este sera el Array final sin duplicados y sin ceros
        int[] arraySinDuplicados = new int[array.length]; // Este array tendra la misma longitud del array DEL
                                                          // PARAMETRO!!!

        // Recibo un array de numeros
        // Recorro el array original (el que viene por parametro)
        for (int i = 0; i < array.length; i++) {
            // Guardo el elemento en array sin duplicados si no está
            if(!esta(array[i], arraySinDuplicados)){
                arraySinDuplicados[i] = array[i];
            }
        }
        int contador = contarNumeros(arraySinDuplicados);
        //Crea el array para esa cantidad de numeros
        arrayFinal = new int[contador];

        //Contamos cuantos elementos distintos tiene el array
        int posicion = 0;
        for (int i : arraySinDuplicados) {
            if (i!=0){
                arrayFinal[posicion++] = i;
            }
        }
        return arrayFinal;
    }

    //Cuenta numeros distintos de cero
    public static int contarNumeros(int[] array){
        int contador = 0;
        for (int i : array){
            if (i!=0){
                contador++;
            }
        }

        return contador;
    }

    public static boolean esta(int numeroABuscar, int[] arrayDondeBuscar){   //COn esta funcion solamente sabremos si un numero esta o no esta
        for (int elemento :arrayDondeBuscar){                                       //dentro del array donde tiene que buscar
            if(numeroABuscar == elemento){
                return true;
            }
        }
        return false;
    }

    // Funcion que devuelve (generar el array y return)
    // crea un array de tamaño espeficiado con elementos entre 1 y 30
    // devolver la variable array
    // Si el parametro no es valido se genera una excepcion de tipo IllegalArgument
    public static int[] generarArrayAleatorios(int tam) { //

        // Si en examen dice Gestiona la excepcion, usamos un try catch
        // Si en examen dice otro usamos trow new
        // Generamos la excepcion
        if (tam <= 0) {
            throw new IllegalArgumentException("EL tamaño del array no puede ser <=0");
        }
        int[] array = new int[tam]; // Esto puede tener error porque si el usuario introduce un numero negativo
                                    // generaria el error NegativeArraySize

        // REcorro el array y en cada posicion asigno un num aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(1, 31);
        }
        return array;
    }

}
