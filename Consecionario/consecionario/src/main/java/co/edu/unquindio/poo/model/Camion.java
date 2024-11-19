package co.edu.unquindio.poo.model;

public class Camion extends Vehiculo {

    private Alquiler alquiler;
    private String capacidadCarga;
    private String aireACondicionado, frenosDeAire, abs;
    private String numeroEjes;
    private TipoCamion TipoCamion;

    /**
     * Método constructor
     * 
     * @param tipoTransmision
     * @param marca
     * @param nuevoOUsado
     * @param modelo
     * @param cambios
     * @param velocidadMaxima
     * @param cilindraje
     * @param matricula
     * @param tipoDeVehiculo
     * @param capacidadCarga
     * @param aireACondicionado
     * @param frenosDeAire
     * @param abs
     * @param numeroEjes
     * @param tipoCamion
     */
    public Camion(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo, String cambios,
            String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo,
            String capacidadCarga, String aireACondicionado, String frenosDeAire, String abs, String numeroEjes,
            TipoCamion tipoCamion) {
        super(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula,
                tipoDeVehiculo);
        this.capacidadCarga = capacidadCarga;
        this.aireACondicionado = aireACondicionado;
        this.frenosDeAire = frenosDeAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        TipoCamion = tipoCamion;
    }

    public String getAireACondicionado() {
        return aireACondicionado;
    }

    public void setAireACondicionado(String aireACondicionado) {
        this.aireACondicionado = aireACondicionado;
    }

    public String getFrenosDeAire() {
        return frenosDeAire;
    }

    public void setFrenosDeAire(String frenosDeAire) {
        this.frenosDeAire = frenosDeAire;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(String numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TipoCamion getTipoCamion() {
        return TipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        TipoCamion = tipoCamion;
    }

    @Override
    public String toString() {
        return "Camion [alquiler=" + alquiler + ", tipoTransmision=" + tipoTransmision + ", capacidadCarga="
                + capacidadCarga + ", marca=" + marca + ", nuevoOUsado=" + nuevoOUsado + ", modelo=" + modelo
                + ", aireACondicionado=" + aireACondicionado + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", frenosDeAire=" + frenosDeAire + ", cilindraje=" + cilindraje + ", abs=" + abs
                + ", matricula=" + matricula + ", numeroEjes=" + numeroEjes + ", tipoDeVehiculo=" + tipoDeVehiculo
                + ", TipoCamion=" + TipoCamion + "]";
    }

}
