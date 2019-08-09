import java.util.*;

/**
 * Ejercicio08
 */
public class Ejercicio08 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int calificacion;

        System.out.println("Por favor ingrese la calificación numérica de 0 a 10: ");
        calificacion = Teclado.nextInt();

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("El número ingresado no es válido. Corrija los datos.");
        }

        if (calificacion >= 0 && calificacion <= 5) {
            System.out.println("La calificación es F.");
        }

        else {
            switch (calificacion) {
            case 10:
                System.out.println("La calificación es A.");
                break;
            case 9:
                System.out.println("La calificación es B.");
                break;
            case 8:
                System.out.println("La calificación es C.");
                break;
            case 7:
                System.out.println("La calificación es D.");
                break;
            case 6:
                System.out.println("La calificación es D.");
                break;
            }

        }

    }
}
