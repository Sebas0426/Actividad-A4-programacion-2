package ejercicio5.java;

public class Main {
    
    public static void main(String[] args) {
        //Ejemplos
        Mensaje mensaje1 = new Mensaje.Builder("Rector", "Informe destacado", Canal.EMAIL)
                .adjuntos(true)
                .botonesInteractivos(false)
                .prioridad(2)
                .build();

        Mensaje mensaje2 = new Mensaje.Builder("Estudiante", "Nota final", Canal.MENSAJE_INTERNO)
                .asunto("Notas finales")
                .adjuntos(true)
                .firmaAutomatica(true)
                .imagenDestacada(true)
                .build();


        System.out.println(mensaje1.toString());
        System.out.println(mensaje2.toString());
    }
}
