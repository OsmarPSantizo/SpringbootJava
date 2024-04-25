package org.actividad.factoryh.factory;

import org.actividad.factoryh.notificacion.NotificacionAPP;
import org.actividad.factoryh.notificacion.NotificacionEmail;
import org.actividad.factoryh.notificacion.NotificacionSMS;

public interface NotificacionFactory {
    NotificacionEmail crearNotificacionEmail();

    NotificacionSMS crearNotificacionSMS();

    NotificacionAPP crearNotificaconAPP();
}
