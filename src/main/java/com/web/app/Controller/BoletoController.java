package com.web.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.web.app.Service.BoletoService;
import com.web.app.model.Boleto;

import java.util.List;

@RestController
@RequestMapping("/boletos")
public class BoletoController {

    @Autowired
    private BoletoService boletoService;

    @PostMapping
    public ResponseEntity<Boleto> crearBoleto(@RequestBody Boleto boleto) {
        boletoService.saveBoleto(boleto);
        return new ResponseEntity<>(boleto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Boleto> obtenerBoleto(@PathVariable Long id) {
        Boleto boleto = boletoService.getBoletoById(id);
        if (boleto != null) {
            return new ResponseEntity<>(boleto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boleto> actualizarBoleto(@PathVariable Long id, @RequestBody Boleto boleto) {
        boleto.setId(id); // Asegura que el ID del boleto sea el correcto
        Boleto boletoActualizado = boletoService.updateBoleto(boleto);
        if (boletoActualizado != null) {
            return new ResponseEntity<>(boletoActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBoleto(@PathVariable Long id) {
        boletoService.deleteBoleto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Boleto>> obtenerTodosLosBoletos() {
        List<Boleto> boletos = boletoService.getAllBoletos();
        if (!boletos.isEmpty()) {
            return new ResponseEntity<>(boletos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
