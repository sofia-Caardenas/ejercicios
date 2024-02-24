package sofia.ejercicios;

import java.util.Scanner;

public class eurosadolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaCambio = 1.08;

        System.out.println("Ingrese la cantidad en euros:");
        double euros = scanner.nextDouble();

        double dolares = euros * tasaCambio;

        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");

        scanner.close();
    }
}
