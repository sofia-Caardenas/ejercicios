package sofia.ejercicios;

import java.util.Scanner;
public class circunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        
        double longitudCircunferencia = 2 * Math.PI * radio;
        
        double areaCirculoInscrito = Math.PI * Math.pow(radio, 2);
        
        System.out.println("Longitud de la circunferencia: " + longitudCircunferencia);
        System.out.println("Área del círculo inscrito: " + areaCirculoInscrito);
        
        scanner.close();
    }
}
