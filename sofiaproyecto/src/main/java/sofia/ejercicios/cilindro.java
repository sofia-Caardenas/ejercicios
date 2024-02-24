package sofia.ejercicios;

import java.util.Scanner;

public class cilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del cilindro:");
        double radio = scanner.nextDouble();

        System.out.println("Ingrese la altura del cilindro:");
        double altura = scanner.nextDouble();

        double areaLateral = 2 * Math.PI * radio * altura;

        double areaTotal = 2 * Math.PI * radio * (radio + altura);

        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El área lateral del cilindro es: " + areaLateral);
        System.out.println("El área total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);

        scanner.close();
    }
}
