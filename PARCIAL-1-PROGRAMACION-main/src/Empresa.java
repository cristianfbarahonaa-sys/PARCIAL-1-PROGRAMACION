public class Empresa {
    private String nit;
    private String nombreEmpresa;
    private String web;
    private String direccion;
    private String telefono;

    private Cliente[] listaClientes;
    private Desarrollador[] listaDesarrolladores;
    private Proyecto[] listaProyectos;
    private ServicioAdicional[] listaServiciosAdicionales;

   

    public Empresa(String nit, String nombreEmpresa, String web, String direccion, String telefono) {
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.web = web;
        this.direccion = direccion;
        this.telefono = telefono;
        
        this.listaClientes = new Cliente[100];
        this.listaDesarrolladores = new Desarrollador[100];
        this.listaProyectos = new Proyecto[100];
        this.listaServiciosAdicionales = new ServicioAdicional[100];
        
       
    }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getWeb() { return web; }
    public void setWeb(String web) { this.web = web; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Cliente[] getListaClientes() { return listaClientes; }
    public void setListaClientes(Cliente[] listaClientes) { this.listaClientes = listaClientes; }

    public Desarrollador[] getListaDesarrolladores() { return listaDesarrolladores; }
    public void setListaDesarrolladores(Desarrollador[] listaDesarrolladores) { this.listaDesarrolladores = listaDesarrolladores; }

    public Proyecto[] getListaProyectos() { return listaProyectos; }
    public void setListaProyectos(Proyecto[] listaProyectos) { this.listaProyectos = listaProyectos; }

  public ServicioAdicional[] getListaServiciosAdicionales() { return listaServiciosAdicionales; }
    public void setListaServiciosAdicionales(ServicioAdicional[] listaServiciosAdicionales) { this.listaServiciosAdicionales = listaServiciosAdicionales; }
}