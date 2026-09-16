package ejercicio4.java;

public class Computador {
    //Datos obligatorios
    private String procesador;
    private Integer memoriaRAM;
    private Integer discoDuro;
    private Configuracion configuracion;

    //Datos opcionales
    private String tarjetaGrafica;
    private String sistemaOperativo;
    private Boolean monitor;
    private Boolean tecladoMouse;
    private Boolean tarjetaRedExtra;
    private Boolean garantiaExtendida;


    private Computador(Builder builder) {
        this.procesador = builder.procesador;
        this.memoriaRAM = builder.memoriaRAM;
        this.discoDuro = builder.discoDuro;
        this.configuracion = builder.configuracion;
        this.tarjetaGrafica = builder.tarjetaGrafica;
        this.sistemaOperativo = builder.sistemaOperativo;
        this.monitor = builder.monitor;
        this.tecladoMouse = builder.tecladoMouse;
        this.tarjetaRedExtra = builder.tarjetaRedExtra;
        this.garantiaExtendida = builder.garantiaExtendida;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(Integer discoDuro) {
        this.discoDuro = discoDuro;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Boolean getMonitor() {
        return monitor;
    }

    public void setMonitor(Boolean monitor) {
        this.monitor = monitor;
    }

    public Boolean getTecladoMouse() {
        return tecladoMouse;
    }

    public void setTecladoMouse(Boolean tecladoMouse) {
        this.tecladoMouse = tecladoMouse;
    }

    public Boolean getTarjetaRedExtra() {
        return tarjetaRedExtra;
    }

    public void setTarjetaRedExtra(Boolean tarjetaRedExtra) {
        this.tarjetaRedExtra = tarjetaRedExtra;
    }

    public Boolean getGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(Boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }

    public static class Builder {
        //Datos obligatorios
        private String procesador;
        private Integer memoriaRAM;
        private Integer discoDuro;
        private Configuracion configuracion;

        //Datos opcionales
        private String tarjetaGrafica;
        private String sistemaOperativo;
        private Boolean monitor;
        private Boolean tecladoMouse;
        private Boolean tarjetaRedExtra;
        private Boolean garantiaExtendida;

        public Builder(String procesador, Integer memoriaRAM, Integer discoDuro,  Configuracion configuracion) {
            this.procesador = procesador;
            this.memoriaRAM = memoriaRAM;
            this.discoDuro = discoDuro;
            this.configuracion = configuracion;
        }

        public Builder tarjetaGrafica(String tarjetaGrafica) {
            this.tarjetaGrafica = tarjetaGrafica;
            return this;
        }
        public Builder sistemaOperativo(String sistemaOperativo) {
            this.sistemaOperativo = sistemaOperativo;
            return this;
        }
        public Builder monitor(Boolean monitor) {
            this.monitor = monitor;
            return this;
        }
        public Builder tecladoMouse(Boolean tecladoMouse) {
            this.tecladoMouse = tecladoMouse;
            return this;
        }
        public Builder tarjetaRedExtra(Boolean tarjetaRedExtra) {
            this.tarjetaRedExtra = tarjetaRedExtra;
            return this;
        }
        public Builder garantiaExtendida(Boolean garantiaExtendida) {
            this.garantiaExtendida = garantiaExtendida;
            return this;
        }
        public Computador build() {
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "Computador{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", discoDuro=" + discoDuro +
                ", configuracion=" + configuracion +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", monitor=" + monitor +
                ", tecladoMouse=" + tecladoMouse +
                ", tarjetaRedExtra=" + tarjetaRedExtra +
                ", garantiaExtendida=" + garantiaExtendida +
                '}';
    }
}
