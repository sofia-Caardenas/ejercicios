package sofia.ejercicios;

import java.util.Scanner;

public class numeroalcuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();

        double resultado = Math.pow(numero, 2);

        System.out.println("El resultado de elevar " + numero + " al cuadrado es: " + resultado);

        scanner.close();
    }
}
