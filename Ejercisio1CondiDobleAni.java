//Programa para Verificar si un número es positivo o negativo y además si es par o impar
package programas;

import java.util.Scanner;
public class Ejercisio1CondiDobleAni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es positivo y par.");
            } else {
                System.out.println("El número es positivo e impar.");
            }
        } else {
            if (numero % 2 == 0) {
                System.out.println("El número es negativo y par.");
            } else {
                System.out.println("El número es negativo e impar.");
            }
        }
    }
}
