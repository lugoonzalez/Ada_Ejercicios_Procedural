import java.util.*;

/**
 * Ejercicio06
 */
public class Ejercicio06 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double peso = 0, costo;

        int zona;

        costo = 0;

        System.out.println("Zonas de envío:");
        System.out.println("América del Norte es Zona 1.");
        System.out.println("América Central es Zona 2.");
        System.out.println("América del Sur es Zona 3.");
        System.out.println("Europa es Zona 4.");
        System.out.println("Asia es Zona 5.");

        System.out.print("Ingrese número de zona: ");
        zona = Teclado.nextInt();

        if (zona <0|| zona>5) {
            System.out.println("No hacemos envíos a esa zona. Disculpas.");
        }

        else {
            System.out.println("Ingrese peso del paquete en gramos: ");
            peso = Teclado.nextDouble();

            if (peso > 5000) {
                System.out.println("El peso ingresado excede el límite transportable por cuestiones de seguridad.");
            }

            else {

                switch (zona) {
                case 1:
                    costo = peso * 11;
                    break;
                case 2:
                    costo = peso * 10;
                    break;
                case 3:
                    costo = peso * 12;
                    break;
                case 4:
                    costo = peso * 24;
                    break;
                case 5:
                    costo = peso * 27;
                    break;
                }
                System.out.println("El costo de este envío es $:" + costo);

            }

        }
    }
}
