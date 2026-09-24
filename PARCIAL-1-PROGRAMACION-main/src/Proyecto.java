public class Proyecto {
    private String codigo;
    private String fechaSolicitud;
    private String fechaInicio;
    private String fechaEntrega;
    private String estado;
    private String metodoPago;
    private double valorTotal;

    private Desarrollador[] listaDesarrolladores;
    private ServicioAdicional[] serviciosAdicionales;

    private int contadorDesarrolladores;
    private int contadorServicios;

    public Proyecto(String codigo, String fechaSolicitud, String fechaInicio, String fechaEntrega, String estado, String metodoPago, double valorTotal) {
        this.codigo = codigo;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
        
        this.listaDesarrolladores = new Desarrollador[100];
        this.serviciosAdicionales = new ServicioAdicional[100];
        
        this.contadorDesarrolladores = 0;
        this.contadorServicios = 0;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getFechaSolicitud() { return fechaSolicitud; }
    public void setFechaSolicitud(String fechaSolicitud) { this.fechaSolicitud = fechaSolicitud; }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(String fechaEntrega) { this.fechaEntrega = fechaEntrega; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public Desarrollador[] getListaDesarrolladores() { return listaDesarrolladores; }
    public void setListaDesarrolladores(Desarrollador[] listaDesarrolladores) { this.listaDesarrolladores = listaDesarrolladores; }

    public ServicioAdicional[] getServiciosAdicionales() { return serviciosAdicionales; }
    public void setServiciosAdicionales(ServicioAdicional[] serviciosAdicionales) { this.serviciosAdicionales = serviciosAdicionales; }

    public int getContadorDesarrolladores() { return contadorDesarrolladores; }
    public void setContadorDesarrolladores(int contadorDesarrolladores) { this.contadorDesarrolladores = contadorDesarrolladores; }

    public int getContadorServicios() { return contadorServicios; }
    public void setContadorServicios(int contadorServicios) { this.contadorServicios = contadorServicios; }
}