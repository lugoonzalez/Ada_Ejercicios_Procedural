import java.util.*;

/**
 * Ejercicio 14: Challenge. Devolver la suma de elementos de un array. El nro 13
 * es de mala suerte, asique no debe sumarse. Ignorar tambien el nro siguiente
 * al 13.
 */

public class Ejercicio14 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        
        int suma = 0;

        n= Teclado.nextInt();

        boolean hay13 = false;

        /** Declaro el array de N posiciones */

        int[] numeros = new int[n];

        /** Recorro el array para llenarlo */
        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese los nros: ");
            numeros[i] = Teclado.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numeros[i] == 13) {
                hay13 = true;
            } else {
                if (!hay13) {
                    suma = suma + numeros[i];
                } else {
                    hay13 = false;
                }
            }

        }

    }
}