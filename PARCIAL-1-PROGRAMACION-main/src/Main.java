
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
                    "\n 8. Consultar Ingresos Totales por Fecha"+
                    "\n 9. actualizar proyecto" +
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
                    asignarDesarrolladorAProyecto();
                    break;
                case 6:
                     agregarSrviciooAProyectos();
                    break;
                case 7:
                     consultarClientePorTelefono();
                    break;
                case 8:
                    consultarIngresosPorFecha();
                    break;
                
                 case 9:
                    actualizarEstadoProyecto();
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
    
    String documentoBuscado = JOptionPane.showInputDialog("Ingrese el documento del cliente que va a contratar el proyecto:");
    Cliente[] clientes = devPlus.getListaClientes();
    Cliente clienteEncontrado = null;

    for (int i = 0; i < clientes.length; i++) {
        if (clientes[i] != null && clientes[i].getDocumento().equals(documentoBuscado)) {
            clienteEncontrado = clientes[i];
            break;
        }
    }

    if (clienteEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Error: El cliente no existe. Debe registrarlo primero en la Opción 1.");
        return; 
    }

    String codigo = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
    String fechaSolicitud = JOptionPane.showInputDialog("Ingrese la fecha de solicitud (DD/MM/AAAA):");
    String fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio (DD/MM/AAAA):");
    String fechaEntrega = JOptionPane.showInputDialog("Ingrese la fecha de entrega (DD/MM/AAAA):");
    String estado = JOptionPane.showInputDialog("Ingrese el estado del proyecto:");
    String metodoPago = JOptionPane.showInputDialog("Ingrese el método de pago:");
    
    double valorTotal = 0.0;

    Proyecto nuevoProyecto = new Proyecto(codigo, fechaSolicitud, fechaInicio, fechaEntrega, estado, metodoPago, valorTotal);
    
    Proyecto[] lista = devPlus.getListaProyectos();
    boolean guardado = false;

    for (int i = 0; i < lista.length; i++) {
        if (lista[i] == null) {
            lista[i] = nuevoProyecto;
            guardado = true;
            
            int historialActual = clienteEncontrado.getCantidadProyectos();
            clienteEncontrado.setCantidadProyectos(historialActual + 1);
            
            JOptionPane.showMessageDialog(null, "Proyecto creado. Historial del cliente: " + (historialActual + 1) + " proyectos.");
            break;
        }
    }

    if (!guardado) {
        JOptionPane.showMessageDialog(null, "Error: Memoria llena. No se pueden registrar más proyectos.");
    }
}

public static void asignarDesarrolladorAProyecto() {
    String codProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
    Proyecto[] proyectos = devPlus.getListaProyectos();
    Proyecto proyectoEncontrado = null;

    for (int i = 0; i < proyectos.length; i++) {
        if (proyectos[i] != null && proyectos[i].getCodigo().equals(codProyecto)) {
            proyectoEncontrado = proyectos[i];
            break;
        }
    }

    if (proyectoEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Error: Proyecto no encontrado.");
        return;
    }

    String codDesarrollador = JOptionPane.showInputDialog("Ingrese el código del desarrollador:");
    Desarrollador[] desarrolladores = devPlus.getListaDesarrolladores();
    Desarrollador devEncontrado = null;

    for (int i = 0; i < desarrolladores.length; i++) {
        if (desarrolladores[i] != null && desarrolladores[i].getCodigo().equals(codDesarrollador)) {
            devEncontrado = desarrolladores[i];
            break;
        }
    }

    if (devEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Error: Desarrollador no encontrado.");
        return;
    }

    int limite = devEncontrado.getCantidadProyectosSimultaneos();
    int ocupacionActual = devEncontrado.getProyectosActuales();

    if (ocupacionActual >= limite) {
        JOptionPane.showMessageDialog(null, "Error: El desarrollador ya alcanzó su límite de " + limite + " proyectos simultáneos.");
        return;
    }

    if (devEncontrado.getEstado().equalsIgnoreCase("En capacitación")) {
        JOptionPane.showMessageDialog(null, "Error: El desarrollador se encuentra en capacitación y no está disponible.");
        return;
    }

    int diasTrabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de días que trabajará en el proyecto:"));

    Desarrollador[] devsProyecto = proyectoEncontrado.getListaDesarrolladores();
    boolean guardado = false;

    for (int i = 0; i < devsProyecto.length; i++) {
        if (devsProyecto[i] == null) {
            devsProyecto[i] = devEncontrado;
            guardado = true;
            
            devEncontrado.setProyectosActuales(ocupacionActual + 1);
            
            if (devEncontrado.getProyectosActuales() == limite) {
                devEncontrado.setEstado("Ocupado"); 
            } else {
                devEncontrado.setEstado("Asignado");
            }

            double costoManoDeObra = devEncontrado.getTarifaPorDia()* diasTrabajo;
            double totalAcumulado = proyectoEncontrado.getValorTotal() + costoManoDeObra;
            proyectoEncontrado.setValorTotal(totalAcumulado);

            JOptionPane.showMessageDialog(null, "Desarrollador asignado con éxito. Costo sumado a la factura del proyecto: $" + costoManoDeObra);
            break;
        }
    }

    if (!guardado) {
        JOptionPane.showMessageDialog(null, "Error: El proyecto ya no tiene cupo para más desarrolladores.");
    }
}

static void agregarSrviciooAProyectos() {
    String codigoProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
    Proyecto proyectoEncontrado = null;
    Proyecto[] proyectos = devPlus.getListaProyectos();

    for (int i = 0; i < proyectos.length; i++) {
        if (proyectos[i] != null && proyectos[i].getCodigo().equalsIgnoreCase(codigoProyecto)) {
            proyectoEncontrado = proyectos[i];
            break;
        }
    }

    if (proyectoEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
        return;
    }

    String codigoServicio = JOptionPane.showInputDialog("Ingrese el código del Servicio Adicional:");
    ServicioAdicional servicioEncontrado = null;
    ServicioAdicional[] servicios = devPlus.getListaServiciosAdicionales();

    for (int i = 0; i < servicios.length; i++) {
        if (servicios[i] != null && servicios[i].getCodigo().equalsIgnoreCase(codigoServicio)) {
            servicioEncontrado = servicios[i];
            break;
        }
    }

    if (servicioEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Servicio Adicional no encontrado.");
        return;
    }

    ServicioAdicional[] listaProyServicios = proyectoEncontrado.getListaServicios();
    boolean guardado = false;

    for (int i = 0; i < listaProyServicios.length; i++) {
        if (listaProyServicios[i] == null) {
            listaProyServicios[i] = servicioEncontrado;
            guardado = true;
            JOptionPane.showMessageDialog(null, "Servicio agregado con éxito. Espacio en proyecto: " + (i + 1) + "/100");
            break;
        }
    }

    if (!guardado) {
        JOptionPane.showMessageDialog(null, "Error: Límite de servicios alcanzado para este proyecto.");

        double costoServicio = servicioEncontrado.getPrecio(); 
        double totalAcumulado = proyectoEncontrado.getValorTotal() + costoServicio; 
        proyectoEncontrado.setValorTotal(totalAcumulado); 
    }
}
static void consultarClientePorTelefono() {
    String telefonoBuscado = JOptionPane.showInputDialog("Ingrese el número de teléfono a consultar:");
    
    Cliente[] clientes = devPlus.getListaClientes();
    Cliente clienteEncontrado = null;

    for (int i = 0; i < clientes.length; i++) {
        if (clientes[i] != null && clientes[i].getNumTelefono().equals(telefonoBuscado)) {
            clienteEncontrado = clientes[i];
            break;
        }
    }

    if (clienteEncontrado == null) {
        JOptionPane.showMessageDialog(null, "No se encontró ningún cliente registrado con ese número de teléfono.");
        return; 
    }

    long numeroTelefono = Long.parseLong(clienteEncontrado.getNumTelefono());
    long sumaDivisores = 0;

    for (long i = 1; i <= numeroTelefono / 2; i++) {
        if (numeroTelefono % i == 0) {
            sumaDivisores += i;
        }
    }

    String mensajePerfecto = "";
    if (sumaDivisores == numeroTelefono && numeroTelefono > 0) {
        mensajePerfecto = "¡El número de teléfono ES un número perfecto!";
    } else {
        mensajePerfecto = "El número de teléfono NO es un número perfecto.";
    }

    JOptionPane.showMessageDialog(null, 
        "--- CLIENTE ENCONTRADO ---\n" +
        "Nombre: " + clienteEncontrado.getNombre() + "\n" +
        "Documento: " + clienteEncontrado.getDocumento() + "\n" + 
        "Teléfono: " + clienteEncontrado.getNumTelefono() + "\n" +
        "Correo: " + clienteEncontrado.getCorreoElectronico() + "\n\n" +      
        "--- ANÁLISIS MATEMÁTICO ---\n" + 
        mensajePerfecto
    );
}
static void consultarIngresosPorFecha() {
    String fechaBuscada = JOptionPane.showInputDialog("Ingrese la fecha de solicitud a consultar (Ejemplo: DD/MM/AAAA):");
    
    Proyecto[] proyectos = devPlus.getListaProyectos(); 
    double ingresosTotales = 0.0;
    boolean seEncontraronProyectos = false;

    for (int i = 0; i < proyectos.length; i++) {
        if (proyectos[i] != null && proyectos[i].getFechaSolicitud().equals(fechaBuscada)) {
            ingresosTotales += proyectos[i].getValorTotal(); 
            seEncontraronProyectos = true; 
        }
    }

    if (seEncontraronProyectos) {
        JOptionPane.showMessageDialog(null, 
            "--- REPORTE DE INGRESOS ---\n" +
            "Fecha consultada: " + fechaBuscada + "\n" +
            "Total de ingresos acumulados: $" + ingresosTotales
        );
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron proyectos registrados con la fecha de solicitud: " + fechaBuscada);
    }
}

 public static void actualizarEstadoProyecto() {
    String codProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto a actualizar:");
    Proyecto[] proyectos = devPlus.getListaProyectos();
    Proyecto proyectoEncontrado = null;

    for (int i = 0; i < proyectos.length; i++) {
        if (proyectos[i] != null && proyectos[i].getCodigo().equals(codProyecto)) {
            proyectoEncontrado = proyectos[i];
            break;
        }
    }

    if (proyectoEncontrado == null) {
        JOptionPane.showMessageDialog(null, "Error: Proyecto no encontrado.");
        return;
    }

    String[] estadosPermitidos = {"Pendiente", "Confirmado", "En curso", "Finalizado", "Cancelado"};
    
    String nuevoEstado = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione el nuevo estado del proyecto:\nEstado actual: " + proyectoEncontrado.getEstado(),
            "Actualizar Estado",
            JOptionPane.QUESTION_MESSAGE,
            null,
            estadosPermitidos,
            estadosPermitidos[0]
    );

    if (nuevoEstado != null) {
        proyectoEncontrado.setEstado(nuevoEstado);
        JOptionPane.showMessageDialog(null, "El estado del proyecto ha sido actualizado con éxito a: " + nuevoEstado);
    }
}
}