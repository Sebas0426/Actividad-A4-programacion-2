package ejercicio5.java;

public class Mensaje {
    //Datos obligatorios
    private String destinatario, contenidoPrincipal;
    private Canal canal;

    //Datos opcionales
    private String asunto, fechaExpiracion;
    private Boolean adjuntos, botonesInteractivos, imagenDestacada, firmaAutomatica;
    private Integer prioridad;


    private Mensaje(Builder builder) {
        this.destinatario = builder.destinatario;
        this.contenidoPrincipal = builder.contenidoPrincipal;
        this.canal = builder.canal;
        this.asunto = builder.asunto;
        this.fechaExpiracion = builder.fechaExpiracion;
        this.adjuntos = builder.adjuntos;
        this.botonesInteractivos = builder.botonesInteractivos;
        this.imagenDestacada = builder.imagenDestacada;
        this.firmaAutomatica = builder.firmaAutomatica;
        this.prioridad = builder.prioridad;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getContenidoPrincipal() {
        return contenidoPrincipal;
    }

    public void setContenidoPrincipal(String contenidoPrincipal) {
        this.contenidoPrincipal = contenidoPrincipal;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Boolean getAdjuntos() {
        return adjuntos;
    }

    public void setAdjuntos(Boolean adjuntos) {
        this.adjuntos = adjuntos;
    }

    public Boolean getBotonesInteractivos() {
        return botonesInteractivos;
    }

    public void setBotonesInteractivos(Boolean botonesInteractivos) {
        this.botonesInteractivos = botonesInteractivos;
    }

    public Boolean getImagenDestacada() {
        return imagenDestacada;
    }

    public void setImagenDestacada(Boolean imagenDestacada) {
        this.imagenDestacada = imagenDestacada;
    }

    public Boolean getFirmaAutomatica() {
        return firmaAutomatica;
    }

    public void setFirmaAutomatica(Boolean firmaAutomatica) {
        this.firmaAutomatica = firmaAutomatica;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public static class Builder {
        //Datos obligatorios
        private String destinatario, contenidoPrincipal;
        private Canal canal;

        //Datos opcionales
        private String asunto, fechaExpiracion;
        private Boolean adjuntos, botonesInteractivos, imagenDestacada, firmaAutomatica;
        private Integer prioridad;

        public Builder(String destinatario, String contenidoPrincipal, Canal canal) {
            this.destinatario = destinatario;
            this.contenidoPrincipal = contenidoPrincipal;
            this.canal = canal;
        }

        public Builder asunto(String asunto) {
            this.asunto = asunto;
            return this;
        }
        public Builder fechaExpiracion(String fechaExpiracion) {
            this.fechaExpiracion = fechaExpiracion;
            return this;
        }
        public Builder adjuntos(Boolean adjuntos) {
            this.adjuntos = adjuntos;
            return this;
        }
        public Builder botonesInteractivos(Boolean botonesInteractivos) {
            this.botonesInteractivos = botonesInteractivos;
            return this;
        }
        public Builder imagenDestacada(Boolean imagenDestacada) {
            this.imagenDestacada = imagenDestacada;
            return this;
        }
        public Builder firmaAutomatica(Boolean firmaAutomatica) {
            this.firmaAutomatica = firmaAutomatica;
            return this;
        }
        public Builder prioridad(Integer prioridad) {
            this.prioridad = prioridad;
            return this;
        }
        public Mensaje build() {
            return new Mensaje(this);
        }
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "destinatario='" + destinatario + '\'' +
                ", contenidoPrincipal='" + contenidoPrincipal + '\'' +
                ", canal=" + canal +
                ", asunto='" + asunto + '\'' +
                ", fechaExpiracion='" + fechaExpiracion + '\'' +
                ", adjuntos=" + adjuntos +
                ", botonesInteractivos=" + botonesInteractivos +
                ", imagenDestacada=" + imagenDestacada +
                ", firmaAutomatica=" + firmaAutomatica +
                ", prioridad=" + prioridad +
                '}';
    }
}
