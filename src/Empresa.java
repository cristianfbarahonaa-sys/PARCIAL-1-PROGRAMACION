import java.util.ArrayList;
public class Empresa {
    private String nit;
    private String nombreEmpresa;
    private String web;
    private String direccion;
    private String telefono;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Desarrollador> listaDesarrolladores;
    private ArrayList<Proyecto> listaProyectos;
    private ArrayList<ServicioAdicional> listaServiciosAdicionales;
public Empresa (String nit, String nombreEmpresa, String web, String direccion, String telefono){
    this.nit = nit;
    this.nombreEmpresa = nombreEmpresa;
    this.web = web;
    this.direccion = direccion;
    this.telefono = telefono;
    this.listaClientes = new ArrayList<>();
    this.listaDesarrolladores = new ArrayList<>();
    this.listaProyectos = new ArrayList<>();
    this.listaServiciosAdicionales = new ArrayList<>();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
        }
    public ArrayList<Desarrollador> getListaDesarrolladores(){
        return listaDesarrolladores;
    }
    public ArrayList<Proyecto> getListaProyectos(){
        return listaProyectos;
    }
    public ArrayList<ServicioAdicional> getListaServiciosAdicionales(){
        return listaServiciosAdicionales;
    }
    public void agregarCliente (Cliente cliente){
        listaClientes.add(cliente);
    }
    public void agregarDesarrollador (Desarrollador desarrollador){
        listaDesarrolladores.add(desarrollador);
    }
    public void agregarProyecto (Proyecto proyecto){
        listaProyectos.add(proyecto);
    }
    public void agregarServiciosAdicionales (ServicioAdicional servicio){
        listaServiciosAdicionales.add(servicio);

    }
}

