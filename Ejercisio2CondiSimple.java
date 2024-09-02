//Programa para Verificar si un número es par
package programas;

import java.util.Scanner;

public class Ejercisio2CondiSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        }
    }
}
