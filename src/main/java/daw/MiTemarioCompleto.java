package daw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MiTemarioCompleto {

    private static Random ran = new Random();
    private static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        //--------------------------------------------------------
        // Uso de .charAt (no enumerado)
        String texto = "Hola Mundo";
        char primeraLetra = texto.charAt(0);
        char quintaLetra = texto.charAt(4);
        System.out.println("Primer carácter: " + primeraLetra);
        System.out.println("Quinto carácter: " + quintaLetra);

        //--------------------------------------------------------
        // Arrays.sort (no enumerado)
        int[] arraySort = {4,7,1,9,0,45,3};
        Arrays.sort(arraySort);
        System.out.println("Array ordenado: " + Arrays.toString(arraySort));

        //--------------------------------------------------------
        // FUNCION 1: Encontrar letra
        char[] letras = {'a','b','c','d'};
        System.out.println("FUNCIÓN 1 PRUEBA: posición de 'c' = " + encontrarLetra('c', letras));

        //--------------------------------------------------------
        // FUNCION 2: Valor máximo
        int[] nums = {5,3,8,2};
        System.out.println("FUNCIÓN 2 PRUEBA: máximo = " + valorMaximoArray(nums));

        //--------------------------------------------------------
        // FUNCION 3: Valor mínimo
        System.out.println("FUNCIÓN 3 PRUEBA: mínimo = " + valorMinimoArray(nums));

        //--------------------------------------------------------
        // FUNCION 4: Multiplicar array
        double[] arrDouble = {2.5,3.0,4.5};
        System.out.println("FUNCIÓN 4 PRUEBA: última multiplicación = " + multiplicarArray(2, arrDouble));

        //--------------------------------------------------------
        // FUNCION 5: Letras aleatorias
        char[] letrasAleat = letrasAleatorias(5);
        System.out.println("FUNCIÓN 5 PRUEBA: " + Arrays.toString(letrasAleat));

        //--------------------------------------------------------
        // FUNCION 6: Comparar arrays de String
        String[] a1 = {"hola","mundo"}, a2 = {"hola","mundo"}, a3 = {"hola","java"};
        System.out.println("FUNCIÓN 6 PRUEBA: a1 y a2 iguales = " + compararArraysString(a1,a2));
        System.out.println("FUNCIÓN 6 PRUEBA: a1 y a3 iguales = " + compararArraysString(a1,a3));

        //--------------------------------------------------------
        // FUNCION 7: Contar pares
        int[] arrPares = {1,2,3,4,5,6};
        System.out.println("FUNCIÓN 7 PRUEBA: cantidad de pares = " + contarPares(arrPares));

        //--------------------------------------------------------
        // FUNCION 8: Contar impares
        System.out.println("FUNCIÓN 8 PRUEBA: cantidad de impares = " + contarImpares(arrPares));

        //--------------------------------------------------------
        // FUNCION 9: Sumar todos los elementos
        System.out.println("FUNCIÓN 9 PRUEBA: suma = " + sumarArray(arrPares));

        //--------------------------------------------------------
        // FUNCION 10: Calcular media
        System.out.println("FUNCIÓN 10 PRUEBA: media = " + mediaArray(arrPares));

        //--------------------------------------------------------
        // FUNCION 11: Buscar múltiplos de 3
        System.out.println("FUNCIÓN 11 PRUEBA: múltiplos de 3 = " + Arrays.toString(buscarMultiplos(arrPares,3)));

        //--------------------------------------------------------
        // FUNCION 12: Revertir array in situ
        int[] arrRev = {1,2,3,4,5};
        revertirArrayInSitu(arrRev);
        System.out.println("FUNCIÓN 12 PRUEBA: invertido = " + Arrays.toString(arrRev));

        //--------------------------------------------------------
        // FUNCION 13: Mezclar arrays
        int[] aMix = {1,3}, bMix = {2,4};
        System.out.println("FUNCIÓN 13 PRUEBA: mezclado = " + Arrays.toString(mezclarArrays(aMix,bMix)));

        //--------------------------------------------------------
        // FUNCION 14: Generar array aleatorio
        System.out.println("FUNCIÓN 14 PRUEBA: " + Arrays.toString(generarArrayAleatorio(5,1,10)));

        //--------------------------------------------------------
        // FUNCION 15: Buscar mayor con condición
        int[] arrCond = {2,6,3,9,1};
        System.out.println("FUNCIÓN 15 PRUEBA: mayor que 5 = " + buscarMayorConCondicion(arrCond,5));

        //--------------------------------------------------------
        // FUNCION 16: Buscar menor con condición
        System.out.println("FUNCIÓN 16 PRUEBA: menor que 5 = " + buscarMenorConCondicion(arrCond,5));

        //--------------------------------------------------------
        // FUNCION 17: Encontrar subarray/secuencia
        int[] arrSec = {1,2,3,4,5,6};
        int[] sub = {3,4,5};
        System.out.println("FUNCIÓN 17 PRUEBA: subarray existe = " + contieneSubarray(arrSec,sub));

        //--------------------------------------------------------
        // FUNCION 18: Buscar todos índices de un elemento
        int[] arrIdx = {1,2,3,2,4};
        System.out.println("FUNCIÓN 18 PRUEBA: índices de 2 = " + Arrays.toString(buscarTodosIndices(arrIdx,2)));

        //--------------------------------------------------------
        // FUNCION 19: Reemplazar elementos
        int[] arrRep = {1,2,3,2};
        reemplazarElemento(arrRep,2,9);
        System.out.println("FUNCIÓN 19 PRUEBA: reemplazado 2 por 9 = " + Arrays.toString(arrRep));

        //--------------------------------------------------------
        // FUNCION 20: Copiar array parcial
        int[] arrC = {1,2,3,4,5};
        System.out.println("FUNCIÓN 20 PRUEBA: copiar índices 1-3 = " + Arrays.toString(copiarArrayParcial(arrC,1,3)));

        //--------------------------------------------------------
        // FUNCION 21: Contar repeticiones
        int[] arrRepCont = {1,2,1,3,2,1};
        System.out.println("FUNCIÓN 21 PRUEBA: repeticiones de 1 = " + contarRepeticiones(arrRepCont,1));

        //--------------------------------------------------------
        // EJEMPLO TRY CATCH
        try{
            int x = 5/0; // Provoca ArithmeticException
        }catch(ArithmeticException e){
            System.out.println("Excepción capturada: " + e);
        }

        //--------------------------------------------------------
        // EJEMPLO THROW
        try{
            lanzarExcepcion(-5);
        }catch(IllegalArgumentException e){
            System.out.println("Excepción generada: " + e.getMessage());
        }
    }

    //--------------------------------------------------------
    // FUNCIONES

    // F1: Encontrar letra en array de chars
    public static int encontrarLetra(char letra,char[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==letra){
                return i;
            }
        }
        return -1;
    }

    // F2: Valor máximo del array
    public static int valorMaximoArray(int[] arr){
        int max = arr[0];
        for(int n : arr){
            if(n>max) max=n;
        }
        return max;
    }

    // F3: Valor mínimo del array
    public static int valorMinimoArray(int[] arr){
        int min = arr[0];
        for(int n : arr){
            if(n<min) min=n;
        }
        return min;
    }

    // F4: Multiplicar array por un número
    public static double multiplicarArray(double n,double[] arr){
        double res = 0;
        for(double x : arr){
            res = x*n;
        }
        return res;
    }

    // F5: Letras aleatorias
    public static char[] letrasAleatorias(int n){
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i]=(char)('a'+ran.nextInt(26));
        }
        return arr;
    }

    // F6: Comparar arrays de String
    public static boolean compararArraysString(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }

    // F7: Contar pares
    public static int contarPares(int[] arr){
        int cont=0;
        for(int n:arr){
            if(n%2==0) cont++;
        }
        return cont;
    }

    // F8: Contar impares
    public static int contarImpares(int[] arr){
        int cont=0;
        for(int n:arr){
            if(n%2!=0) cont++;
        }
        return cont;
    }

    // F9: Sumar todos los elementos
    public static int sumarArray(int[] arr){
        int suma=0;
        for(int n:arr) suma+=n;
        return suma;
    }

    // F10: Calcular media
    public static double mediaArray(int[] arr){
        return sumarArray(arr)/(double)arr.length;
    }

    // F11: Buscar múltiplos de un número
    public static int[] buscarMultiplos(int[] arr,int m){
        return Arrays.stream(arr).filter(x->x%m==0).toArray();
    }

    // F12: Revertir array in situ
    public static void revertirArrayInSitu(int[] arr){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }

    // F13: Mezclar arrays
    public static int[] mezclarArrays(int[] a,int[] b){
        int[] res = new int[a.length+b.length];
        System.arraycopy(a,0,res,0,a.length);
        System.arraycopy(b,0,res,a.length,b.length);
        return res;
    }

    // F14: Generar array aleatorio dentro de un rango
    public static int[] generarArrayAleatorio(int tam,int min,int max){
        int[] arr = new int[tam];
        for(int i=0;i<tam;i++){
            arr[i]=ran.nextInt(max-min+1)+min;
        }
        return arr;
    }

    // F15: Buscar mayor con condición
    public static int buscarMayorConCondicion(int[] arr,int limite){
        int max=Integer.MIN_VALUE;
        for(int n:arr) if(n>limite && n>max) max=n;
        return max==Integer.MIN_VALUE?-1:max;
    }

    // F16: Buscar menor con condición
    public static int buscarMenorConCondicion(int[] arr,int limite){
        int min=Integer.MAX_VALUE;
        for(int n:arr) if(n<limite && n<min) min=n;
        return min==Integer.MAX_VALUE?-1:min;
    }

    // F17: Comprobar subarray
    public static boolean contieneSubarray(int[] arr,int[] sub){
        for(int i=0;i<=arr.length-sub.length;i++){
            boolean ok=true;
            for(int j=0;j<sub.length;j++){
                if(arr[i+j]!=sub[j]) ok=false;
            }
            if(ok) return true;
        }
        return false;
    }

    // F18: Buscar todos los índices de un elemento
    public static int[] buscarTodosIndices(int[] arr,int val){
        int count=(int)Arrays.stream(arr).filter(x->x==val).count();
        int[] res=new int[count];
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]==val) res[j++]=i;
        }
        return res;
    }

    // F19: Reemplazar elementos específicos
    public static void reemplazarElemento(int[] arr,int viejo,int nuevo){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==viejo) arr[i]=nuevo;
        }
    }

    // F20: Copiar array parcial
    public static int[] copiarArrayParcial(int[] arr,int inicio,int fin){
        return Arrays.copyOfRange(arr,inicio,fin+1);
    }

    // F21: Contar repeticiones de un elemento
    public static int contarRepeticiones(int[] arr,int val){
        int cont=0;
        for(int n:arr) if(n==val) cont++;
        return cont;
    }

    // EJEMPLO THROW
    public static void lanzarExcepcion(int val){
        if(val<0) throw new IllegalArgumentException("Valor negativo: "+val);
    }
}
