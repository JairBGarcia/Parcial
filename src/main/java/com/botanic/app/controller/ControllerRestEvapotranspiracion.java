package com.botanic.app.controller;

import com.botanic.app.entity.Evapotranspiracion;
import com.botanic.app.repository.EvapotranspiracionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evapotranspiracion")
public class ControllerRestEvapotranspiracion {

    @Autowired
    private EvapotranspiracionRepository evapotranspiracionRepository;

    @GetMapping
    public List<Evapotranspiracion> listarEvapotranspiraciones() {
        return evapotranspiracionRepository.findAll();
    }

    @PostMapping
    public Evapotranspiracion crearEvapotranspiracion(@RequestBody Evapotranspiracion evapotranspiracion) {
        return evapotranspiracionRepository.save(evapotranspiracion);
    }

    @PutMapping("/{id}")
    public Evapotranspiracion actualizarEvapotranspiracion(@PathVariable String id, @RequestBody Evapotranspiracion evapotranspiracionActualizada) {
        evapotranspiracionActualizada.setId(id);
        return evapotranspiracionRepository.save(evapotranspiracionActualizada);
    }

    @DeleteMapping("/{id}")
    public void eliminarEvapotranspiracion(@PathVariable String id) {
        evapotranspiracionRepository.deleteById(id);
    }
}
