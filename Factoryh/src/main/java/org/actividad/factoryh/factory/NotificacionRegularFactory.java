package org.actividad.factoryh.factory;

import org.actividad.factoryh.notificacion.NotificacionEmail;

public class NotificacionRegularFactory implements NotificacionFactory{
    public NotificacionEmail crearNotificacionEmail(){
        return new NotificacionEmail();
    }
}
