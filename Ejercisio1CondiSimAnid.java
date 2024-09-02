//Programa para Verificar si un número es positivo y mayor que 100
package programas;

import java.util.Scanner;
public class Ejercisio1CondiSimAnid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            if (numero > 100) {
                System.out.println("El número es positivo y mayor que 100.");
            }
        }
    }
}
