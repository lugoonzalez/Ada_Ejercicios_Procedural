import java.util.*;

/**
 * Ejercicio01
 */
public class Ejercicio01 {

public static Scanner Teclado = new Scanner (System.in);
public static void main(String[] args) {

    int a;
    int b, c, d;
    double f;

    System.out.println("Ingrese el valor a");
    a= Teclado.nextInt();

    System.out.println("Ingrese el valor b");
    b= Teclado.nextInt();

    System.out.println("Ingrese el valor c");
    c= Teclado.nextInt();

    d= a + b + c;

    f= d / 3d;

    System.out.println("El promedio es:"+f);

}
}