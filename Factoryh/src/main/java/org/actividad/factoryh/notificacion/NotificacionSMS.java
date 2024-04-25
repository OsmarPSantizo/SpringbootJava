package org.actividad.factoryh.notificacion;

public class NotificacionSMS implements Notificacion{

    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: "+ mensaje);
    }
}
