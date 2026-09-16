package ejercicio3.java;

public class Producto {
    //Datos obligatorios
    private String nombre;
    private Double precio;

    //Datos opcionales
    private String descripcion;
    private String categoria;
    private Boolean imagenes;
    private Variante variante;
    private Double descuento;
    private Boolean garantiaExtendida;
    private Boolean envioGratis;
    private String etiquetaPromocional;


    private Producto(Builder builder) {
        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.descripcion = builder.descripcion;
        this.categoria = builder.categoria;
        this.imagenes = builder.imagenes;
        this.variante = builder.variante;
        this.descuento = builder.descuento;
        this.garantiaExtendida = builder.garantiaExtendida;
        this.envioGratis = builder.envioGratis;
        this.etiquetaPromocional = builder.etiquetaPromocional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getImagenes() {
        return imagenes;
    }

    public void setImagenes(Boolean imagenes) {
        this.imagenes = imagenes;
    }

    public Variante getVariante() {
        return variante;
    }

    public void setVariante(Variante variante) {
        this.variante = variante;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Boolean getGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(Boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }

    public Boolean getEnvioGratis() {
        return envioGratis;
    }

    public void setEnvioGratis(Boolean envioGratis) {
        this.envioGratis = envioGratis;
    }

    public String getEtiquetaPromocional() {
        return etiquetaPromocional;
    }

    public void setEtiquetaPromocional(String etiquetaPromocional) {
        this.etiquetaPromocional = etiquetaPromocional;
    }

    public static class Builder {
        //Datos obligatorios
        private String nombre;
        private Double precio;

        //Datos opcionales
        private String descripcion;
        private String categoria;
        private Boolean imagenes;
        private Variante variante;
        private Double descuento;
        private Boolean garantiaExtendida;
        private Boolean envioGratis;
        private String etiquetaPromocional;

        public Builder(String nombre, Double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }
        public Builder categoria(String categoria) {
            this.categoria = categoria;
            return this;
        }
        public Builder imagenes(Boolean imagenes) {
            this.imagenes = imagenes;
            return this;
        }
        public Builder variante(Variante variante) {
            this.variante = variante;
            return this;
        }
        public Builder descuento(Double descuento) {
            this.descuento = descuento;
            return this;
        }
        public Builder garantiaExtendida(Boolean garantiaExtendida) {
            this.garantiaExtendida = garantiaExtendida;
            return this;
        }
        public Builder envioGratis(Boolean envioGratis) {
            this.envioGratis = envioGratis;
            return this;
        }
        public Builder etiquetaPromocional(String etiquetaPromocional) {
            this.etiquetaPromocional = etiquetaPromocional;
            return this;
        }
        public Producto build() {
            return new Producto(this);
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", imagenes=" + imagenes +
                ", variante=" + variante +
                ", descuento=" + descuento +
                ", garantiaExtendida=" + garantiaExtendida +
                ", envioGratis=" + envioGratis +
                ", etiquetaPromocional='" + etiquetaPromocional + '\'' +
                '}';
    }
}
