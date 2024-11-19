package co.edu.unquindio.poo.model;

public class PickUp extends Vehiculo{

    private Alquiler alquiler;
    private String numeroPasajeros, numeroPuertas, numeroBolsasAire;
    private String capacidadCajaCarga;
    private String aireACondicionado, camaraReversa, abs, es4x4;
    
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
     * @param capacidadCajaCarga
     * @param aireACondicionado
     * @param camaraReversa
     * @param abs
     * @param es4x4
     */
    public PickUp(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo, String cambios,
            String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo,
            String numeroPasajeros, String numeroPuertas, String numeroBolsasAire, String capacidadCajaCarga,
            String aireACondicionado, String camaraReversa, String abs, String es4x4) {
        super(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula,
                tipoDeVehiculo);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.capacidadCajaCarga = capacidadCajaCarga;
        this.aireACondicionado = aireACondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
        this.es4x4 = es4x4;
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


    public String getNumeroBolsasAire() {
        return numeroBolsasAire;
    }


    public void setNumeroBolsasAire(String numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }


    public String getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }


    public void setCapacidadCajaCarga(String capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }


    public String getAireACondicionado() {
        return aireACondicionado;
    }

    public void setAireACondicionado(String aireACondicionado) {
        this.aireACondicionado = aireACondicionado;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public String getCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(String camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getEs4x4() {
        return es4x4;
    }

    public void setEs4x4(String es4x4) {
        this.es4x4 = es4x4;
    }

    @Override
    public String toString() {
        return "PickUp [alquiler=" + alquiler + ", tipoTransmision=" + tipoTransmision + ", numeroPasajeros="
                + numeroPasajeros + ", marca=" + marca + ", nuevoOUsado=" + nuevoOUsado + ", numeroPuertas="
                + numeroPuertas + ", modelo=" + modelo + ", numeroBolsasAire=" + numeroBolsasAire + ", cambios="
                + cambios + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje
                + ", capacidadCajaCarga=" + capacidadCajaCarga + ", matricula=" + matricula + ", tipoDeVehiculo="
                + tipoDeVehiculo + ", aireACondicionado=" + aireACondicionado + ", camaraReversa=" + camaraReversa
                + ", abs=" + abs + ", es4x4=" + es4x4 + "]";
    }

 
}
