package co.edu.unquindio.poo.model;

public class Moto extends Vehiculo {

    private Alquiler alquiler;
    private String color;

    /**
     * Método constructor 
     * @param tipoTransmision
     * @param marca
     * @param nuevoOUsado
     * @param modelo
     * @param cambios
     * @param velocidadMaxima
     * @param cilindraje
     * @param matricula
     * @param tipoDeVehiculo
     * @param color
     */
    public Moto(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo, String cambios,
            String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo, String color) {
        super(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula,
                tipoDeVehiculo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public String toString() {
        return "Moto [alquiler=" + alquiler + ", tipoTransmision=" + tipoTransmision + ", color=" + color + ", marca="
                + marca + ", nuevoOUsado=" + nuevoOUsado + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", matricula=" + matricula
                + ", tipoDeVehiculo=" + tipoDeVehiculo + "]";
    }

   

    

   

}
