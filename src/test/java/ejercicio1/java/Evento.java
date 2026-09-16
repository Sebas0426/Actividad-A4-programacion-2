package ejercicio1.java;

import java.util.LinkedList;

public class Evento {
    //Datos obligatorios
    private String nombreEvento;
    private String fecha;
    private Modalidad modalidad;
    private Tipo tipo;
    private String ponentes;

    //Datos opcionales
    private String certificacionDigital;
    private Boolean streamingEnVivo;
    private Boolean traduccionSimultanea;
    private Boolean refrigerios;
    private LinkedList<String> listPonentes;
    private Integer maxCapacidad;
    private String patrocinadores;

    public Evento(EventoBuilder eventoBuilder) {
        this.nombreEvento = eventoBuilder.nombreEvento;
        this.fecha = eventoBuilder.fecha;
        this.modalidad = eventoBuilder.modalidad;
        this.tipo = eventoBuilder.tipo;
        this.ponentes = eventoBuilder.ponentes;
        this.certificacionDigital = eventoBuilder.certificacionDigital;
        this.streamingEnVivo = eventoBuilder.streamingEnVivo;
        this.traduccionSimultanea = eventoBuilder.traduccionSimultanea;
        this.refrigerios = eventoBuilder.refrigerios;
        this.listPonentes = eventoBuilder.listPonentes;
        this.maxCapacidad = eventoBuilder.maxCapacidad;
        this.patrocinadores = eventoBuilder.patrocinadores;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getCertificacionDigital() {
        return certificacionDigital;
    }

    public void setCertificacionDigital(String certificacionDigital) {
        this.certificacionDigital = certificacionDigital;
    }

    public Boolean isStreamingEnVivo() {
        return streamingEnVivo;
    }

    public void setStreamingEnVivo(Boolean streamingEnVivo) {
        this.streamingEnVivo = streamingEnVivo;
    }

    public Boolean isTraduccionSimultanea() {
        return traduccionSimultanea;
    }

    public void setTraduccionSimultanea(Boolean traduccionSimultanea) {
        this.traduccionSimultanea = traduccionSimultanea;
    }

    public Boolean isRefrigerios() {
        return refrigerios;
    }

    public void setRefrigerios(Boolean refrigerios) {
        this.refrigerios = refrigerios;
    }

    public LinkedList<String> getListPonentes() {
        return listPonentes;
    }

    public void setListPonentes(LinkedList<String> listPonentes) {
        this.listPonentes = listPonentes;
    }

    public Integer getMaxCapacidad() {
        return maxCapacidad;
    }

    public void setMaxCapacidad(Integer maxCapacidad) {
        this.maxCapacidad = maxCapacidad;
    }

    public String getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(String patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    // Builder
    public static class EventoBuilder {
        //Datos obligatorios
        private String nombreEvento;
        private String fecha;
        private Modalidad modalidad;
        private Tipo tipo;
        private String ponentes;

        //Datos opcionales
        private String certificacionDigital;
        private Boolean streamingEnVivo;
        private Boolean traduccionSimultanea;
        private Boolean refrigerios;
        private LinkedList<String> listPonentes;
        private Integer maxCapacidad;
        private String patrocinadores;

        public EventoBuilder(String nombreEvento, String fecha, Modalidad modalidad, Tipo tipo, String ponentes) {
            this.nombreEvento = nombreEvento;
            this.fecha = fecha;
            this.modalidad = modalidad;
            this.tipo = tipo;
            this.ponentes = ponentes;
        }

        public EventoBuilder certificacionDigital(String certificacionDigital) {
            this.certificacionDigital = certificacionDigital;
            return this;
        }
        public EventoBuilder streamingEnVivo(boolean streamingEnVivo) {
            this.streamingEnVivo = streamingEnVivo;
            return this;
        }
        public EventoBuilder traduccionSimultanea(boolean traduccionSimultanea) {
            this.traduccionSimultanea = traduccionSimultanea;
            return this;
        }
        public EventoBuilder refrigerios(boolean refrigerios) {
            this.refrigerios = refrigerios;
            return this;
        }
        public EventoBuilder listPonentes(LinkedList<String> listPonentes) {
            this.listPonentes = listPonentes;
            return this;
        }
        public EventoBuilder maxCapacidad(int maxCapacidad) {
            this.maxCapacidad = maxCapacidad;
            return this;
        }
        public EventoBuilder patrocinadores(String patrocinadores) {
            this.patrocinadores = patrocinadores;
            return this;
        }

        public Evento build() {
            return new Evento(this);
        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombreEvento='" + nombreEvento + '\'' +
                ", fecha='" + fecha + '\'' +
                ", modalidad=" + modalidad +
                ", tipo=" + tipo +
                ", ponentes='" + ponentes + '\'' +
                ", certificacionDigital='" + certificacionDigital + '\'' +
                ", streamingEnVivo=" + streamingEnVivo +
                ", traduccionSimultanea=" + traduccionSimultanea +
                ", refrigerios=" + refrigerios +
                ", listPonentes=" + listPonentes +
                ", maxCapacidad=" + maxCapacidad +
                ", patrocinadores='" + patrocinadores + '\'' +
                '}';
    }
}
