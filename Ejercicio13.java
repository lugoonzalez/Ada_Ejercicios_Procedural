import java.util.*;

/**
 Igual al Ejercicio 10 pero usando array char.
 */

public class Ejercicio13 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        char [] ingreso;

        int vocales = 0;
        int espacios = 0;
        int puntos = 0;

        System.out.println("Ingrese la oración que quiere analizar.");
        String orac= Teclado.nextLine();
        ingreso = orac.toCharArray();
        

        for (int i=0; i<ingreso.length; i++) {

            if (esVocal(ingreso[i])) {
                vocales++;
            } else if (ingreso [i] == ' ') {
                espacios++;
            }
            else if (ingreso [i]  == '.') {
                puntos++;
            }

        }

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