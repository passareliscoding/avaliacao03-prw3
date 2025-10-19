package br.edu.ifsp.prw3.avaliacao03.controller;

import br.edu.ifsp.prw3.avaliacao03.conserto.Conserto;
import br.edu.ifsp.prw3.avaliacao03.conserto.ConsertoRepository;
import br.edu.ifsp.prw3.avaliacao03.conserto.DadosCadastroConserto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consertos")
public class ConsertoController {
    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroConserto dados){
        repository.save(new Conserto(dados));
    }
}
