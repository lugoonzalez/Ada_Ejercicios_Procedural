import java.util.*;

/**
 * Ejercicio10
 */
public class Ejercicio10 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int vocales = 0;
        int espacios = 0;
        int puntos = 0;
        char caracter;

        System.out.println("Ingrese una oracion escribiendo letra por letra.");
        caracter = Teclado.nextLine().charAt(0);

        while (caracter != '.') {

            if (esVocal(caracter)) {
                vocales++;
            } else if (caracter == ' ') {
                espacios++;
            }

            System.out.println("Ingrese la siguiente letra.");
            caracter = Teclado.nextLine().charAt(0);

        }

        puntos++;

        System.out.println("Vocales: " + vocales);
        System.out.println("Espacios: " + espacios);
        System.out.println("Puntos: " + puntos);
    }

    static boolean esVocal(char caracter2) {
        switch (caracter2) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            return true;
        }
        return false;
    }
}