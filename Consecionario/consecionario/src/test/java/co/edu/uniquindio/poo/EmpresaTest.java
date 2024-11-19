package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import co.edu.unquindio.poo.model.Vehiculo;
import co.edu.unquindio.poo.model.Venta;
import co.edu.unquindio.poo.model.Alquiler;
import co.edu.unquindio.poo.model.Cliente;
import co.edu.unquindio.poo.model.Compra;
import co.edu.unquindio.poo.model.Deportivo;
import co.edu.unquindio.poo.model.Empleado;
import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.model.Moto;
import co.edu.unquindio.poo.model.TipoTransmision;

public class EmpresaTest {

    @Test
    public void crearVentaEMpleadoTest() {
        
    }

    @Test
    public void crearVehiculoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Vehiculo vehiculo1 = new Moto(null, null, null, null, null, null, null, "1234", null, null);

        assertTrue(empresa.crearVehiculo(vehiculo1));
    }

    @Test
    public void eliminarVehiculoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Vehiculo vehiculo1 = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearVehiculo(vehiculo1);
        
        assertTrue(empresa.eliminarVehiculo(vehiculo1));
    }

    @Test
    public void actualizarVehiculoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Vehiculo vehiculo1 = new Deportivo(TipoTransmision.AUTOMATICA, null, null, null, null, null, 
        null, "123", null, null, null, null, null, null);
        empresa.crearVehiculo(vehiculo1);

        assertTrue(empresa.actualizarVehiculo(null, null, null, null, null, 
        null, null, "123", null));
    }

    @Test
    public void crearEmpleadoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado1 = new Empleado(null, "1123", null, null, null, "12");

        assertTrue(empresa.crearEmpleado(empleado1));
    }

    @Test
    public void eliminarEmpleadoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado1 = new Empleado(null, "12", null, null, null, null);
        empresa.crearEmpleado(empleado1);

        assertTrue(empresa.eliminarEmpleado(empleado1));
    }

    @Test
    public void actualizarEmpleadoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado1 = new Empleado(null, "123", null, null, null, null);
        empresa.crearEmpleado(empleado1);

        assertTrue(empresa.actualizarEmpleado("juan", "123", "32134556", "Juan@uqvirtual", "10000"));
    }

    @Test
    public void crearClienteTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Cliente cliente1 = new Cliente(null, "123", null, null);

        assertTrue(empresa.crearCliente(cliente1));

    }

    @Test
    public void eliminarClienteTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Cliente cliente1 = new Cliente(null, "123", null, null);
        empresa.crearCliente(cliente1);

        assertTrue(empresa.eliminarCliente(cliente1));

    }

    @Test
    public void actualizarClienteTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Cliente cliente1 = new Cliente(null, "123", null, null);
        empresa.crearCliente(cliente1);

        assertTrue(empresa.actualizarCliente(null, "123", null, null));
    }

    @Test
    public void crearAlquilerTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "1234", null, null);
        Alquiler alquiler = new Alquiler("1234", "5678", "123", null, null, "1234");

        assertTrue(empresa.crearAlquiler(alquiler));
    }

    @Test
    public void eliminarAlquilerTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "321", null, null, null, 
        "123");
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        Alquiler alquiler = new Alquiler("1234", "5678", "321", null, null, "123");
        empresa.crearAlquiler(alquiler);

        assertTrue(empresa.eliminarAlquiler(alquiler));
    }


    /**
     * REVISAR
     */
    @Test
    public void actualizarAlquilerTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        Alquiler alquiler = new Alquiler("123", "5678", "123", null, null, "123");
        empresa.crearAlquiler(alquiler);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);

        Empleado empleado2 = new Empleado(null, "321", null, null, null, null);
        Cliente cliente2 = new Cliente(null, "123", null, null);
        Vehiculo vehiculo2 = new Moto(null, null, null, null, null, null, null, "321", null, null);
        empresa.crearEmpleado(empleado2);
        empresa.crearCliente(cliente2);
        empresa.crearVehiculo(vehiculo2);

        assertTrue(empresa.actualizarAlquiler("123", "123", "321", null, null, "321"));
    }

    @Test
    public void crearVentaTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Venta venta = new Venta("123", "5678", "123", "123");
        
        assertTrue(empresa.crearVenta(venta));
    }

    @Test
    public void eliminarVentaTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Venta venta = new Venta("123", "5678", "123", "123");
        empresa.crearVenta(venta);

        assertTrue(empresa.eliminarVenta(venta));
    }

    @Test
    public void actualizarVenta() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Venta venta = new Venta("123", "5678", "123", "123");
        empresa.crearVenta(venta);
        Cliente cliente2 = new Cliente(null, "123", null, null);
        Empleado empleado2 = new Empleado(null, "5678", null, null, null, null);
        empresa.crearCliente(cliente2);
        empresa.crearEmpleado(empleado2);

        assertTrue(empresa.actualizarVenta("123", "123", "5678", null));
    }

    @Test
    public void crearCompraTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Compra compra = new Compra("123", "123", "5678", "123");

        assertTrue(empresa.crearCompra(compra));
    }

    @Test
    public void eliminarCompraTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Compra compra = new Compra("123", "123", "5678", "123");
        empresa.crearCompra(compra);

        assertTrue(empresa.eliminarCompra(compra));
    }

    @Test
    public void actualizarCompraTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        Compra compra = new Compra("123", "5678", "123", "123");
        empresa.crearCompra(compra);

        assertTrue(empresa.actualizarCompra("123", "5678", "123", "123"));
    }

    @Test
    public void iniciarSesionTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, "123");
        empresa.crearEmpleado(empleado);

        assertTrue(empresa.iniciarSesion("123", "123"));
    }

    @Test
    public void iniciarSesionPalabraClaveTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "XLR8");

        assertTrue(empresa.iniciarSesionPalabraClave("XLR8"));
    }

    @Test
    public void identificarEmpleadoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        empresa.crearEmpleado(empleado);

        assertEquals(empleado, empresa.identificarEmpleado("123"));
    }

    @Test
    public void identificarClienteTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Cliente cliente = new Cliente(null, "5678", null, null);
        empresa.crearCliente(cliente);

        assertEquals(cliente, empresa.identificarCliente("5678"));
    }

    @Test
    public void identificarVehiculoTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        empresa.crearVehiculo(vehiculo);

        assertEquals(vehiculo, empresa.identificarVehiculo("123"));
    }

    @Test
    public void identificarAlquilerTest() {
        Empresa empresa = new Empresa("Tu Carro UQ", "a");
        Empleado empleado = new Empleado(null, "123", null, null, null, null);
        Cliente cliente = new Cliente(null, "5678", null, null);
        Vehiculo vehiculo = new Moto(null, null, null, null, null, null, null, "123", null, null);
        Alquiler alquiler = new Alquiler("123", "5678", "123", null, null, "123");
        empresa.crearEmpleado(empleado);
        empresa.crearCliente(cliente);
        empresa.crearVehiculo(vehiculo);
        empresa.crearAlquiler(alquiler);

        assertEquals(alquiler, empresa.identificarAlquiler("123"));
    }


}
