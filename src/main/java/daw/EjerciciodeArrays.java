package daw;

import java.util.Random;

public class EjerciciodeArrays {

    public static void main(String[] args) {

        /* ....................................................................
           EJERCICIO 1 (FUNCIÓN 1)
           Buscar una letra en un array de chars y devolver su posición (ó -1).
           .................................................................... */

        char[] arrayLetras = { 'd', 't', 'p', 'r', 'e', 'q' };
        System.out.println("MAIN -> PRUEBA FUNCIÓN 1: buscar letra en array (ejercicio 1)");
        System.out.println("El tamaño del array (número de elementos) es " + arrayLetras.length);
        // NOTA: "tamaño del array" significa cuántas casillas (posiciones) tiene,
        //       por ejemplo arrayLetras.length == 6 indica posiciones 0..5.

        char letraBuscar = 'p';

        // Probamos FUNCIÓN 1:
        int posicion = encontrarLetra(letraBuscar, arrayLetras);
        System.out.println("La posición de la letra buscada ('" + letraBuscar + "') es " + posicion);
        // Si devuelve -1 => la letra NO está en el array.
        System.out.println("....................................................................\n");



        /* ....................................................................
           EJERCICIO 2 (FUNCIÓN 2)
           Obtener el valor máximo de un array de enteros.
           .................................................................... */

        int[] arrayNumeros = { 5, 7, 8, 9, 6 };
        System.out.println("MAIN -> PRUEBA FUNCIÓN 2: valor máximo en array (ejercicio 2)");

        // Probamos FUNCIÓN 2:
        int maximo = valorMaximodeArray(arrayNumeros);
        System.out.println("El valor máximo encontrado en el array es " + maximo);
        // Explicación: se devuelve el mayor número que aparece en el array.
        System.out.println("....................................................................\n");



        /* ....................................................................
           EJERCICIO 3 (FUNCIÓN 3)
           Obtener el valor mínimo de un array de enteros.
           .................................................................... */

        int[] arrayNum = { 5, 7, 8, 9, 6 };
        System.out.println("MAIN -> PRUEBA FUNCIÓN 3: valor mínimo en array (ejercicio 3)");

        // Probamos FUNCIÓN 3:
        int minimo = valorMinimodeArray(arrayNum);
        System.out.println("El valor mínimo encontrado en el array es " + minimo);
        // Explicación: se devuelve el menor número que aparece en el array.
        System.out.println("....................................................................\n");



        /* ....................................................................
           EJERCICIO 4 (FUNCIÓN 4)
           Multiplicar todos los elementos de un array de doubles por un número.
           .................................................................... */

        double[] arrayNume = { 4.5, 7.8, 9.6, 5.4 };
        double numeropamulti = 7.5;
        System.out.println("MAIN -> PRUEBA FUNCIÓN 4: multiplicar array por número (ejercicio 4)");

        // Probamos FUNCIÓN 4:
        double multiplicacion = multiplicaNumeroporArray(numeropamulti, arrayNume);
        // ATENCIÓN: esta versión imprime cada resultado y devuelve el último resultado.
        // Si quisieras reutilizar los valores multiplicados **en código**, lo correcto sería
        // devolver un array con los valores modificados en lugar de un simple double.
        System.out.println("La última multiplicación calculada (valor devuelto) es " + multiplicacion);
        System.out.println("....................................................................\n");



        /* ....................................................................
           EJERCICIO 5 (FUNCIÓN 5)
           Generar un array de letras aleatorias entre 'a' y 'z'.
           .................................................................... */

        System.out.println("MAIN -> PRUEBA FUNCIÓN 5: generar letras aleatorias (ejercicio 5)");
        // Probamos FUNCIÓN 5:
        char[] ejercicio = letrasAleatorias(5);
        // System.out.println(ejercicio) imprime la representación del array de caracteres.
        System.out.println("Array de letras aleatorias (longitud solicitada = 5): " + String.valueOf(ejercicio));
        System.out.println("....................................................................\n");



        /* ....................................................................
           EXPLICACIÓN DETALLADA DEL BUCLE FOREACH (NO ES UNA FUNCIÓN)
           .................................................................... */

        // Foreach (for-each) es una forma de recorrer todos los elementos de una colección
        // (aquí un array) sin manejar explícitamente los índices.
        // Sintaxis básica: for (Tipo elementoActual : array) { ... }
        //
        // - "Tipo elementoActual" es el tipo de dato que contiene el array (ej. char).
        // - "elementoActual" es una variable temporal que en cada iteración contiene la
        //   copia del valor del elemento actual del array.
        // - "array" es la estructura que queremos recorrer (ej. arrayLEtrasforeach).
        //
        // Características importantes y diferencias con for clásico:
        // 1) Foreach recorre **todos** los elementos desde el primero hasta el último.
        // 2) No tienes acceso directo al índice (i). Si necesitas el índice, usa for clásico.
        // 3) Foreach está pensado para **leer** datos. No se recomienda modificar
        //    elementos del array dentro del foreach (no puedes reasignar al elemento en
        //    el array original usando la variable del foreach).
        // 4) Internamente actúa como un iterador: toma el elemento 0, luego 1, luego 2...
        //
        // Ejemplo con comentarios muy explícitos:

        char[] arrayLEtrasforeach = { 'd', 't', 'p', 'q' };
        System.out.println("EJEMPLO FOREACH -> recorrer arrayLEtrasforeach");
        // Iteración 1: elementoActual = 'd'  (equivalente a arrayLEtrasforeach[0])
        // Iteración 2: elementoActual = 't'  (equivalente a arrayLEtrasforeach[1])
        // Iteración 3: elementoActual = 'p'  (equivalente a arrayLEtrasforeach[2])
        // Iteración 4: elementoActual = 'q'  (equivalente a arrayLEtrasforeach[3])
        for (char letrita : arrayLEtrasforeach) {
            // En cada vuelta "letrita" contiene el valor de la casilla actual del array.
            // Si intentas hacer letrita = 'z'; eso cambia la copia local "letrita", NO
            // cambia el contenido de arrayLEtrasforeach[i]. Por eso no sirve para modificar.
            System.out.println("Foreach -> valor actual = " + letrita);
        }
        System.out.println("....................................................................\n");



        /* ....................................................................
           EJERCICIO 6 (FUNCIÓN 6)
           Comparar dos arrays de String y determinar si son exactamente iguales.
           .................................................................... */

        System.out.println("MAIN -> PRUEBA FUNCIÓN 6: comparar arrays de Strings (ejercicio 6)");

        String[] arrayA = { "hola", "que", "tal" };
        String[] arrayB = { "hola", "que", "tal" };
        String[] arrayC = { "hola", "que", "bien" };

        // Probamos FUNCIÓN 6:
        boolean igualesAB = compararArraysString(arrayA, arrayB);
        System.out.println("¿ArrayA y ArrayB son iguales? " + igualesAB);
        // Explicación: true significa que:
        //  - tienen el mismo número de elementos (misma longitud)
        //  - y para cada posición i, arrayA[i].equals(arrayB[i]) devuelve true

        // === AÑADIDO: Mensaje claro para el usuario según el resultado (sin tocar nada más) ===
        if (igualesAB) {
            System.out.println("Resultado A-B: Sí, sí son iguales.");
        } else {
            System.out.println("Resultado A-B: No, no son iguales.");
        }
        // ===================================================================================

        boolean igualesAC = compararArraysString(arrayA, arrayC);
        System.out.println("¿ArrayA y ArrayC son iguales? " + igualesAC);
        // Explicación: false significa que en alguna posición i los Strings NO coinciden.

        // === AÑADIDO: Mensaje claro para el usuario según el resultado (sin tocar nada más) ===
        if (igualesAC) {
            System.out.println("Resultado A-C: Sí, sí son iguales.");
        } else {
            System.out.println("Resultado A-C: No, no son iguales.");
        }
        // ===================================================================================

        System.out.println("....................................................................\n");

    } // FIN DEL MAIN



    /* ....................................................................
       FUNCIÓN 1
       encontrarLetra(char letra, char[] array)
       - Objetivo: buscar la primera aparición de 'letra' dentro de 'array'.
       - Parámetros:
           letra: el carácter que queremos encontrar.
           array: el array de chars donde buscamos.
       - Proceso:
           1) Recorremos el array desde la posición 0 hasta la posición length-1.
           2) En cada posición i comparamos array[i] con letra.
           3) Si coinciden devolvemos i (la posición encontrada).
           4) Si terminamos el bucle sin encontrarla, devolvemos -1 (indicador de "no encontrado").
       - Valores devueltos:
           >=0: índice (posición) de la primera coincidencia.
           -1: la letra no está en el array.
       - Supuesto: array puede estar vacío; en ese caso el for no itera y devolvemos -1.
       .................................................................... */

    public static int encontrarLetra(char letra, char[] array) {
        // Recorrer usando índice para poder devolver la posición encontrada
        for (int i = 0; i < array.length; i++) {
            // Comparamos el carácter en la posición i con la letra buscada
            if (letra == array[i]) {
                // Si coinciden, devolvemos inmediatamente la posición i
                return i;
            }
        }
        // Si nunca hemos devuelto una posición, significa que no existe la letra en el array
        return -1;
    }



    /* ....................................................................
       FUNCIÓN 2
       valorMaximodeArray(int[] array)
       - Objetivo: devolver el mayor valor entero que aparece en 'array'.
       - Parámetros: array de enteros (int[]).
       - Proceso:
           1) Suponemos inicialmente que el mayor es array[0].
           2) Recorremos todas las posiciones i (0..length-1).
           3) Si array[i] > mayor entonces actualizamos mayor = array[i].
           4) Al terminar, devolvemos 'mayor'.
       - Nota importante: aquí se asume que el array tiene al menos 1 elemento.
         Si el array pudiera ser vacío deberíamos comprobar array.length == 0 y decidir
         qué devolver (por ejemplo lanzar excepción o devolver Integer.MIN_VALUE).
       .................................................................... */

    public static int valorMaximodeArray(int[] array) {
        // Tomamos el primer elemento como referencia inicial
        int mayor = array[0];

        // Recorremos desde 0 para que el comentario del bucle sea didáctico;
        // también podríamos empezar en 1 porque ya consideramos array[0].
        for (int i = 0; i < array.length; i++) {
            // Si encontramos un valor mayor que el actual 'mayor', lo reemplazamos
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        // Devolvemos el valor máximo encontrado
        return mayor;
    }



    /* ....................................................................
       FUNCIÓN 3
       valorMinimodeArray(int[] array)
       - Objetivo: devolver el menor valor entero que aparece en 'array'.
       - Proceso idéntico al del máximo, pero comparando < en lugar de >.
       - Supuesto: array tiene al menos 1 elemento.
       .................................................................... */

    public static int valorMinimodeArray(int[] array) {
        int menor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }



    /* ....................................................................
       FUNCIÓN 4
       multiplicaNumeroporArray(double numero, double[] array)
       - Objetivo: multiplicar cada elemento del array por 'numero' e imprimir
                  cada resultado.
       - Parámetros:
           numero: el factor por el que multiplicar cada elemento.
           array: array de doubles cuyos elementos vamos a multiplicar.
       - Proceso:
           1) Recorremos cada posición i del array.
           2) Calculamos resultado = array[i] * numero.
           3) Imprimimos el resultado de la posición i en consola.
       - Valor devuelto:
           Devuelve el último resultado calculado (valor del último elemento multiplicado).
           NOTA: si quieres conservar todos los resultados para usarlos luego,
                 es mejor devolver un nuevo array con los valores multiplicados.
       .................................................................... */

    public static double multiplicaNumeroporArray(double numero, double[] array) {
        double resultado = 0;

        for (int i = 0; i < array.length; i++) {
            resultado = array[i] * numero; // cálculo para la posición i
            // mostramos en consola la multiplicación realizada para la posición i
            System.out.println("La multiplicación del índice " + i + " (valor "
                               + array[i] + " * " + numero + ") es " + resultado);
        }

        // Devolvemos el último resultado calculado (correspondiente a array[array.length-1])
        return resultado;
    }



    /* ....................................................................
       FUNCIÓN 5
       letrasAleatorias(int numero)
       - Objetivo: generar y devolver un array de 'numero' letras aleatorias
                  entre 'a' y 'z' (inclusive).
       - Parámetros:
           numero: tamaño del array a generar (número de letras).
       - Proceso:
           1) Crear un array de chars de longitud 'numero'.
           2) Para cada índice i (0..numero-1) generar un entero aleatorio
              entre 0 y 25 usando nextInt(26).
           3) Convertir ese entero en letra sumando 'a' (código ASCII).
           4) Guardar la letra en letras[i].
           5) Al terminar devolver el array de letras.
       - Ejemplo: si nextInt() da 0 -> 'a'; si da 25 -> 'z'.
       .................................................................... */

    public static char[] letrasAleatorias(int numero) {
        Random ran = new Random();
        char[] letras = new char[numero];

        for (int i = 0; i < numero; i++) {
            // 'a' + ran.nextInt(26) genera un código char entre 'a' y 'z'.
            letras[i] = (char) ('a' + ran.nextInt(26));
            // Explicación: ran.nextInt(26) produce 0..25; sumando 'a' convertimos a 'a'..'z'.
        }

        return letras;
    }



    /* ....................................................................
       FUNCIÓN 6
       compararArraysString(String[] array1, String[] array2)
       - Objetivo: comprobar si dos arrays de Strings son exactamente iguales.
       - Condiciones para que sean iguales:
           A) Tener el mismo tamaño (misma cantidad de casillas/posiciones).
              - Ejemplo: array1.length == array2.length.
              - Si uno tiene 3 elementos y el otro 4, NO pueden ser iguales.
           B) Para cada posición i (desde 0 hasta length-1), el String en array1[i]
              debe ser equal al String en array2[i], usando equals().
              - Es importante usar equals() y NO == para comparar Strings.
       - Proceso detallado:
           1) Comprobar la longitud: si son diferentes => devolver false.
           2) Si tienen la misma longitud, recorrer i=0..length-1:
               - Comparar array1[i].equals(array2[i])
               - Si cualquiera NO coincide => devolver false inmediatamente.
           3) Si terminamos el bucle sin encontrar diferencias => devolver true.
       - Valor devuelto:
           true  -> los arrays tienen mismo tamaño y mismo contenido en cada posición.
           false -> cualquier diferencia en tamaño o en contenido produce false.
       .................................................................... */

    public static boolean compararArraysString(String[] array1, String[] array2) {

        // 1) Comprobar si tienen el mismo tamaño:
        //    "Mismo tamaño" significa que el número de posiciones (casillas)
        //    disponibles en array1 es igual al de array2 (array1.length == array2.length).
        if (array1.length != array2.length) {
            // Si aquí entramos, un array tiene más o menos elementos que el otro,
            // por tanto no pueden ser iguales elemento a elemento.
            return false;
        }

        // 2) Recorremos posición por posición y comparamos el contenido exacto.
        //    "Comparar uno por uno" significa: para cada índice i,
        //    comprobar que array1[i] y array2[i] representen la misma cadena.
        for (int i = 0; i < array1.length; i++) {
            // Ejemplo clarificador:
            //   i = 0 -> comparamos array1[0] con array2[0]
            //   i = 1 -> comparamos array1[1] con array2[1]
            //   ...
            // Si alguna comparación falla, los arrays NO son iguales.
            if (!array1[i].equals(array2[i])) {
                // Hemos encontrado una diferencia en la posición i:
                //   array1[i] != array2[i]
                // Por tanto devolvemos false directamente.
                return false;
            }
        }

        // 3) Si acabamos el for sin devolver false, es que TODOS los elementos
        //    coincidían en sus respectivas posiciones: devolvemos true.
        return true;
    }

} // FIN DE LA CLASE
