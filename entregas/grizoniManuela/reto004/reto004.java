package entregas.grizoniManuela.reto004;

import java.util.Scanner;

public class reto004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer Número: ");
        int numero1 = scanner.nextInt();
       
        System.out.print("Segundo Número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Tercer Número: ");
        int numero3 = scanner.nextInt();
    
        scanner.close();

        int cifra1 = numero1 / 100;
        int cifra2 = (numero2 / 10) % 10;
        int cifra3 = numero3 % 10;

        int numero = cifra1 * 100 + cifra2 * 10 + cifra3;
        System.out.println("------------------------------------");
        System.out.println("Número creado: " + numero);
    }
    
}
