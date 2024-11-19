package co.edu.unquindio.poo.model;

import java.util.LinkedList;
import javafx.collections.ObservableList;

public class Empresa {

    private String palabraClave;
    private String nombre;
    private LinkedList<Vehiculo> listaVehiculos;
    private LinkedList<Cliente> listaClientes;
    private LinkedList<Empleado> listaEmpleados;
    private LinkedList<Alquiler> listaAlquileres;
    private LinkedList<Compra> listaCompras;
    private LinkedList<Venta> listaVentas;

    /**
     * Método contructor
     * 
     * @param nombre
     */
    public Empresa(String nombre, String palabraClave) {
        this.palabraClave = palabraClave;
        this.nombre = nombre;
        listaVehiculos = new LinkedList<>();
        listaClientes = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
        listaAlquileres = new LinkedList<>();
        listaCompras = new LinkedList<>();
        listaVentas = new LinkedList<>();
    }

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public LinkedList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(LinkedList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public LinkedList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(LinkedList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public LinkedList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(LinkedList<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public LinkedList<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(LinkedList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public LinkedList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(LinkedList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", listaVehiculos=" + listaVehiculos + ", listaClientes=" + listaClientes
                + ", listaEmpleados=" + listaEmpleados + ", listaAlquileres=" + listaAlquileres + ", listaCompras="
                + listaCompras + ", listaVentas=" + listaVentas + "]";
    }

    /**
     * Método que agrega un vehiculo a lista de vehiculos de la empresa
     * 
     * @param nuevoVehiculo
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearVehiculo(Vehiculo nuevoVehiculo) {
        if (nuevoVehiculo != null) {
            boolean existe = listaVehiculos.stream().filter(vehiculo -> vehiculo != null)
                    .anyMatch(vehiculo -> vehiculo.getMatricula().equals(nuevoVehiculo.getMatricula()));
            if (existe) {
                System.out.println("\nEl vehiculo ya esta registrado, verifique los datos");
                return false;
            } else {
                listaVehiculos.add(nuevoVehiculo);
                System.out.println("\nVehiculo creado exitosamente");
                return true;
            }
        } else {
            System.out.println("\nIngrese los datos correctamente");
            return false;
        }
    }

    /**
     * Método que elimina un vehiculo de la lista
     * 
     * @param vehiculoEliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarVehiculo(Vehiculo vehiculoEliminar) {
        boolean eliminado = listaVehiculos
                .removeIf(vehiculo -> vehiculo.getMatricula().equals(vehiculoEliminar.getMatricula()));
        if (eliminado) {
            System.out.println("\nVehiculo eliminado correctamente");
            return true;
        } else {
            System.out.println("\nEl vehiculo no ha sido encontrado, verifique los datos");
            return false;
        }
    }

    /**
     * Método que actualiza un vehiculo
     * 
     * @param tipoTransmision
     * @param marca
     * @param nuevoOUsado
     * @param modelo
     * @param cambios
     * @param velocidadMaxima
     * @param cilindraje
     * @param matricula
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarVehiculo(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo,
            String cambios, String velocidadMaxima, String cilindraje, String matricula,
            TipoDeVehiculo tipoDeVehiculo) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo != null) {
                if (vehiculo.getMatricula().equals(matricula)) {
                    vehiculo.setTipoTransmision(tipoTransmision);
                    vehiculo.setMarca(marca);
                    vehiculo.setNuevoOUsado(nuevoOUsado);
                    vehiculo.setModelo(modelo);
                    vehiculo.setCambios(cambios);
                    vehiculo.setVelocidadMaxima(velocidadMaxima);
                    vehiculo.setCilindraje(cilindraje);
                    vehiculo.setMatricula(matricula);
                    vehiculo.setTipoDeVehiculo(tipoDeVehiculo);
                    System.out.println("Vehiculo actualizado exitosamente");
                    return true;
                }
            }
        }
        System.out.println("\nVehiculo no encontrado, verifique los datos ingresados");
        return false;
    }

    /**
     * Método que añade un empleado a la lista de empleados
     * 
     * @param nuevoEmpleado
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearEmpleado(Empleado nuevoEmpleado) {
        boolean existe = listaEmpleados.stream().filter(empleado -> empleado != null)
                .anyMatch(empleado -> empleado.getIdentificacion().equals(nuevoEmpleado.getIdentificacion()));
        if (existe) {
            System.out.println("\nEl empleado ya esta registrado, verifique los datos");
            return false;
        } else {
            listaEmpleados.add(nuevoEmpleado);
            System.out.println("\nEmpleado creado con exito");
            return true;
        }
    }

    /**
     * Método que elimina un empleado
     * 
     * @param empleadoEliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarEmpleado(Empleado empleadoEliminar) {
        boolean eliminado = listaEmpleados
                .removeIf(empleado -> empleado.getIdentificacion().equals(empleadoEliminar.getIdentificacion()));
        if (eliminado) {
            System.out.println("\nEmpleado eliminado correctamente");
            return true;
        } else {
            System.out.println("\nEl empleado no esta registrado, verifique los datos");
            return false;
        }
    }

    /**
     * Método que actualiza un empleado
     * 
     * @param nombre
     * @param identificacion
     * @param telefono
     * @param correo
     * @param sueldo
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarEmpleado(String nombre, String identificacion, String telefono, String correo,
            String sueldo) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado != null) {
                if (empleado.getIdentificacion().equals(identificacion)) {
                    empleado.setNombre(nombre);
                    empleado.setIdentificacion(identificacion);
                    empleado.setTelefono(telefono);
                    empleado.setCorreo(correo);
                    empleado.setSueldo(sueldo);
                    System.out.println("\nEmpleado actualizado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl empleado no esta registrado, verifique los datos");
        return false;
    }

    /**
     * Método que crea un cliente
     * 
     * @param nuevoCliente
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearCliente(Cliente nuevoCliente) {
        boolean existe = listaClientes.stream().filter(cliente -> cliente != null)
                .anyMatch(cliente -> cliente.getIdentificacion().equals(nuevoCliente.getIdentificacion()));
        if (existe) {
            System.out.println("\nEl cliente ya esta registrado, verifique los datos");
            return false;
        } else {
            listaClientes.add(nuevoCliente);
            System.out.println("\nCliente creado con exito");
            return true;
        }
    }

    /**
     * Método que elimina un cliente
     * 
     * @param clienteEliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarCliente(Cliente clienteEliminar) {
        boolean eliminado = listaClientes
                .removeIf(cliente -> cliente.getIdentificacion().equals(clienteEliminar.getIdentificacion()));
        if (eliminado) {
            System.out.println("\nCliente eliminado correctamente");
            return true;
        } else {
            System.out.println("\nNo se ha encontrado el cliente, verifique la informacion");
            return false;
        }
    }

    /**
     * Método que actualiza un cliente
     * 
     * @param nombre
     * @param identificacion
     * @param telefono
     * @param correo
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarCliente(String nombre, String identificacion, String telefono, String correo) {
        for (Cliente cliente : listaClientes) {
            if (cliente != null) {
                if (cliente.getIdentificacion().equals(identificacion)) {
                    cliente.setNombre(nombre);
                    cliente.setIdentificacion(identificacion);
                    cliente.setTelefono(telefono);
                    cliente.setCorreo(correo);
                    System.out.println("\nCliente actualizado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nCliente no encontrado, verifique los datos");
        return false;
    }

    /**
     * Método que crea un alquiler
     * 
     * @param nuevoAlquiler
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearAlquiler(Alquiler nuevoAlquiler) {
        // verifico que el alquiler no exista en la lista de alquileres
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler != null) {
                if (alquiler.getCodigoAlquiler().equals(nuevoAlquiler.getCodigoAlquiler())) {
                    System.out.println("\nAlquiler ya existente, verifique los datos");
                    return false;
                }
            }
        }
        // Verificar que el vehiculo exista y esté disponible
        Vehiculo vehiculo = identificarVehiculo(nuevoAlquiler.getMatriculaVehiculo());
        if (vehiculo == null || vehiculo.getAlquiler() != null) {
            System.out.println("\nVehículo no disponible o no encontrado");
            return false;
        }

        // Verificar que el cliente exista y no tenga alquiler activo
        Cliente cliente = identificarCliente(nuevoAlquiler.getIdCliente());
        if (cliente == null) {
            System.out.println("\nCliente no disponible");
            return false;
        }

        // Verificar que el empleado exista
        Empleado empleado = identificarEmpleado(nuevoAlquiler.getIdEmpleado());
        if (empleado == null) {
            System.out.println("\nEmpleado no encontrado");
            return false;
        }

        // Agregar el alquiler a todas las listas necesarias
        listaAlquileres.add(nuevoAlquiler);
        empleado.getListaAlquileres().add(nuevoAlquiler);
        cliente.setAlquiler(nuevoAlquiler);
        vehiculo.setAlquiler(nuevoAlquiler);

        System.out.println("\nAlquiler creado exitosamente");

        return true;
    }

    /**
     * Método para identificar un empleado usando su identificación
     * 
     * @param idEmpleado
     * @return empleado identificado
     */
    public Empleado identificarEmpleado(String idEmpleado) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado != null) {
                if (empleado.getIdentificacion().equals(idEmpleado)) {
                    return empleado;
                }
            }
        }
        return null;
    }

    /**
     * Método para identificar un cliente usando su identificación
     * 
     * @param idCliente
     * @return cliente identificado
     */
    public Cliente identificarCliente(String idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente != null) {
                if (cliente.getIdentificacion().equals(idCliente)) {
                    return cliente;
                }
            }
        }
        return null;
    }

    /**
     * Método que elimina un alquiler
     * 
     * @param alquilerEliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarAlquiler(Alquiler alquilerEliminar) {
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler != null) {
                if (alquiler.getCodigoAlquiler().equals(alquilerEliminar.getCodigoAlquiler())) {

                    // Elimino el alquiler de la lista del empleado
                    Empleado empleado = identificarEmpleado(alquilerEliminar.getIdEmpleado());
                    if (empleado != null) {
                        LinkedList<Alquiler> listaAlquileresEmpleado = empleado.getListaAlquileres();
                        listaAlquileresEmpleado.remove(alquilerEliminar);
                    }

                    // Elimino el alquiler asociado al cliente
                    Cliente cliente = identificarCliente(alquilerEliminar.getIdCliente());
                    if (cliente != null) {
                        cliente.setAlquiler(null);
                    }

                    // Elimino el alquiler de la lista de alquileres de la empresa
                    listaAlquileres.remove(alquilerEliminar);
                    System.out.println("\nAlquiler eliminado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nAlquiler no encontrado, verifique los datos");
        return false;
    }

    /**
     * Método que actualiza un alquiler
     * 
     * @param codigoAlquiler
     * @param cliente
     * @param empleado
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarAlquiler(String codigoAlquiler, String idCliente, String idEmpleado, String fechaPrestamo,
            String fechaDevolucion, String matriculaVehiculo) {

        // Actualizo el alquiler en la lista de la empresa
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler != null) {
                if (alquiler.getCodigoAlquiler().equals(codigoAlquiler)) {
                    alquiler.setCodigoAlquiler(codigoAlquiler);
                    alquiler.setIdCliente(idCliente);
                    alquiler.setIdEmpleado(idEmpleado);
                    alquiler.setFechaPrestamo(fechaPrestamo);
                    alquiler.setFechaDevolucion(fechaDevolucion);
                    alquiler.setMatriculaVehiculo(matriculaVehiculo);

                    // Actualizo el alquiler en la lista de alquileres del empleado
                    Empleado empleado = identificarEmpleado(idEmpleado);
                    if (empleado == null) {
                        return false;
                    }
                    LinkedList<Alquiler> listaAlquileresEmpleado = empleado.getListaAlquileres();
                    for (Alquiler alquilerEmpleado : listaAlquileresEmpleado) {
                        if (alquilerEmpleado != null) {
                            if (alquilerEmpleado.getCodigoAlquiler().equals(codigoAlquiler)) {
                                alquilerEmpleado.setCodigoAlquiler(codigoAlquiler);
                                alquilerEmpleado.setIdCliente(idCliente);
                                alquilerEmpleado.setIdEmpleado(idEmpleado);
                                alquilerEmpleado.setFechaPrestamo(fechaPrestamo);
                                alquilerEmpleado.setFechaDevolucion(fechaDevolucion);
                                alquilerEmpleado.setMatriculaVehiculo(matriculaVehiculo);
                            }
                        }
                    }

                    // Actualizo el alquiler en la lista de alquileres del cliente
                    Cliente cliente = identificarCliente(idCliente);
                    if (cliente == null) {
                        return false;
                    }
                    if (cliente.getAlquiler() != null) {
                        Alquiler alquilerCliente = cliente.getAlquiler();
                        if (alquilerCliente.getCodigoAlquiler().equals(codigoAlquiler)) {
                            alquilerCliente.setCodigoAlquiler(codigoAlquiler);
                            alquilerCliente.setIdCliente(idCliente);
                            alquilerCliente.setIdEmpleado(idEmpleado);
                            alquilerCliente.setFechaPrestamo(fechaPrestamo);
                            alquilerCliente.setFechaDevolucion(fechaDevolucion);
                            alquilerCliente.setMatriculaVehiculo(matriculaVehiculo);
                        }
                    }

                    // Actualizo el alquiler en la lista de alquileres del vehiculo
                    Vehiculo vehiculo = identificarVehiculo(matriculaVehiculo);
                    if (vehiculo == null) {
                        return false;
                    }
                    if (vehiculo.getAlquiler() != null) {
                        Alquiler alquilerVehiculo = vehiculo.getAlquiler();
                        if (alquilerVehiculo.getCodigoAlquiler().equals(codigoAlquiler)) {
                            alquilerVehiculo.setCodigoAlquiler(codigoAlquiler);
                            alquilerVehiculo.setIdCliente(idCliente);
                            alquilerVehiculo.setIdEmpleado(idEmpleado);
                            alquilerVehiculo.setFechaPrestamo(fechaPrestamo);
                            alquilerVehiculo.setFechaDevolucion(fechaDevolucion);
                            alquilerVehiculo.setMatriculaVehiculo(matriculaVehiculo);
                        }
                    }
                    return true;
                }
            }
        }
        System.out.println("\nEl alquiler no esta registrado, verifique los datos");
        return false;
    }

    /**
     * Método que identifica un alquiler usando su codigo
     * 
     * @param codigoAlquiler
     * @return alquiler encontrado
     */
    public Alquiler identificarAlquiler(String codigoAlquiler) {
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler != null) {
                if (alquiler.getCodigoAlquiler().equals(codigoAlquiler)) {
                    return alquiler;
                }
            }
        }
        return null;
    }

    /**
     * Método que crea una venta
     * 
     * @param nuevaVenta
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearVenta(Venta nuevaVenta) {
        // Verificar que la venta no exista
        if (listaVentas.stream().anyMatch(venta -> venta.getCodigoVenta().equals(nuevaVenta.getCodigoVenta()))) {
            System.out.println("\nLa venta ya está registrada");
            return false;
        }

        // Verificar que exista el empleado
        Empleado empleado = identificarEmpleado(nuevaVenta.getIdEmpleado());
        if (empleado == null) {
            System.out.println("\nEmpleado no encontrado");
            return false;
        }

        // Verificar que exista el cliente
        Cliente cliente = identificarCliente(nuevaVenta.getIdCliente());
        if (cliente == null) {
            System.out.println("\nCliente no encontrado");
            return false;
        }

        // Verificar que exista el vehículo
        Vehiculo vehiculo = identificarVehiculo(nuevaVenta.getMatriculaVehiculo());
        if (vehiculo == null) {
            System.out.println("\nVehículo no encontrado");
            return false;
        }

        // Agregar la venta a las listas
        listaVentas.add(nuevaVenta);
        empleado.getListaVentas().add(nuevaVenta);
        cliente.getListaVentas().add(nuevaVenta);

        System.out.println("\nVenta registrada exitosamente");
        return true;
    }

    /**
     * Método que agrega una venta a un empleado
     * 
     * @param venta
     * @param empleado
     * @return
     */
    public boolean agregarVentaEmpleado(Venta venta, Empleado empleado) {
        for (Empleado empleadoAux : listaEmpleados) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(empleado.getIdentificacion())) {
                    LinkedList<Venta> listaVentasEmpleado = empleadoAux.getListaVentas();
                    listaVentasEmpleado.add(venta);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Método quen identifica un vehiculo usando su matricula
     * 
     * @param matriculaVehiculo
     * @return vehiculo con la matricula asociada
     */
    public Vehiculo identificarVehiculo(String matriculaVehiculo) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo != null) {
                if (vehiculo.getMatricula().equals(matriculaVehiculo)) {
                    return vehiculo;
                }
            }
        }
        return null;
    }

    /**
     * Método que elimina una venta
     * 
     * @param ventaEliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarVenta(Venta ventaEliminar) {
        for (Venta venta : listaVentas) {
            if (venta != null) {
                if (venta.getCodigoVenta().equals(ventaEliminar.getCodigoVenta())) {
                    
                    // Verifico el empleado
                    Empleado empleado = identificarEmpleado(ventaEliminar.getIdEmpleado());
                    if (empleado == null) {
                        return false;
                    }

                    // verifico el cliente
                    Cliente cliente = identificarCliente(ventaEliminar.getIdCliente());
                    if (cliente == null) {
                        return false;
                    }

                    // Elimino la venta de las listas
                    listaVentas.remove(ventaEliminar);
                    empleado.getListaVentas().remove(ventaEliminar);
                    cliente.getListaVentas().remove(ventaEliminar);
                    return true;
                }
            }
        }
        System.out.println("\nVenta no encontrada, verifique los datos");
        return false;
    }

    /**
     * Método que actualiza una venta
     * 
     * @param codigoVenta
     * @param idCliente
     * @param idEmpleado
     * @param matriculaVehiculo
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarVenta(String codigoVenta, String idCliente, String idEmpledo, String matriculaVehiculo) {
        for (Venta venta : listaVentas) {
            if (venta != null) {
                if (venta.getCodigoVenta().equals(codigoVenta)) {

                    // Actualizo la venta en la lista de ventas de la empresa
                    venta.setCodigoVenta(codigoVenta);
                    venta.setIdCliente(idCliente);
                    venta.setIdEmpleado(idEmpledo);
                    venta.setMatriculaVehiculo(matriculaVehiculo);

                    // Actualizo la venta en la lista de ventas del empleado
                    Empleado empleado = identificarEmpleado(idEmpledo);
                    LinkedList<Venta> listaVentasEmpleado = empleado.getListaVentas();
                    boolean verificarVentaEmpleado = empleado.existeVenta(venta);
                    if (verificarVentaEmpleado) {
                        for (Venta venta2 : listaVentasEmpleado) {
                            if (venta2 != null) {
                                if (venta2.getCodigoVenta().equals(codigoVenta)) {
                                    venta2.setCodigoVenta(codigoVenta);
                                    venta2.setIdCliente(idCliente);
                                    venta2.setIdEmpleado(idEmpledo);
                                    venta2.setMatriculaVehiculo(matriculaVehiculo);
                                }
                            }
                        }
                    }
                    listaVentasEmpleado.add(venta);
                    for (Venta venta2 : listaVentasEmpleado) {
                        if (venta2 != null) {
                            if (venta2.getCodigoVenta().equals(codigoVenta)) {
                                venta2.setCodigoVenta(codigoVenta);
                                venta2.setIdCliente(idCliente);
                                venta2.setIdEmpleado(idEmpledo);
                                venta2.setMatriculaVehiculo(matriculaVehiculo);
                            }
                        }
                    }

                    // Actualizo la lista de ventas del cliente
                    Cliente cliente = identificarCliente(idCliente);
                    LinkedList<Venta> listaVentasCliente = cliente.getListaVentas();
                    boolean verificarVentaCliente = cliente.existeVenta(venta);
                    if (verificarVentaCliente) {
                        for (Venta venta2 : listaVentasCliente) {
                            if (venta2 != null) {
                                if (venta2.getCodigoVenta().equals(codigoVenta)) {
                                    venta2.setCodigoVenta(codigoVenta);
                                    venta2.setIdCliente(idCliente);
                                    venta2.setIdEmpleado(idEmpledo);
                                    venta2.setMatriculaVehiculo(matriculaVehiculo);
                                }
                            }
                        }
                    }
                    listaVentasCliente.add(venta);
                    for (Venta venta2 : listaVentasCliente) {
                        if (venta2 != null) {
                            if (venta2.getCodigoVenta().equals(codigoVenta)) {
                                venta2.setCodigoVenta(codigoVenta);
                                venta2.setIdCliente(idCliente);
                                venta2.setIdEmpleado(idEmpledo);
                                venta2.setMatriculaVehiculo(matriculaVehiculo);
                            }
                        }
                    }
                    return true;
                }
            }
        }
        System.out.println("\nNo se ha encontrado la venta, verifique los datos");
        return false;
    }

    /**
     * Método que crea una compra
     * 
     * @param nuevaCompra
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearCompra(Compra nuevaCompra) {
        for (Compra compra : listaCompras) {
            if (compra != null) {
                if (compra.getCodigoCompra().equals(nuevaCompra.getCodigoCompra())) {
                    System.out.println("\nLa compra ya esta registrado, verifique los datos");
                    return false;
                }
            }
        }
        Vehiculo vehiculo = identificarVehiculo(nuevaCompra.getMatriculaVehiculo());
        if (vehiculo != null) {
            // Agrego la compra al empleado
            Empleado empleado = identificarEmpleado(nuevaCompra.getIdEmpleado());
            if (empleado == null) {
                System.out.println("\nEmpleado no encontrado");
                return false;
            }
            LinkedList<Compra> listaComprasEmpleado = empleado.getListaCompras();
            listaComprasEmpleado.add(nuevaCompra);

            // Agrego la compra al cliente
            Cliente cliente = identificarCliente(nuevaCompra.getIdcliente());
            if (cliente == null) {
                System.out.println("\nCliente no encontrado");
                return false;
            }
            LinkedList<Compra> listaComprasCliente = cliente.getListaCompras();
            listaComprasCliente.add(nuevaCompra);

            // Agrego la compra a la lista de compras de la empresa
            listaCompras.add(nuevaCompra);

            System.out.println("\nCompra registrada con exito");
            return true;
        }
        System.out.println("\nVehiculo no encontrado");
        return false;
    }

    /**
     * Método que elimina una compra
     * 
     * @param compraEliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarCompra(Compra compraEliminar) {
        for (Compra compra : listaCompras) {
            if (compra != null) {
                if (compra.getCodigoCompra().equals(compraEliminar.getCodigoCompra())) {

                    // Elimino la compra en el empleado
                    Empleado empleado = identificarEmpleado(compraEliminar.getIdEmpleado());
                    if (empleado != null) {
                        LinkedList<Compra> listaComprasEmpleado = empleado.getListaCompras();
                        listaComprasEmpleado.remove(compraEliminar);
                    }

                    // Elimino la compra en el cliente
                    Cliente cliente = identificarCliente(compraEliminar.getIdcliente());
                    if (cliente != null) {
                        LinkedList<Compra> listaComprasCliente = cliente.getListaCompras();
                        listaComprasCliente.remove(compraEliminar);
                    }

                    // Elimino la compra en la lista de compras de la empresa
                    listaCompras.remove(compraEliminar);

                    System.out.println("\nCompra eliminada con exito");
                    return true;
                }
            }
        }
        System.out.println("\nLa compra no esta registrada, verifique los datos");
        return false;
    }

    /**
     * Método que actualiza una compra
     * 
     * @param codigoCompra
     * @param idCliente
     * @param idEmpleado
     * @param matriculaVehiculo
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarCompra(String codigoCompra, String idCliente, String idEmpleado,
            String matriculaVehiculo) {
        for (Compra compra : listaCompras) {
            if (compra != null) {
                if (compra.getCodigoCompra().equals(codigoCompra)) {

                    // Actualizo la compra en la lista de compras de la empresa
                    compra.setCodigoCompra(codigoCompra);
                    compra.setIdcliente(idCliente);
                    compra.setIdEmpleado(idEmpleado);
                    compra.setMatriculaVehiculo(matriculaVehiculo);

                    // Actualizo la compra en la lista de compras del empleado
                    Empleado empleado = identificarEmpleado(idEmpleado);
                    if (empleado != null) {
                        LinkedList<Compra> listaComprasEmpleado = empleado.getListaCompras();
                        for (Compra compraEmpleado : listaComprasEmpleado) {
                            if (compraEmpleado != null) {
                                if (compraEmpleado.getCodigoCompra().equals(codigoCompra)) {
                                    compraEmpleado.setCodigoCompra(codigoCompra);
                                    compraEmpleado.setIdcliente(idCliente);
                                    compraEmpleado.setIdEmpleado(idEmpleado);
                                    compraEmpleado.setMatriculaVehiculo(matriculaVehiculo);

                                    // Actualizo la compra en la lista de compras del cliente
                                    Cliente cliente = identificarCliente(idCliente);
                                    if (cliente != null) {
                                        LinkedList<Compra> listaComprasCliente = cliente.getListaCompras();
                                        if (cliente != null) {
                                            for (Compra compraCliente : listaComprasCliente) {
                                                if (compraCliente != null) {
                                                    if (compraCliente.getCodigoCompra().equals(codigoCompra)) {
                                                        compraCliente.setCodigoCompra(codigoCompra);
                                                        compraCliente.setIdcliente(idCliente);
                                                        compraCliente.setIdEmpleado(idEmpleado);
                                                        compraCliente.setMatriculaVehiculo(matriculaVehiculo);
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\nCompra no encontrada, verifique los datos");
        return false;
    }

    public boolean iniciarSesion(String identificacion, String contraseña) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado != null) {
                if (empleado.getIdentificacion().equals(identificacion)
                        && empleado.getContrasenia().equals(contraseña)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Método para iniciar sesion usando la palabra clave
     * 
     * @param palabraClave
     * @return true si se inicio sesion, false si no se pudo iniciar sesion
     */
    public boolean iniciarSesionPalabraClave(String palabraClave) {
        if (palabraClave.equals(this.palabraClave)) {
            return true;
        } else {
            return false;
        }

    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    /**
     * Método que genera un reporte de ventas de un empleado
     * 
     * @param idEmpleado
     * @return lista de ventas de un empleado
     */
    public ObservableList<Venta> generarReporteVentasEmpleado(String idEmpleado) {
        Empleado empleado = identificarEmpleado(idEmpleado);
        if (empleado != null) {
            ObservableList<Venta> listaVentasEmpleado = javafx.collections.FXCollections
                    .observableList(empleado.getListaVentas());
            return listaVentasEmpleado;
        }
        return javafx.collections.FXCollections.observableArrayList();
    }

    /**
     * Método que genera un reporte de compras de un empleado
     * 
     * @param idEmpleado
     * @return lista de compras de un empleado
     */
    public ObservableList<Compra> generarReporteComprasEmpleado(String idEmpleado) {
        Empleado empleado = identificarEmpleado(idEmpleado);
        if (empleado != null) {
            ObservableList<Compra> listaComprasEmpleado = javafx.collections.FXCollections
                    .observableList(empleado.getListaCompras());
            return listaComprasEmpleado;
        }
        return javafx.collections.FXCollections.observableArrayList();
    }

    public void inicializarDatos() {
        Vehiculo vehiculo = new Vehiculo(TipoTransmision.MANUAL, "Nissan", "Nuevo", "Skyline", "6", "250km",
                "2.6 litros", "12345678", TipoDeVehiculo.GASOLINA);
        listaVehiculos.add(vehiculo);

        Empleado empleado = new Empleado("Juan", "123", "12334", "123", "100000", "123");
        listaEmpleados.add(empleado);

        Cliente cliente = new Cliente("Pedro", "321", "1234", "1234");
        listaClientes.add(cliente);
    }

    public ObservableList<Vehiculo> obtenerListaVehiculosEmpresa() {
        ObservableList<Vehiculo> listaVehiculosObservable = javafx.collections.FXCollections
                .observableList(listaVehiculos);
        return listaVehiculosObservable;
    }

    public ObservableList<Empleado> obtenerListaEmpleadosEmpresa() {
        ObservableList<Empleado> listaEmpleadosObservable = javafx.collections.FXCollections
                .observableList(listaEmpleados);
        return listaEmpleadosObservable;
    }

    public ObservableList<Cliente> obtenerListaClientesEmpresa() {
        ObservableList<Cliente> listaClientesObservable = javafx.collections.FXCollections
                .observableList(listaClientes);
        return listaClientesObservable;
    }

    public ObservableList<Alquiler> obtenerListaAlquileresEmpresa() {
        ObservableList<Alquiler> listaAlquileresObservable = javafx.collections.FXCollections
                .observableList(listaAlquileres);
        return listaAlquileresObservable;
    }

    public ObservableList<Compra> obtenerListaComprasEmpresa() {
        ObservableList<Compra> listaComprasObservable = javafx.collections.FXCollections.observableList(listaCompras);
        return listaComprasObservable;
    }

    public ObservableList<Venta> obtenerListaVentasEmpresa() {
        ObservableList<Venta> listaVentasObservable = javafx.collections.FXCollections.observableList(listaVentas);
        return listaVentasObservable;
    }

}
