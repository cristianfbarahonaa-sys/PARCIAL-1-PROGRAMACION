public class Empresa {
    private String nit;
    private String nombreEmpresa;
    private String web;
    private String direccion;
    private String telefono;
public Empresa (String nit, String nombreEmpresa, String web, String direccion, String telefono){
    this.nit = nit;
    this.nombreEmpresa = nombreEmpresa;
    this.web = web;
    this.direccion = direccion;
    this.telefono = telefono;
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
}
