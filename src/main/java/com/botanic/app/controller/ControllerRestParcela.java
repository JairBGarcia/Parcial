package com.botanic.app.controller;

import com.botanic.app.entity.Parcela;
import com.botanic.app.repository.ParcelaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parcela")
public class ControllerRestParcela {

    @Autowired
    private ParcelaRepository parcelaRepository;

    @GetMapping
    public List<Parcela> listarParcelas() {
        return parcelaRepository.findAll();
    }

    @PostMapping
    public Parcela crearParcela(@RequestBody Parcela parcela) {
        return parcelaRepository.save(parcela);
    }

    @PutMapping("/{id}")
    public Parcela actualizarParcela(@PathVariable String id, @RequestBody Parcela parcelaActualizada) {
        parcelaActualizada.setId(id);
        return parcelaRepository.save(parcelaActualizada);
    }

    @DeleteMapping("/{id}")
    public void eliminarParcela(@PathVariable String id) {
        parcelaRepository.deleteById(id);
    }
}
