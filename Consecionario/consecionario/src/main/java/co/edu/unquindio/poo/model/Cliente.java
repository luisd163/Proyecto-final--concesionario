package co.edu.unquindio.poo.model;

import java.util.LinkedList;

public class Cliente extends Persona{

    Alquiler alquiler;
    LinkedList<Compra> listaCompras; // En este caso, listaCompras son las ventas que realizo el cliente a la empresa
    LinkedList<Venta> listaVentas; // En este caso, listaVentas son las compras que le realizo el cliente a la empresa
    
    /**
     * Método constructor
     * @param nombre
     * @param identificacion
     * @param telefono
     * @param correo
     */
    public Cliente (String nombre, String identificacion, String telefono, String correo) {
        super(nombre, identificacion, telefono, correo);
        listaCompras = new LinkedList<>();
        listaVentas = new LinkedList<>();
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
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

    @Override
    public String toString() {
        return "Cliente [alquiler=" + alquiler + ", listaCompras=" + listaCompras + ", listaVentas=" + listaVentas
                + "]";
    }

    /**
     * Método que verifica si una venta esta en la lista de ventas del cliente
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
     * Método que verifica si una compra esta en la lista de compras del cliente
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
