package co.edu.unquindio.poo.model;

public class Alquiler {

    private String codigoAlquiler;
    private String idCliente;
    private String idEmpleado;
    private String fechaPrestamo, fechaDevolucion;
    private String matriculaVehiculo;

    /**
     * Método constructor
     * @param codigoAlquiler
     * @param idCliente
     * @param idEmpleado
     * @param fechaPrestamo
     * @param fechaDevolucion
     * @param matriculaVehiculo
     */
    public Alquiler(String codigoAlquiler, String idCliente, String idEmpleado, String fechaPrestamo,
            String fechaDevolucion, String matriculaVehiculo) {
        this.codigoAlquiler = codigoAlquiler;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.matriculaVehiculo = matriculaVehiculo;
    }

    public String getCodigoAlquiler() {
        return codigoAlquiler;
    }

    public void setCodigoAlquiler(String codigoAlquiler) {
        this.codigoAlquiler = codigoAlquiler;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getMatriculaVehiculo() {
        return matriculaVehiculo;
    }

    public void setMatriculaVehiculo(String matriculaVehiculo) {
        this.matriculaVehiculo = matriculaVehiculo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Alquiler [codigoAlquiler=" + codigoAlquiler + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado
                + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", matriculaVehiculo="
                + matriculaVehiculo + "]";
    }

    
}
