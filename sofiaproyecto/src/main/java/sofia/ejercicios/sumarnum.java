package sofia.ejercicios;
import java.util.Scanner;
public class sumarnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;

        System.out.println("La suma de los dos números es: " + suma);

        scanner.close();
    }
}

