package sofia.ejercicios;

import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres números separados por espacio:");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();
        
        double promedio = (numero1 + numero2 + numero3) / 3;
        
        System.out.println("El promedio de los tres números es: " + promedio);
        
        scanner.close();
    }
}
