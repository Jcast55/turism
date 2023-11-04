package com.web.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.web.app.Service.AtraccionService;
import com.web.app.model.Atraccion;

import java.util.List;

@RestController
@RequestMapping("/atracciones")
public class AtraccionController {

    @Autowired
    private AtraccionService atraccionService;

    @PostMapping
    public ResponseEntity<Atraccion> crearAtraccion(@RequestBody Atraccion atraccion) {
        atraccionService.saveAtraccion(atraccion);
        return new ResponseEntity<>(atraccion, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atraccion> obtenerAtraccion(@PathVariable Long id) {
        Atraccion atraccion = atraccionService.getAtraccionById(id);
        if (atraccion != null) {
            return new ResponseEntity<>(atraccion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atraccion> actualizarAtraccion(@PathVariable Long id, @RequestBody Atraccion atraccion) {
        atraccion.setId(id); // Asegura que el ID de la atracción sea el correcto
        Atraccion atraccionActualizada = atraccionService.updateAtraccion(atraccion);
        if (atraccionActualizada != null) {
            return new ResponseEntity<>(atraccionActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAtraccion(@PathVariable Long id) {
        atraccionService.deleteAtraccion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Atraccion>> obtenerTodasLasAtracciones() {
        List<Atraccion> atracciones = atraccionService.getAllAtracciones();
        if (!atracciones.isEmpty()) {
            return new ResponseEntity<>(atracciones, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
