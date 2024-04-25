package org.actividad.factoryh.notificacion;

public class NotificacionEmail implements Notificacion{
    public void enviarMensaje(String mensaje){
        System.out.println("Enviando email: "+ mensaje);
    }
}
