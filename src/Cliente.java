public class Cliente {
    private String nombre;
    private String documento;
    private String numTelefono;
    private String correoElectronico;
    private String paisOrigen;
public Cliente (String nombre, String documento, String numTelefono, String correoElectronico, String paisOrigen){

    this.nombre = nombre;
    this.documento = documento;
    this.numTelefono = numTelefono;
    this.correoElectronico = correoElectronico;
    this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}