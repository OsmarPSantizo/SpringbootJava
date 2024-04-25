package org.actividad.factoryh.notificacion;

public class NotificacionAPP implements Notificacion{
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando desde la app: "+mensaje);
    }
}
