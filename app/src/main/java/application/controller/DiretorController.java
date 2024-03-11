package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import application.repository.DiretorRepository;
import application.model.Diretor;

@RestController
public class DiretorController {
    @Autowired
    private DiretorRepository diretorRepo;

    @PostMapping("/diretores")
    public Diretor post(@RequestBody Diretor diretor) {
        return diretorRepo.save(diretor);
    }
}
