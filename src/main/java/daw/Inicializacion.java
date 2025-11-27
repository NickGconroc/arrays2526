package daw;

public class Inicializacion {
    public static void main(String[] args) {

    // ------------------------------------------------------
    // IMPORTACIONES NECESARIAS
    // ------------------------------------------------------
    import java.util.Scanner; // Para leer datos por consola
    import javax.swing.JOptionPane; // Para usar cuadros de diálogo
    import java.util.Random; // Para generar números aleatorios

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    // ------------------------------------------------------
    // 1. Scanner con WHILE + TRY/CATCH válido
    // ------------------------------------------------------
    int numeroConsola = 0;
    boolean valido = false;

    while(!valido)
    {
        try {
            System.out.print("Introduce un número entero por consola: ");
            numeroConsola = Integer.parseInt(sc.nextLine());
            valido = true;
        } catch (NumberFormatException e) { // ← EXCEPCIÓN EXACTA
            System.out.println("Error: introduce un número entero válido. (NumberFormatException)");
        }
    }

    // ------------------------------------------------------
    // 2. JOptionPane → leer texto y convertirlo a número
    // ------------------------------------------------------
    int numeroJOption = 0;
    boolean valido2 = false;

    while(!valido2)
    {
        try {
            String texto = JOptionPane.showInputDialog("Introduce un número (JOptionPane):");
            numeroJOption = Integer.parseInt(texto);
            valido2 = true;
        } catch (NumberFormatException e) { // ← EXCEPCIÓN EXACTA
            JOptionPane.showMessageDialog(null, "Error: introduce un número válido. (NumberFormatException)");
        }
    }

    // ------------------------------------------------------
    // 3. Random → aleatorio normal
    // ------------------------------------------------------
    int aleSimple = random.nextInt(100); // 0 a 99

    // ------------------------------------------------------
    // 4. Random entre dos números
    // ------------------------------------------------------
    int min = 10;
    int max = 30;
    int aleRango = random.nextInt((max - min) + 1) + min;

    // ------------------------------------------------------
    // 5. Ejemplo THROW
    // ------------------------------------------------------
    try
    {
        validarPositivo(numeroJOption);
    }catch(
    IllegalArgumentException e)
    { // ← EXCEPCIÓN EXACTA
        System.out.println("Excepción generada por THROW: " + e.getMessage() + " (IllegalArgumentException)");
    }

    // ------------------------------------------------------
    // RESULTADOS
    // ------------------------------------------------------
    System.out.println("Número consola válido: "+numeroConsola);System.out.println("Número JOptionPane válido: "+numeroJOption);System.out.println("Aleatorio simple (0-99): "+aleSimple);System.out.println("Aleatorio entre "+min+" y "+max+": "+aleRango);

    sc.close();
    }

    // ------------------------------------------------------
    // FUNCIÓN DE EJEMPLO PARA THROW
    // ------------------------------------------------------
    public static void validarPositivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
    }
}


