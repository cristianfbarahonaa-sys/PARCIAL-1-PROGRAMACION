import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    
    static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void main(String[] args) {
        
        int opcion = 0; 
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "SISTEMA DE GESTION DEVPLUS\n" +
                    "\n 1. Registrar Cliente" +
                    "\n 2. Registrar Desarrollador" +
                    "\n 3. Registrar Servicio Adicional" +
                    "\n 4. Crear / Contratar Proyecto" +
                    "\n 5. Asignar Desarrolladores a Proyecto" +
                    "\n 6. Agregar Servicios a Proyecto" +
                    "\n 7. Consultar Cliente por Teléfono" +
                    "\n 8. Consultar Ingresos Totales por Fecha" +
                    "\n 0. Salir del sistema"));

            switch (opcion) {
                case 1:
                    registrarNuevoCliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static void registrarNuevoCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo:");
        String documento = JOptionPane.showInputDialog("Ingrese el documento de identidad:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono:");
        String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico:");
        String pais = JOptionPane.showInputDialog("Ingrese el país de procedencia:");

        Cliente nuevoCliente = new Cliente(nombre, documento, telefono, correo, pais);
        
        listaClientes.add(nuevoCliente);
        
        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
    }
}