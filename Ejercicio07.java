import java.util.*;

/**
 * Ejercicio07
 */
public class Ejercicio07 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double cobro = 0;

        int horas;

        int precio1 = 5;
        int precio2 = 4;
        int precio3 = 3;
        int precio4 = 2;

        System.out.println(
                "El precio final varía según la cantidad de horas seguidas que permaneció el auto en el estacionamiento. Si el cliente utilizó el servicio 2 horas y 15 minutos, ingrese 3.");
        System.out.print("Ingrese la cantidad de horas: ");
        horas = Teclado.nextInt();

        if (horas == 0) {
            System.out.println("Por favor ingrese correctamente los datos.");
        }

        if (horas == 1 || horas == 2) {
            cobro = cobro + (horas * precio1);

        } else {
            if (horas == 3 || horas == 4 || horas == 5) {
                cobro = cobro + (horas * precio2);

            } else {
                if (horas == 6 || horas == 7 || horas == 8 || horas == 9 || horas == 10) {
                    cobro = cobro + (horas * precio3);
                } else {
                    if (horas > 11) {
                        cobro = cobro + (horas * precio4);

                    }

                }

            }

        }

        System.out.println("El precio que debe cobrar es: " + cobro);

    }
}
