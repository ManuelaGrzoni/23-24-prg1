import java.util.Scanner;
public class DevolverCambioMejorado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("precio: ");
        int precio = scanner.nextInt();

        System.out.print("dinero entregado: ");
        int cantidad = scanner.nextInt();
       
        int cambio = cantidad - precio; 
        System.out.println("El cambio es: " + cambio);
        
        int billete50 = cambio / 50;
        cambio = cambio % 50;

        int billete20 = cambio / 20;
        cambio = cambio % 20;

        int billete10 = cambio / 10;
        cambio = cambio % 10;

        int billete5 = cambio / 5;
        cambio = cambio % 5;

        int moneda2 = cambio / 2;
        cambio = cambio % 2;

        int moneda1 = cambio;
        
        System.out.println(billete50 > 0 ? "Billetes de 50 euros: " + billete50 : "");
        System.out.println(billete20 > 0 ? "Billetes de 20 euros: " + billete20 : "");
        System.out.println(billete10 > 0 ? "Billetes de 10 euros: " + billete10 : "");
        System.out.println(billete5 > 0 ? "Billetes de 5 euros: " + billete5 : "");
        System.out.println(moneda2 > 0 ? "Monedas de 2 euros: " + moneda2 : "");
        System.out.println(moneda1 > 0 ? "Monedas de 1 euros: " + moneda1 : "");

    }
}