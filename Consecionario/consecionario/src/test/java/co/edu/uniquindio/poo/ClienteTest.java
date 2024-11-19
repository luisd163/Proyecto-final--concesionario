package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import co.edu.unquindio.poo.model.Cliente;
import co.edu.unquindio.poo.model.Compra;
import co.edu.unquindio.poo.model.Empleado;
import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.model.Moto;
import co.edu.unquindio.poo.model.Vehiculo;
import co.edu.unquindio.poo.model.Venta;

public class ClienteTest {

    @Test
    public void existeVentaTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "567", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Venta venta = new Venta("123", "567", "123", "123");
        empresa.crearVenta(venta);

        assertTrue(cliente.existeVenta(venta));
    }

    @Test
    public void existeCompraTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "567", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Compra compra = new Compra("12345", "567", "123", "123");
        empresa.crearCompra(compra);

        assertTrue(cliente.existeCompra(compra));
    }
}
