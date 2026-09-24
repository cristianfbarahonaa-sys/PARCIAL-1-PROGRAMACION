import java.util.ArrayList;
public class Proyecto {
    private String codigo;
    private String fechaSolicitud;
    private String fechaInicio;
    private String fechaEntrega;
    private String estado;
    private String metodoPago;
    private double valorTotal;
    private ArrayList<Desarrollador> listaDesarrolladores;
    private ArrayList<ServicioAdicional> serviciosAdicionales;

public Proyecto (String codigo, String fechaSolicitud, String fechaIncio, String fechaEntrega,String estado, String metodoPago, double valorTotal){

    this.codigo = codigo;
    this.fechaSolicitud = fechaSolicitud;
    this.fechaInicio = fechaIncio;
    this.fechaEntrega = fechaEntrega;
    this.estado = estado;
    this.metodoPago = metodoPago;
    this.valorTotal = valorTotal;
    this.listaDesarrolladores = new ArrayList<>();
    this.serviciosAdicionales = new ArrayList<>();
}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Desarrollador> getListaDesarrolladores() {
        return listaDesarrolladores;
    }

    public void setListaDesarrolladores(ArrayList<Desarrollador> listaDesarrolladores) {
        this.listaDesarrolladores = listaDesarrolladores;
    }

    public ArrayList<ServicioAdicional> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(ArrayList<ServicioAdicional> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    public void agregarDesarrollador(Desarrollador d) {
        listaDesarrolladores.add(d);
    }
    public void agregarServicioAdicional(ServicioAdicional d) {
        serviciosAdicionales.add(d);
    }
}
