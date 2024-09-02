//Programa para Determinar si un número es cero, positivo o negativo y si es múltiplo de 10
package programas;

import java.util.Scanner;
public class Ejercisio2CondiDobleAni {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero == 0) {
            System.out.println("El número es cero.");
        } else if (numero > 0) {
            if (numero % 10 == 0) {
                System.out.println("El número es positivo y múltiplo de 10.");
            } else {
                System.out.println("El número es positivo pero no es múltiplo de 10.");
            }
        } else {
            if (numero % 10 == 0) {
                System.out.println("El número es negativo y múltiplo de 10.");
            } else {
                System.out.println("El número es negativo pero no es múltiplo de 10.");
            }
        }
    }
}
