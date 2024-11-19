package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import co.edu.unquindio.poo.model.Alquiler;
import co.edu.unquindio.poo.model.Cliente;
import co.edu.unquindio.poo.model.Empleado;
import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.model.Vehiculo;
import co.edu.unquindio.poo.model.Venta;

public class EmpleadoTest {

    @Test
    public void existeAlquilerTest() {
        Empresa empresa = new Empresa("TuCarroUQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "567", null, null);
        Vehiculo vehiculo = new Vehiculo(null, null, null, null, null, null, null, 
        "123", null);
        Alquiler alquiler = new Alquiler("123", "567", "123", null, null, "123");
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        empresa.crearAlquiler(alquiler);

        assertTrue(empleado.existeAlquiler(alquiler));
    }

    @Test
    public void existeVentaTest() {
        Empresa empresa = new Empresa("TuCarroUQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "567", null, null);
        Vehiculo vehiculo = new Vehiculo(null, null, null, null, null, null, null, 
        "123", null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Venta venta = new Venta("1334", "567", "123", "123");
        empresa.crearVenta(venta);

        assertTrue(empleado.existeVenta(venta));
    }

    @Test
    public void existeCompraTest() {
        Empresa empresa = new Empresa("TuCarroUQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "567", null, null);
        Vehiculo vehiculo = new Vehiculo(null, null, null, null, null, null, null, 
        "123", null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Venta venta = new Venta("1334", "567", "123", "123");
        empresa.crearVenta(venta);

        assertTrue(empleado.existeVenta(venta));
    }
}
