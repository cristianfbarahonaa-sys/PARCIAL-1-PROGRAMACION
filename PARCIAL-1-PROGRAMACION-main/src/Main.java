
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
    Cliente[] lista = devPlus.getListaClientes();
    boolean guardado = false;

    for (int i = 0; i < lista.length; i++) {
        if (lista[i] == null) {
            lista[i] = nuevoCliente;
            guardado = true;
            JOptionPane.showMessageDialog(null, "Cliente guardado. Espacio ocupado: " + (i + 1) + "/100");
            break;
        }
    }

    if (!guardado) {
        JOptionPane.showMessageDialog(null, "Error: Memoria llena. No se pueden registrar más clientes.");
    }
}

public static void registrarNuevoDesarrollador() {
    String codigo = JOptionPane.showInputDialog("Ingrese el código del desarrollador:");
    String equipo = JOptionPane.showInputDialog("Ingrese el equipo de trabajo:");
    String nivel = JOptionPane.showInputDialog("Ingrese el nivel (Junior, Semisenior, Senior):");
    int maxProyectos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad máxima de proyectos simultáneos:"));
    double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por día:"));
    String estado = JOptionPane.showInputDialog("Ingrese el estado (Disponible, Asignado, Ocupado, En capacitación):");

    Desarrollador nuevoDesarrollador = new Desarrollador(codigo, equipo, nivel, maxProyectos, tarifa, estado);
    Desarrollador[] lista = devPlus.getListaDesarrolladores();
    boolean guardado = false;

    for (int i = 0; i < lista.length; i++) {
        if (lista[i] == null) {
            lista[i] = nuevoDesarrollador;
            guardado = true;
            JOptionPane.showMessageDialog(null, "Desarrollador guardado. Espacio ocupado: " + (i + 1) + "/100");
            break;
        }
    }

    if (!guardado) {
        JOptionPane.showMessageDialog(null, "Error: Memoria llena. No se pueden registrar más desarrolladores.");
    }
}

public static void registrarServicioAdicional() {
    String codigo = JOptionPane.showInputDialog("Ingrese el código del servicio:");
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del servicio:");
    String descripcion = JOptionPane.showInputDialog("Ingrese la descripción:");
    String disponibilidad = JOptionPane.showInputDialog("Ingrese la disponibilidad:");
    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

    ServicioAdicional nuevoServicio = new ServicioAdicional(codigo, nombre, descripcion, disponibilidad, precio);
    ServicioAdicional[] lista = devPlus. getListaServiciosAdicionales();
    boolean guardado = false;

    for (int i = 0; i < lista.length; i++) {
        if (lista[i] == null) {
            lista[i] = nuevoServicio;
            guardado = true;
            JOptionPane.showMessageDialog(null, "Servicio guardado. Espacio ocupado: " + (i + 1) + "/100");
            break;
        }
    }

    if (!guardado) {
        JOptionPane.showMessageDialog(null, "Error: Memoria llena. No se pueden registrar más servicios.");
    }
}

public static void registrarNuevoProyecto() {
    String codigo = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
    String fechaSolicitud = JOptionPane.showInputDialog("Ingrese la fecha de solicitud (DD/MM/AAAA):");
    String fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio (DD/MM/AAAA):");
    String fechaEntrega = JOptionPane.showInputDialog("Ingrese la fecha de entrega (DD/MM/AAAA):");
    String estado = JOptionPane.showInputDialog("Ingrese el estado del proyecto:");
    String metodoPago = JOptionPane.showInputDialog("Ingrese el método de pago:");
    double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor total:"));

    Proyecto nuevoProyecto = new Proyecto(codigo, fechaSolicitud, fechaInicio, fechaEntrega, estado, metodoPago, valorTotal);
    Proyecto[] lista = devPlus.getListaProyectos();
    boolean guardado = false;

    for (int i = 0; i < lista.length; i++) {
        if (lista[i] == null) {
            lista[i] = nuevoProyecto;
            guardado = true;
            JOptionPane.showMessageDialog(null, "Proyecto guardado. Espacio ocupado: " + (i + 1) + "/100");
            break;
        }
    }

    if (!guardado) {
        JOptionPane.showMessageDialog(null, "Error: Memoria llena. No se pueden registrar más proyectos.");
    }
}
public static void asignarDesarrolladorAProyecto() {
    String codProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
    Proyecto proyectoEncontrado = null;
    Proyecto[] proyectos = devPlus.getListaProyectos();

    for (int i = 0; i < proyectos.length; i++) {
        if (proyectos[i] != null && proyectos[i].getCodigo().equals(codProyecto)) {
            proyectoEncontrado = proyectos[i];
            break;
        }
    }

    if (proyectoEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
        return;
    }

    String codDesarrollador = JOptionPane.showInputDialog("Ingrese el código del desarrollador a asignar:");
    Desarrollador desarrolladorEncontrado = null;
    Desarrollador[] desarrolladores = devPlus.getListaDesarrolladores();

    for (int i = 0; i < desarrolladores.length; i++) {
        if (desarrolladores[i] != null && desarrolladores[i].getCodigo().equals(codDesarrollador)) {
            desarrolladorEncontrado = desarrolladores[i];
            break;
        }
    }

    if (desarrolladorEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Desarrollador no encontrado.");
        return;
    }

    if (desarrolladorEncontrado.getEstado().equalsIgnoreCase("Disponible")) {
        Desarrollador[] listaProyDesarrolladores = proyectoEncontrado.getListaDesarrolladores();
        boolean guardado = false;

        for (int i = 0; i < listaProyDesarrolladores.length; i++) {
            if (listaProyDesarrolladores[i] == null) {
                listaProyDesarrolladores[i] = desarrolladorEncontrado;
                desarrolladorEncontrado.setEstado("Asignado");
                guardado = true;
                JOptionPane.showMessageDialog(null, "Desarrollador asignado con éxito. Espacio en proyecto: " + (i + 1) + "/100");
                break;
            }
        }

        if (!guardado) {
            JOptionPane.showMessageDialog(null, "Error: Límite de desarrolladores alcanzado para este proyecto.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "No asignado. El estado del desarrollador es: " + desarrolladorEncontrado.getEstado());
    }
}
}