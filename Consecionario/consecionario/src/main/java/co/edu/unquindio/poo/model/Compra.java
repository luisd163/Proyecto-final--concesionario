package co.edu.unquindio.poo.model;

public class Compra {

    private String codigoCompra, idcliente, idEmpleado, matriculaVehiculo;

    /**
     * Método constructor
     * 
     * @param codigoCompra
     * @param idCliente
     * @param idEmpleado
     * @param matriculaVehiculo
     */
    public Compra(String codigoCompra, String idCliente, String idEmpleado, String matriculaVehiculo) {
        this.codigoCompra = codigoCompra;
        this.idcliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.matriculaVehiculo = matriculaVehiculo;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
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
        return "Compra [codigoCompra=" + codigoCompra + ", idcliente=" + idcliente + ", idEmpleado=" + idEmpleado
                + ", matriculaVehiculo=" + matriculaVehiculo + "]";
    }

}
