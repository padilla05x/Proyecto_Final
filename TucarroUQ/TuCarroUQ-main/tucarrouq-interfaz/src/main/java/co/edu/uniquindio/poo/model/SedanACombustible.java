package co.edu.uniquindio.poo.model;

public class SedanACombustible extends VehiculoACombustible {

    private int numeroPuertas, numeroPasajeros, capacidadMaletero, numeroBolsasAire;
    private boolean AireAcondicionado, camaraReversa, velocidadCrucero, ABS, sensorColision, sensorTraficoCruzado,
            asistentePermanenciaEnCarril;

    public SedanACombustible(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquiler, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno, int capacidadTanque, int cilindraje, boolean revisionTecnica, int numeroCambios,int numeroPuertas,
            int numeroPasajeros, int capacidadMaletero, int numeroBolsasAire, boolean aireAcondicionado,
            boolean camaraReversa, boolean velocidadCrucero, boolean ABS, boolean sensorColision,
            boolean sensorTraficoCruzado, boolean asistentePermanenciaEnCarril,boolean esTransmisionManual) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquiler, modelo,
                tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica, numeroCambios,esTransmisionManual);
        this.numeroPuertas = numeroPuertas;
        this.numeroPasajeros = numeroPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasAire = numeroBolsasAire;
        AireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.ABS = ABS;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaEnCarril = asistentePermanenciaEnCarril;
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
        return AireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        AireAcondicionado = aireAcondicionado;
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

    public boolean isFrenosABS() {
        return ABS;
    }

    public void setFrenosABS(boolean ABS) {
        this.ABS = ABS;
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

    @Override
    public String toString() {
        return "SedanACombustible [numeroPuertas=" + numeroPuertas + ", numeroPasajeros=" + numeroPasajeros
                + ", capacidadMaletero=" + capacidadMaletero + ", numeroBolsasAire=" + numeroBolsasAire
                + ", AireAcondicionado=" + AireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", velocidadCrucero=" + velocidadCrucero + ", frenosABS=" + ABS + ", sensorColision="
                + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado + ", asistentePermanenciaEnCarril="
                + asistentePermanenciaEnCarril + "]";
    }

}
