public class ServicioAdicional {
    private String codigo;
    private String nombre;
    private String descripcion;
    private boolean disponibilidad;
    private double precio;
public ServicioAdicional (String codigo, String nombre, String descripcion, boolean disponibilidad, double precio){
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.disponibilidad = disponibilidad;
    this.precio = precio;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
