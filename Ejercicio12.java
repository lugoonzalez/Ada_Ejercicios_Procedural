import java.util.*;

/**
 Dados 2 arrays de números enteros de 7 posiciones, generar un tercer array de 7 posiciones donde cada elemento sea la suma de los dos arrays anteriores.
 */

public class Ejercicio12 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = new int [7];
        int[] b = new int [7];
        int[] c = new int [7];

        for (int i = 0; i<7; i++) {

            System.out.println("Ingrese el nro del array A " + i);
            a[i]= Teclado.nextInt();

        }

        for (int i = 0; i<7; i++) {

            System.out.println("Ingrese el nro del array B " + i);
            b[i]= Teclado.nextInt();

        }

        for (int i = 0; i<7; i++) {
            c[i] = a[i] + b[i]; 
        }

        System.out.println("El valor de array C es: ");

        for (int i = 0; i<7; i++) {
            System.out.println(c[i]);
        }
        
    }
}