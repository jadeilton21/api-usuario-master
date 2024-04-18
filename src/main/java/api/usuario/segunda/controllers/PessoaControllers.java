package api.usuario.segunda.controllers;

import api.usuario.segunda.doMain.Pessoa;
import api.usuario.segunda.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaControllers {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public void cadastrarPessoa(@RequestBody Pessoa pessoa){

        repository.save(pessoa);
    }
    @PutMapping
    public void atualizarPessoa(@RequestBody Pessoa pessoa){

        repository.update(pessoa);
    }
    @DeleteMapping("{id}")
    private void deletarPessoa(@PathVariable("id") Integer id){

        repository.remove(id);


    }










}
