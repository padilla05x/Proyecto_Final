package co.edu.uniquindio.poo.model;



public class CamionetaElectrica extends VehiculoElectrico  {

    private int numeroPuertas, numeroPasajeros, capacidadMaletero, numeroBolsasAire;
    private boolean aireAcondicionado, ABS, camaraReversa, velocidadCrucero, sensorColision, sensorTraficoCruzado,
            asistentePermanenciaEnCarril, es4x4;

    public CamionetaElectrica(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String autonomiaCargaCompleta,
            String tiempoPromedioPorCarga, boolean revisionTecnica, int numeroPuertas, int numeroPasajeros,
            int capacidadMaletero, int numeroBolsasAire, boolean aireAcondicionado, boolean ABS,
            boolean camaraReversa, boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentePermanenciaEnCarril, boolean es4x4, boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                autonomiaCargaCompleta, tiempoPromedioPorCarga, revisionTecnica,esTransmisionManual);
        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.ABS = ABS;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaEnCarril = asistentePermanenciaEnCarril;
        this.es4x4 = es4x4;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosABS() {
        return ABS;
    }

    public void setFrenosABS(boolean ABS) {
        this.ABS = ABS;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public boolean isSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isAsistentePermanenciaEnCarril() {
        return asistentePermanenciaEnCarril;
    }

    public void setAsistentePermanenciaEnCarril(boolean asistentePermanenciaEnCarril) {
        this.asistentePermanenciaEnCarril = asistentePermanenciaEnCarril;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    @Override
    public String toString() {
        return "CamionetaElectrica [numeroPuertas=" + numeroPuertas + ", numeroPasajeros=" + numeroPasajeros
                + ", capacidadMaletero=" + capacidadMaletero + ", numeroBolsasAire=" + numeroBolsasAire
                + ", aireAcondicionado=" + aireAcondicionado + ", frenosABS=" +ABS + ", camaraReversa="
                + camaraReversa + ", velocidadCrucero=" + velocidadCrucero + ", sensorColision=" + sensorColision
                + ", sensorTraficoCruzado=" + sensorTraficoCruzado + ", asistentePermanenciaEnCarril="
                + asistentePermanenciaEnCarril + ", es4x4=" + es4x4 + "]";
    }

}
