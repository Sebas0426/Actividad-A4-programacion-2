package ejercicio4.java;

public class Main {
    
    public static void main(String[] args) {
        //Ejemplos
        Computador computador1 = new Computador.Builder("Intel", 8, 500,
                Configuracion.OFICINA)
                .monitor(true)
                .tarjetaGrafica("6000")
                .tecladoMouse(true)
                .garantiaExtendida(false)
                .build();

        Computador computador2 = new Computador.Builder("Ryzen", 16, 1000,
                Configuracion.DISENO_GRAFICO)
                .garantiaExtendida(true)
                .sistemaOperativo("Windows")
                .tarjetaGrafica("ADA")
                .build();

        System.out.println(computador1.toString());
        System.out.println(computador2.toString());
    }
}
