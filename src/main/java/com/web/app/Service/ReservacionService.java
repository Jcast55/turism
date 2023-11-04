package com.web.app.Service;

import com.web.app.model.Reservacion;
import com.web.app.model.Usuario;

import java.util.List;

public interface ReservacionService {
    void saveReservacion(Reservacion reservacion);

    Reservacion getReservacionById(Long id);

    List<Reservacion> getAllReservaciones();

    void deleteReservacion(Long id);

    Reservacion updateReservacion(Reservacion reservacion);

    List<Reservacion> getReservacionesByUsuario(Usuario usuario);
    // Otros métodos personalizados si es necesario
}
