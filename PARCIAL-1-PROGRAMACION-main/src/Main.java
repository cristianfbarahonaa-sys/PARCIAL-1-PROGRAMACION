import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    
    static Empresa devPlus = new Empresa("900123456", "DevPlus", "www.devplus.com", "Armenia", "3001234567");

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
                    registrarNuevoDesarrollador();
                    
                    break;
                case 3:
                    registrarServicioAdicional();
                    break;
                case 4:
                    registrarNuevoProyecto();
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
        
        devPlus.agregarCliente(nuevoCliente);
        
        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
    }
    public static void registrarNuevoDesarrollador() {
    String codigo = JOptionPane.showInputDialog("Ingrese el código del desarrollador:");
    String equipo = JOptionPane.showInputDialog("Ingrese el equipo de trabajo:");
    String nivel = JOptionPane.showInputDialog("Ingrese el nivel (Junior, Semisenior, Senior):");
    int maxProyectos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad máxima de proyectos simultáneos:"));
    double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por día:"));
    String estado = JOptionPane.showInputDialog("Ingrese el estado (Disponible, Asignado, Ocupado, En capacitación):");

    Desarrollador nuevoDesarrollador = new Desarrollador(codigo, equipo, nivel, maxProyectos, tarifa, estado);
    devPlus.agregarDesarrollador(nuevoDesarrollador);

    JOptionPane.showMessageDialog(null, "Desarrollador registrado con éxito");
}

public static void registrarServicioAdicional() {
    String codigo = JOptionPane.showInputDialog("Ingrese el código del servicio:");
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del servicio:");
    String descripcion = JOptionPane.showInputDialog("Ingrese la descripción:");
    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));
    String disponibilidad = JOptionPane.showInputDialog("Ingrese la disponibilidad:");

    ServicioAdicional nuevoServicio = new ServicioAdicional(codigo, nombre, descripcion, disponibilidad, precio);
    devPlus.agregarServiciosAdicionales(nuevoServicio);

    JOptionPane.showMessageDialog(null, "Servicio registrado con éxito");
}
   public static void registrarNuevoProyecto() {
    String codigo = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
    String fechaSolicitud = JOptionPane.showInputDialog("Ingrese la fecha de solicitud (DD/MM/AAAA):");
    String fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio (DD/MM/AAAA):");
    String fechaEntrega = JOptionPane.showInputDialog("Ingrese la fecha de entrega (DD/MM/AAAA):");
    String estado = JOptionPane.showInputDialog("Ingrese el estado (Pendiente, Confirmado, En curso, Finalizado, Cancelado):");
    String metodoPago = JOptionPane.showInputDialog("Ingrese el método de pago (tarjeta, transferencia, efectivo):");
    double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor total estimado:"));

    Proyecto nuevoProyecto = new Proyecto(codigo, fechaSolicitud, fechaInicio, fechaEntrega, estado, metodoPago, valorTotal);

    JOptionPane.showMessageDialog(null, "Proyecto registrado con éxito");
}
}