package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empleado extends Usuario {
    private Collection<Transaccion> transacciones; // Registro de transacciones del empleado

    public Empleado(String nombre, String identificacion, String contrasena, String preguntaSeguridad, String respuestaSeguridad) {
        super(nombre, identificacion, contrasena, preguntaSeguridad, respuestaSeguridad);

        if (nombre == null || identificacion == null || contrasena == null || preguntaSeguridad == null || respuestaSeguridad == null) {
            throw new IllegalArgumentException("Los valores no pueden ser nulos");
        }

        this.transacciones = new LinkedList<>();
    }

    // Método para registrar una transacción
    public void registrarTransaccion(Transaccion transaccion) {
        if (transaccion == null) {
            throw new IllegalArgumentException("La transacción no puede ser nula");
        }
        transacciones.add(transaccion);
    }

    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Collection<Transaccion> transacciones) {
        if (transacciones == null) {
            throw new IllegalArgumentException("Las transacciones no pueden ser nulas");
        }
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "La persona: " + super.toString() + " es Empleado [transacciones=" + transacciones + "]";
    }
}
