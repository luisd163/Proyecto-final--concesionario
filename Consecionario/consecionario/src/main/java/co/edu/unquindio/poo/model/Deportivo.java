package co.edu.unquindio.poo.model;

public class Deportivo extends Vehiculo {

    private Alquiler alquiler;
    private String numeroPasajeros, numeroPuertas, numeroBolsasDeAire;
    private String caballosDeFuerza, tiempo0A100;

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
     * @param numeroPasajeros
     * @param numeroPuertas
     * @param numeroBolsasDeAire
     * @param caballosDeFuerza
     * @param tiempo0a100
     */
    public Deportivo(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo, String cambios,
            String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo,
            String numeroPasajeros, String numeroPuertas, String numeroBolsasDeAire, String caballosDeFuerza,
            String tiempo0a100) {
        super(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula,
                tipoDeVehiculo);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.caballosDeFuerza = caballosDeFuerza;
        tiempo0A100 = tiempo0a100;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public String getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(String numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(String numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    public String getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(String caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public String getTiempo0A100() {
        return tiempo0A100;
    }

    public void setTiempo0A100(String tiempo0a100) {
        tiempo0A100 = tiempo0a100;
    }

    @Override
    public String toString() {
        return "Deportivo [alquiler=" + alquiler + ", tipoTransmision=" + tipoTransmision + ", numeroPasajeros="
                + numeroPasajeros + ", marca=" + marca + ", nuevoOUsado=" + nuevoOUsado + ", numeroPuertas="
                + numeroPuertas + ", modelo=" + modelo + ", numeroBolsasDeAire=" + numeroBolsasDeAire + ", cambios="
                + cambios + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", matricula="
                + matricula + ", caballosDeFuerza=" + caballosDeFuerza + ", tiempo0A100=" + tiempo0A100
                + ", tipoDeVehiculo=" + tipoDeVehiculo + "]";
    }

}
