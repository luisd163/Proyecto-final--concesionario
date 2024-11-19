package co.edu.unquindio.poo.model;

public class Sedan extends Vehiculo {

    private Alquiler alquiler;
    private String numeroPasajeros, numeroPuertas, numeroBolsasAire;
    private String capacidadMaletero;
    private String aireACondicionado, camaraReversa, velocidadCrucero, abs, sensoresDeColision, sensorTraficoCruzado,
            asistenciaDePermanenciaEnElCarril;

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
     * @param numeroBolsasAire
     * @param capacidadMaletero
     * @param aireACondicionado
     * @param camaraReversa
     * @param velocidadCrucero
     * @param abs
     * @param sensoresDeColision
     * @param sensorTraficoCruzado
     * @param asistenciaDePermanenciaEnElCarril
     */
    public Sedan(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo, String cambios,
            String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo,
            String numeroPasajeros, String numeroPuertas, String numeroBolsasAire, String capacidadMaletero,
            String aireACondicionado, String camaraReversa, String velocidadCrucero, String abs,
            String sensoresDeColision, String sensorTraficoCruzado, String asistenciaDePermanenciaEnElCarril) {
        super(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula,
                tipoDeVehiculo);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.capacidadMaletero = capacidadMaletero;
        this.aireACondicionado = aireACondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.abs = abs;
        this.sensoresDeColision = sensoresDeColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistenciaDePermanenciaEnElCarril = asistenciaDePermanenciaEnElCarril;
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

    public String getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(String velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getSensoresDeColision() {
        return sensoresDeColision;
    }

    public void setSensoresDeColision(String sensoresDeColision) {
        this.sensoresDeColision = sensoresDeColision;
    }

    public String getSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(String sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public String getAsistenciaDePermanenciaEnElCarril() {
        return asistenciaDePermanenciaEnElCarril;
    }

    public void setAsistenciaDePermanenciaEnElCarril(String asistenciaDePermanenciaEnElCarril) {
        this.asistenciaDePermanenciaEnElCarril = asistenciaDePermanenciaEnElCarril;
    }



    @Override
    public String toString() {
        return "Sedan [alquiler=" + alquiler + ", tipoTransmision=" + tipoTransmision + ", numeroPasajeros="
                + numeroPasajeros + ", marca=" + marca + ", nuevoOUsado=" + nuevoOUsado + ", numeroPuertas="
                + numeroPuertas + ", modelo=" + modelo + ", numeroBolsasAire=" + numeroBolsasAire + ", cambios="
                + cambios + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje
                + ", capacidadMaletero=" + capacidadMaletero + ", matricula=" + matricula + ", tipoDeVehiculo="
                + tipoDeVehiculo + ", aireACondicionado=" + aireACondicionado + ", camaraReversa=" + camaraReversa
                + ", velocidadCrucero=" + velocidadCrucero + ", abs=" + abs + ", sensoresDeColision="
                + sensoresDeColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", asistenciaDePermanenciaEnElCarril=" + asistenciaDePermanenciaEnElCarril + "]";
    }

    

}
