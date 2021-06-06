package br.com.escovandobit.amazon.controller;

import br.com.escovandobit.amazon.model.Pessoa;
import br.com.escovandobit.amazon.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<Pessoa> salva(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaService.salva(pessoa));
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> lista() {
        return ResponseEntity.ok(pessoaService.listaPessoas());
    }

}
