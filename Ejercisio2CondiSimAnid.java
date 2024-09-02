//Programa para Verificar si un número es negativo y múltiplo de 5
package programas;

import java.util.Scanner;
public class Ejercisio2CondiSimAnid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            if (numero % 5 == 0) {
                System.out.println("El número es negativo y múltiplo de 5.");
            }
        }
    }
}
