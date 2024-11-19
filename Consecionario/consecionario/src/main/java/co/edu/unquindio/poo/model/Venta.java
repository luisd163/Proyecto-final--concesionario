package co.edu.unquindio.poo.model;

public class Venta {

    private String codigoVenta;
    private String idCliente;
    private String idEmpleado;
    private String matriculaVehiculo;

    /**
     * Método constructor
     * 
     * @param codigoVenta
     * @param idCliente
     * @param idEmpleado
     * @param matriculaVehiculo
     */
    public Venta(String codigoVenta, String idCliente, String idEmpleado, String matriculaVehiculo) {
        this.codigoVenta = codigoVenta;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.matriculaVehiculo = matriculaVehiculo;

    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getMatriculaVehiculo() {
        return matriculaVehiculo;
    }

    public void setMatriculaVehiculo(String matriculaVehiculo) {
        this.matriculaVehiculo = matriculaVehiculo;
    }

    @Override
    public String toString() {
        return "Venta [codigoVenta=" + codigoVenta + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado
                + ", matriculaVehiculo=" + matriculaVehiculo + "]";
    }

}
