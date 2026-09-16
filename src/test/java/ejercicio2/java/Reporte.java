package ejercicio2.java;

public class Reporte {
    //Datos obligatorios
    private String titulo;
    private String autor;
    private String fecha;
    private Tipo tipo;

    //Datos opcionales
    private String graficosEstadisticos;
    private String tablaDatos;
    private String resumen;
    private Boolean firmaDigital;
    private Boolean logo;
    private Integer nivelConfidencialidad;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getGraficosEstadisticos() {
        return graficosEstadisticos;
    }

    public void setGraficosEstadisticos(String graficosEstadisticos) {
        this.graficosEstadisticos = graficosEstadisticos;
    }

    public String getTablaDatos() {
        return tablaDatos;
    }

    public void setTablaDatos(String tablaDatos) {
        this.tablaDatos = tablaDatos;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Boolean getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(Boolean firmaDigital) {
        this.firmaDigital = firmaDigital;
    }

    public Boolean getLogo() {
        return logo;
    }

    public void setLogo(Boolean logo) {
        this.logo = logo;
    }

    public Integer getNivelConfidencialidad() {
        return nivelConfidencialidad;
    }

    public void setNivelConfidencialidad(Integer nivelConfidencialidad) {
        this.nivelConfidencialidad = nivelConfidencialidad;
    }

    private Reporte(Builder builder) {
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.fecha = builder.fecha;
        this.tipo = builder.tipo;
        this.graficosEstadisticos = builder.graficosEstadisticos;
        this.tablaDatos = builder.tablaDatos;
        this.resumen = builder.resumen;
        this.firmaDigital = builder.firmaDigital;
        this.logo = builder.logo;
        this.nivelConfidencialidad = builder.nivelConfidencialidad;
    }




    public static class Builder {
        //Datos obligatorios
        private String titulo;
        private String autor;
        private String fecha;
        private Tipo tipo;

        //Datos opcionales
        private String graficosEstadisticos;
        private String tablaDatos;
        private String resumen;
        private Boolean firmaDigital;
        private Boolean logo;
        private Integer nivelConfidencialidad;

        public Builder(String titulo, String autor, String fecha, Tipo tipo) {
            this.titulo = titulo;
            this.autor = autor;
            this.fecha = fecha;
            this.tipo = tipo;
        }

        public Builder graficosEstadisticos(String graficosEstadisticos) {
            this.graficosEstadisticos = graficosEstadisticos;
            return this;
        }
        public Builder tablaDatos(String tablaDatos) {
            this.tablaDatos = tablaDatos;
            return this;
        }
        public Builder resumen(String resumen) {
            this.resumen = resumen;
            return this;
        }
        public Builder firmaDigital(Boolean firmaDigital) {
            this.firmaDigital = firmaDigital;
            return this;
        }
        public Builder logo(Boolean logo) {
            this.logo = logo;
            return this;
        }
        public Builder nivelConfidencialidad(Integer nivelConfidencialidad) {
            this.nivelConfidencialidad = nivelConfidencialidad;
            return this;
        }

        public Reporte build() {
            return new Reporte(this);
        }
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tipo=" + tipo +
                ", graficosEstadisticos='" + graficosEstadisticos + '\'' +
                ", tablaDatos='" + tablaDatos + '\'' +
                ", resumen='" + resumen + '\'' +
                ", firmaDigital=" + firmaDigital +
                ", logo=" + logo +
                ", nivelConfidencialidad=" + nivelConfidencialidad +
                '}';
    }
}
