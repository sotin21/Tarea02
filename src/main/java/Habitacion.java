class Habitacion {
    private String tipo;
    private String estado;

    public Habitacion(String tipo) {
        this.tipo = tipo;
        this.estado = "disponible";
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitación tipo: " + tipo + ", estado: " + estado;
    }
}