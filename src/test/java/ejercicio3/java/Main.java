package ejercicio3.java;

public class Main {
    
    public static void main(String[] args) {
        //Ejemplos
        Producto producto1 = new Producto.Builder("Perfume", 50000.0)
                .categoria("Perfumeria")
                .envioGratis(false)
                .variante(Variante.COLOR)
                .build();

        Producto producto2 = new Producto.Builder("Mesa", 720000.0)
                .descripcion("6 puestos")
                .descuento(0.15)
                .etiquetaPromocional("TODO_FULL")
                .imagenes(true)
                .build();


        System.out.println(producto1.toString());
        System.out.println(producto2.toString());

    }
}
