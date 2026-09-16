package ejercicio2.java;

public class Main {
    
    public static void main(String[] args) {
        //Ejemplos

        Reporte reporte1 = new Reporte.Builder("Buenas noticias", "Director general",
                "07/11/2005", Tipo.RECURSOS_HUMANOS)
                .firmaDigital(true)
                .resumen("Ha sido ascendido")
                .logo(true)
                .build();


        Reporte reporte2 = new Reporte.Builder("Informacion", "Alguien", "28/02/2034",
                Tipo.AUDITORIA)
                .graficosEstadisticos("Resultados investigacion")
                .firmaDigital(false)
                .nivelConfidencialidad(3)
                .tablaDatos("Pendiente")
                .build();



        System.out.println(reporte1.toString());
        System.out.println(reporte2.toString());
    }
}
