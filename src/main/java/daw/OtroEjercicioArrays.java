package daw;

public class OtroEjercicioArrays {
    public static void main(String[] args) {
        //Ejercicio:
        //Funcion que recibe un String, lo transformo a array de char y devuelve si es un palindromo (palabra que
        //se lee igual de izquierda a derecha e izquierda a derecha).
        //esPalindromo (String) es una funcion, creo array a partir de la palabra,
        // con un bucle voy comprobando que coincidan las letras por dos lados
        //Usando el array dentro de esta funcion decirme si es un palindromo
        //DOs indices que recorran uno de un lado y otro de otro
        //SE usa un bucle y dos indices

        esPalindromo("ORo");
    }
    public static boolean esPalindromo (String palabra){
        palabra = palabra.toLowerCase();
        char [] palabraaletras = palabra.toCharArray();
        int i = 0;
        int j = palabraaletras.length - 1;

       while (i < j) {
            if (palabraaletras[i] != palabraaletras[j]) {
                System.out.println("No es palindromo");
                return false; // Si alguna letra no coincide, no es palíndromo
                
            }
            i++;
            j--;
        }
        System.out.println("Es palindromo");
        return true;
    }
}
