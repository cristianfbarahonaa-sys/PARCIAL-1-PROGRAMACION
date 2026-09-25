public class Desarrollador {
    private String codigo;
    private String equipoTrabajo;
    private String nivel;
    private int cantidadProyectosSimultaneos;
    private double tarifaPorDia;
    private String estado;
    private int proyectosActuales = 0; 

public Desarrollador (String codigo, String equipoTrabajo, String nivel, int candidadProyectosSimultaneos, double tarifaPorDia, String estado){
    this.codigo = codigo;
    this.equipoTrabajo = equipoTrabajo;
    this.nivel = nivel;
    this.cantidadProyectosSimultaneos = candidadProyectosSimultaneos;
    this.tarifaPorDia = tarifaPorDia;
    this.estado = estado;
    this.proyectosActuales = proyectosActuales;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEquipoTrabajo() {
        return equipoTrabajo;
    }

    public void setEquipoTrabajo(String equipoTrabajo) {
        this.equipoTrabajo = equipoTrabajo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getCantidadProyectosSimultaneos() {
        return cantidadProyectosSimultaneos;
    }

    public void setCantidadProyectosSimultaneos(int cantidadProyectosSimultaneos) {
        this.cantidadProyectosSimultaneos = cantidadProyectosSimultaneos;
    }

    public double getTarifaPorDia() {
        return tarifaPorDia;
    }

    public void setTarifaPorDia(double tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getProyectosActuales() {
    return proyectosActuales;
    }
   public void setProyectosActuales(int proyectosActuales) {
    this.proyectosActuales = proyectosActuales;
}
}
