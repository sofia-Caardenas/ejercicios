package sofia.ejercicios;
import java.util.Scanner;
public class areayperimetrocuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado del cuadrado:");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        double perimetro = 4 * lado;

        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        scanner.close();
}


}