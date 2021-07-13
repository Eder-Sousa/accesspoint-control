package com.eder.accesspointcontrol.controller;

import com.eder.accesspointcontrol.model.JornadaTrabalho;
import com.eder.accesspointcontrol.service.JornadaTrablahoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornadas")
@AllArgsConstructor
public class JornadaTrabalhoController {

    private JornadaTrablahoService service;

    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return service.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable Long id) throws NoSuchElementException {
        return ResponseEntity.ok(service.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return service.update(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        try {
            service.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity.noContent().build();
    }
}
