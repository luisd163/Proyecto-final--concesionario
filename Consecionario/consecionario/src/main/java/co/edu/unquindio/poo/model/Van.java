package co.edu.unquindio.poo.model;

public class Van extends Vehiculo{

    private Alquiler alquiler;
    private String numeroPasajeros, numeroPuertas, numeroBolsasAire;
    private String capacidadMaletero;
    private String aireACondicionado, camaraReversa, abs;
    

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
     */
    public Van(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo, String cambios,
            String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo,
            String numeroPasajeros, String numeroPuertas, String numeroBolsasAire,
            String capacidadMaletero, String aireACondicionado, String camaraReversa, String abs) {
        super(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula,
                tipoDeVehiculo);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.capacidadMaletero = capacidadMaletero;
        this.aireACondicionado = aireACondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
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


    public String getNumeroBolsasAire() {
        return numeroBolsasAire;
    }


    public void setNumeroBolsasAire(String numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }


    public String getCapacidadMaletero() {
        return capacidadMaletero;
    }


    public void setCapacidadMaletero(String capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }


    public String getAireACondicionado() {
        return aireACondicionado;
    }


    public void setAireACondicionado(String aireACondicionado) {
        this.aireACondicionado = aireACondicionado;
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


    @Override
    public String toString() {
        return "Van [alquiler=" + alquiler + ", tipoTransmision=" + tipoTransmision + ", numeroPasajeros="
                + numeroPasajeros + ", marca=" + marca + ", numeroPuertas=" + numeroPuertas + ", nuevoOUsado="
                + nuevoOUsado + ", numeroBolsasAire=" + numeroBolsasAire + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", capacidadMaletero="
                + capacidadMaletero + ", matricula=" + matricula + ", aireACondicionado=" + aireACondicionado
                + ", tipoDeVehiculo=" + tipoDeVehiculo + ", camaraReversa=" + camaraReversa + ", abs=" + abs + "]";
    }

    
}
