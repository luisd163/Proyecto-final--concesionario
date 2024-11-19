package co.edu.unquindio.poo.model;

public class Persona {
    
    private String nombre, identificacion, telefono, correo;

    /**
     * Método constructor 
     * @param nombre
     * @param identificacion
     * @param telefono
     * @param correo
     */
    public Persona(String nombre, String identificacion, String telefono, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
