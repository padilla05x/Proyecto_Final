package co.edu.uniquindio.poo.model;

public class VanACombustible extends VehiculoACombustible {
    
    private int cantidadPuertas, numeroBolsasDeAire, numeroPasajeros;
    private boolean aireAcondicionado, camaraReversa, abs;
    
    public VanACombustible(String marca, String referencia, String placa, int kilometraje, int velocidadMaxima,
            boolean nuevo, double precioVenta, double precioAlquilerPorDia, int modelo, String tipoCombustible,
            int autonomiaTanqueLleno, int capacidadTanque, int cilindraje, boolean revisionTecnica,int numeroCambios ,int cantidadPuertas,
            int numeroBolsasDeAire, int numeroPasajeros, boolean esTransmisionManual, boolean aireAcondicionado,
            boolean camaraReversa, boolean abs) {
        super(marca, referencia, placa, kilometraje, velocidadMaxima, nuevo, precioVenta, precioAlquilerPorDia, modelo,
                tipoCombustible, autonomiaTanqueLleno, capacidadTanque, cilindraje, revisionTecnica,numeroCambios,esTransmisionManual);
        this.cantidadPuertas = cantidadPuertas;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.numeroPasajeros = numeroPasajeros;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.abs = abs;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "VanACombustible [cantidadPuertas=" + cantidadPuertas + ", numeroBolsasDeAire=" + numeroBolsasDeAire
                + ", numeroPasajeros=" + numeroPasajeros + ", transmisionManual="
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", abs=" + abs
                + "]";
    }


    
}
