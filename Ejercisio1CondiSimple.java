//Programa para verificar si un número es positivo

package programas;

import java.util.Scanner;
public class Ejercisio1CondiSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("El numero es positivo.");
        }
    }
}
