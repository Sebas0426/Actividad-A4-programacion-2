package ejercicio1.java;

public class Main {
    
    public static void main(String[] args) {

        //Ejemplos de build

        Evento evento1 = new Evento.EventoBuilder("Reunion tarde", "16/09/2026", Modalidad.PRESENCIAL,
                 Tipo.SEMINARIO_INTERNO, "Niguno")
                .refrigerios(true)
                .maxCapacidad(30)
                .build();

        Evento evento2 = new Evento.EventoBuilder("Clase extra", "17/09/2026", Modalidad.VIRTUAL,
                Tipo.TALLER_PRACTICO, "Raul")
                .patrocinadores("Uniquindio")
                .traduccionSimultanea(false)
                .streamingEnVivo(true)
                .build();



        System.out.println(evento1.toString());
        System.out.println(evento2.toString());
        
    }
}
