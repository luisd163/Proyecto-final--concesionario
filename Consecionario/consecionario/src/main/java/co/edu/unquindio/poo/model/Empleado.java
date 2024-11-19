package co.edu.unquindio.poo.model;

import java.util.LinkedList;

public class Empleado extends Persona {

    private String sueldo;
    private String contrasenia;
    public LinkedList<Alquiler> listaAlquileres;
    public LinkedList<Venta> listaVentas;
    public LinkedList<Compra> listaCompras;

    /**
     * Método constructor
     * 
     * @param nombre
     * @param identificacion
     * @param telefono
     * @param correo
     * @param sueldo
     * @param contrasenia
     */
    public Empleado(String nombre, String identificacion, String telefono, String correo, String sueldo,
            String contrasenia) {
        super(nombre, identificacion, telefono, correo);
        this.sueldo = sueldo;
        this.contrasenia = contrasenia;
        listaAlquileres = new LinkedList<>();
        listaVentas = new LinkedList<>();
        listaCompras = new LinkedList<>();
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public LinkedList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(LinkedList<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public LinkedList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(LinkedList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public LinkedList<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(LinkedList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contraseña) {
        this.contrasenia = contraseña;
    }

    @Override
    public String toString() {
        return "Empleado [sueldo=" + sueldo + ", contraseña=" + contrasenia + ", listaAlquileres=" + listaAlquileres
                + ", listaVentas=" + listaVentas + ", listaCompras=" + listaCompras + "]";
    }

    /**
     * Método que verifica si un alquiler esta en la listade alquileres del empleado
     * 
     * @param alquilerVerificar
     * @return
     */
    public boolean existeAlquiler(Alquiler alquilerVerificar) {
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler != null) {
                if (alquiler.getCodigoAlquiler().equals(alquilerVerificar.getCodigoAlquiler())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Método que verifica si una venta esta en la lista de ventas del empleado
     * 
     * @param ventaVerificar
     * @return
     */
    public boolean existeVenta(Venta ventaVerificar) {
        for (Venta venta : listaVentas) {
            if (venta != null) {
                if (venta.getCodigoVenta().equals(ventaVerificar.getCodigoVenta())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Método que verifica si una compra esta en la lista de compras del empleado
     * @param compraVerificar
     * @return
     */
    public boolean existeCompra(Compra compraVerificar) {
        for (Compra compra : listaCompras) {
            if (compra != null) {
                if (compra.getCodigoCompra().equals(compraVerificar.getCodigoCompra())) {
                    return true;
                }
            }
        }
        return false;
    }

}
