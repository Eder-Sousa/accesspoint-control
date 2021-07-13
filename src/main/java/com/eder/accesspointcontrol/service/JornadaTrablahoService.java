package com.eder.accesspointcontrol.service;

import com.eder.accesspointcontrol.model.JornadaTrabalho;
import com.eder.accesspointcontrol.repository.JornadaTrabalhoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class JornadaTrablahoService {

    private JornadaTrabalhoRepository repository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return repository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return repository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long id) {
        return repository.findById(id);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return repository.save(jornadaTrabalho);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
