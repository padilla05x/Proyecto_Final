package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Administrador;

import java.security.SecureRandom;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import co.edu.uniquindio.poo.App;
import javafx.scene.control.Alert.AlertType;

public class MenuInicioSesionAdminController {
    Concesionario concesionario = App.getConcesionario();

    /**
     * Método para verificar si el administrador existe y sus credenciales son
     * correctas.
     * 
     * @param identificacion La identificación del administrador.
     * @param contrasena     La contraseña del administrador.
     * @return true si el administrador es válido, false si no lo es.
     */
    public boolean verificarAdministrador(String identificacion, String contrasena) {
        boolean banderilla = false;

        // Buscar el administrador con la identificación proporcionada
        for (Administrador administrador : concesionario.getAdministradores()) {
            if (administrador.getIdentificacion().equals(identificacion) &&
                    administrador.getContrasena().equals(contrasena)) {
                banderilla = true; // Credenciales correctas
                break;
            }
        }

        if (!banderilla) {
            App.showAlert("Error de inicio de sesión",
                    "La identificación o contraseña son incorrectas",
                    AlertType.ERROR);
        }

        return banderilla;
    }

    public Empleado buscarEmpleado(String identificacion){
        Empleado empleadoBuscado=null;
        empleadoBuscado=concesionario.buscarAdministrador(identificacion);
        return empleadoBuscado;
    }

    /**
     * Método para generar una nueva contraseña y enviarla por correo electrónico.
     * 
     * @param emailUsuario El correo electrónico del usuario.
     */
    public void recuperarContrasena(String identificacion) {
        String nuevaContrasena = generarContrasenaAleatoria();
        String emailBuscado = null;
        Administrador administrador = concesionario.buscarAdministrador(identificacion);
        emailBuscado = administrador.getEmailDeRecuperacion();
        administrador.setContrasena(nuevaContrasena);

        // Configurar las propiedades de JavaMail
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");

       // Autenticación
       String miCorreo = "tucarrouq@gmail.com";
       String miContrasena = "himc pkzz ewqq nopr";

        Session session = Session.getInstance(propiedades, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(miCorreo, miContrasena);
            }
        });

        try {
            // Crear el mensaje
            Message mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(miCorreo));
            mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailBuscado));
            mensaje.setSubject("Recuperación de Contraseña Tu Carro UQ");
            mensaje.setText("Hola, \n\nTu nueva contraseña es: " + nuevaContrasena + "\n\nSaludos,\nTu Carro UQ");

            // Enviar el mensaje
            Transport.send(mensaje);
            App.showAlert("Correo Enviado", "La nueva contraseña ha sido enviada a tu correo.", AlertType.INFORMATION);
        } catch (MessagingException e) {
            App.showAlert("Error", "No se pudo enviar el correo: " + e.getMessage(), AlertType.ERROR);
        }
    }

    /**
     * Método para generar una contraseña aleatoria.
     * 
     * @return La nueva contraseña aleatoria.
     */
    private String generarContrasenaAleatoria() {
        final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            contrasena.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return contrasena.toString();
    }
}
