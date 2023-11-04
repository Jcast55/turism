package com.web.app.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.Dao.ReservacionDao;
import com.web.app.Service.ReservacionService;
import com.web.app.model.Reservacion;
import com.web.app.model.Usuario;

import java.util.List;

@Service
public class ReservacionServiceImpl implements ReservacionService {

    @Autowired
    private ReservacionDao reservacionDAO;

    @Override
    public void saveReservacion(Reservacion reservacion) {
        reservacionDAO.save(reservacion);
    }

    @Override
    public Reservacion getReservacionById(Long id) {
        return reservacionDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Reservacion> getAllReservaciones() {
        return reservacionDAO.findAll();
    }

    @Override
    public void deleteReservacion(Long id) {
        reservacionDAO.deleteById(id);
    }

    @Override
    public Reservacion updateReservacion(Reservacion reservacion) {
        // Realiza la lógica para actualizar la reservación según tus necesidades
        // Puede ser necesario obtener la reservación existente por ID y actualizar sus atributos
        // Luego, guarda la reservación actualizada en la base de datos
        return reservacionDAO.save(reservacion);
    }

    @Override
    public List<Reservacion> getReservacionesByUsuario(Usuario usuario) {
        return reservacionDAO.findAllByUsuario(usuario);
    }

}
