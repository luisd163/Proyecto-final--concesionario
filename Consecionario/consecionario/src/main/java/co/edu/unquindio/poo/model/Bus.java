package co.edu.unquindio.poo.model;

public class Bus extends Van {

    private Alquiler alquiler;
    private String numeroEjes, salidasEmergencia;

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
     * @param numeroPasajeros
     * @param numeroPuertas
     * @param numeroBolsasAire
     * @param capacidadMaletero
     * @param aireACondicionado
     * @param camaraReversa
     * @param abs
     * @param numeroEjes
     * @param salidasEmergencia
     */
    public Bus(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo, String cambios,
            String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo,
            String numeroPasajeros, String numeroPuertas, String numeroBolsasAire, String capacidadMaletero,
            String aireACondicionado, String camaraReversa, String abs, String numeroEjes, String salidasEmergencia) {
        super(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula,
                tipoDeVehiculo, numeroPasajeros, numeroPuertas, numeroBolsasAire, capacidadMaletero, aireACondicionado,
                camaraReversa, abs);
        this.numeroEjes = numeroEjes;
        this.salidasEmergencia = salidasEmergencia;
    }

    public String getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(String numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(String salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }

    @Override
    public String toString() {
        return "Bus [alquiler=" + alquiler + ", numeroEjes=" + numeroEjes + ", salidasEmergencia=" + salidasEmergencia
                + ", tipoTransmision=" + tipoTransmision + ", marca=" + marca + ", nuevoOUsado=" + nuevoOUsado
                + ", modelo=" + modelo + ", cambios=" + cambios + ", velocidadMaxima=" + velocidadMaxima
                + ", cilindraje=" + cilindraje + ", matricula=" + matricula + ", tipoDeVehiculo=" + tipoDeVehiculo
                + "]";
    }

}
