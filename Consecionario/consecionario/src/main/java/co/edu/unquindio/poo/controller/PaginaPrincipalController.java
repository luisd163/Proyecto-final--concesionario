package co.edu.unquindio.poo.controller;

import java.util.LinkedList;

import co.edu.unquindio.poo.model.Alquiler;
import co.edu.unquindio.poo.model.Cliente;
import co.edu.unquindio.poo.model.Compra;
import co.edu.unquindio.poo.model.Empleado;
import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.model.Vehiculo;
import co.edu.unquindio.poo.model.Venta;

public class PaginaPrincipalController {

    Empresa empresa;

    public PaginaPrincipalController(Empresa empresa) {
        this.empresa = empresa;
    }

    public LinkedList<Vehiculo> obtenerVehiculos() {
        return empresa.getListaVehiculos();
    }

    public boolean crearAlquiler(Alquiler alquiler) {
        return empresa.crearAlquiler(alquiler);
    }

    public boolean crearCliente(Cliente cliente) {
        return empresa.crearCliente(cliente);
    }

    public boolean eliminarCliente(Cliente cliente) {
        return empresa.eliminarCliente(cliente);
    }

    public boolean actualizarCliente(String nombreCliente, String identificacionCliente, String telefonoCliente, String correoCliente) {
        return empresa.actualizarCliente(nombreCliente, identificacionCliente, telefonoCliente, correoCliente);
    }

    public boolean crearEmpleado(Empleado empleado) {
        return empresa.crearEmpleado(empleado);
    }

    public boolean actualizarEmpleado(String nombreEmpleado, String identificacionEmpleado, String telefonoEmpleado, String correoEmpleado, String sueldoEmpleado,
            String contrasenia) {
        return empresa.actualizarEmpleado(nombreEmpleado, identificacionEmpleado, telefonoEmpleado, correoEmpleado, sueldoEmpleado);
    }

    public boolean eliminarEmpleado(Empleado empleado) {
        return empresa.eliminarEmpleado(empleado);
    }

    public boolean crearCompra(Compra compra) {
        return empresa.crearCompra(compra);
    }

    public boolean actualizarCompra(String idCliente, String idEmpleado, String codigoCompra, String matriculaVehiculo) {
        return empresa.actualizarCompra(codigoCompra, idCliente, idEmpleado, matriculaVehiculo);
    }

    public boolean eliminarCompra(Compra compra) {
        return empresa.eliminarCompra(compra);
    }

    public boolean eliminarAlquiler(Alquiler alquiler) {
        return empresa.eliminarAlquiler(alquiler);
    }

    public boolean actualizarAlquiler(String codigo, String idCliente, String idEmpleado, String fechaPrestamo, String fechaDevolucion,
            String matriculaVehiculo) {
        return empresa.actualizarAlquiler(codigo, idCliente, idEmpleado, fechaPrestamo, fechaDevolucion, matriculaVehiculo);
    }

    public boolean crearVenta(Venta venta) {
        return empresa.crearVenta(venta);
    }

    public boolean eliminarVenta(Venta venta) {
        return empresa.eliminarVenta(venta);
    }

    public boolean actualizarVenta(String codigoVenta, String idCliente, String idEmpleado, String matriculaVehiculo) {
        return empresa.actualizarVenta(codigoVenta, idCliente, idEmpleado, matriculaVehiculo);
    }



}
