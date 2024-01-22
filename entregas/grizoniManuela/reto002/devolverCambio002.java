package entregas.grizoniManuela.reto002;

public class devolverCambio002 {
    public static void main(String[] args) {

        int CantidadAPagar = 232;
        int CantidadPaga = 400;

        int cambio = CantidadPaga - CantidadAPagar;

        int billeteDe100 = cambio/100;
        cambio = cambio % 100;

        int billeteDe50 = cambio/50;
        cambio = cambio % 50;

        int billeteDe20 = cambio/20;
        cambio = cambio % 20;

        int billeteDe10 = cambio/10;
        cambio = cambio % 10;

        int billeteDe5 = cambio/5;
        cambio = cambio % 5;

        int monedaDe2 = cambio/2;
        cambio = cambio % 2;

        System.out.println("------------------------------------");
        System.out.println("Debe pagar " + CantidadAPagar + " euros");
        System.out.println("Ha entregado " + CantidadPaga + " euros");
        System.out.print("------------------------------------");
        System.out.print((billeteDe100 > 0) ? "\n" + billeteDe100 + " billete(s) de 100€ ": "" );
        System.out.print((billeteDe50 > 0) ? "\n" + billeteDe50 + " billete(s) de 50€ ":  "" );
        System.out.print((billeteDe20 > 0) ? "\n" +billeteDe20 + " billete(s) de 20€ ": "" );
        System.out.print((billeteDe10 > 0) ? "\n" +billeteDe10 + " billete(s) de 10€ ": "" );
        System.out.print((billeteDe5 > 0) ? "\n" +billeteDe5 + " billete(s) de 5€ ": "" );
        System.out.print((monedaDe2 > 0) ? "\n" +monedaDe2 + " moneda(s) de 2€ ": "" );
        System.out.println((cambio > 0) ? "\n" +cambio + " moneda(s) de 1€ ": "" );



    }
    
}
