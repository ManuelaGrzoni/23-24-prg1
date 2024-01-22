package entregas.grizoniManuela.reto001;

public class devolverCambio {
    public static void main(String[] args) {

        int cantidadAPagar = 280;
        int cantidadPago = 440;

        int cambio =  cantidadPago- cantidadAPagar;

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


        System.out.println("Debe pagar " + cantidadAPagar + " euros");
        System.out.println("Ha entregado " + cantidadPago + " euros");
        System.out.println("----------------------------------");
        System.out.println(billeteDe100 + " billete(s) de 100€ "  );
        System.out.println(billeteDe50 + " billete(s) de 50€ "  );
        System.out.println(billeteDe20 + " billete(s) de 20€ "  );
        System.out.println(billeteDe10 + " billete(s) de 10€ "  );
        System.out.println(billeteDe5 + " billete(s) de 5€ "  );
        System.out.println(monedaDe2 + " moneda(s) de 2€ "  );
        System.out.println(cambio + " moneda(s) de 1€ "  );


    }
    
}
