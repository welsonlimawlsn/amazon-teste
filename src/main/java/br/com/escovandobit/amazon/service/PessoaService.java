package br.com.escovandobit.amazon.service;

import br.com.escovandobit.amazon.model.Pessoa;
import br.com.escovandobit.amazon.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa salva(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listaPessoas() {
        return pessoaRepository.findAll();
    }

}
