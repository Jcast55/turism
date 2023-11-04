package com.web.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.app.Service.ReservacionService;
import com.web.app.model.Reservacion;

import java.util.List;

@RestController
@RequestMapping("/reservaciones")
public class ReservacionController {

    @Autowired
    private ReservacionService reservacionService;

    // Endpoint para crear una nueva Reservacion
    @PostMapping
    public Reservacion createReservacion(@RequestBody Reservacion reservacion) {
        reservacionService.saveReservacion(reservacion);
        return reservacion;
    }

    // Endpoint para obtener una Reservacion por su ID
    @GetMapping("/{id}")
    public Reservacion getReservacion(@PathVariable Long id) {
        return reservacionService.getReservacionById(id);
    }

    // Endpoint para obtener todas las Reservaciones
    @GetMapping
    public List<Reservacion> getAllReservaciones() {
        return reservacionService.getAllReservaciones();
    }

    // Endpoint para actualizar una Reservacion
    @PutMapping("/{id}")
    public Reservacion updateReservacion(@PathVariable Long id, @RequestBody Reservacion reservacion) {
        reservacion.setId(id); // Asegura que la ID en la URL coincida con la de la entidad
        return reservacionService.updateReservacion(reservacion);
    }

    // Endpoint para eliminar una Reservacion
    @DeleteMapping("/{id}")
    public void deleteReservacion(@PathVariable Long id) {
        reservacionService.deleteReservacion(id);
    }
}
