package com.etec.escola.Controller;

import com.etec.escola.Models.Aluno;
import com.etec.escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")

public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {

        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listaDeAlunos(){

        return alunoService.buscarAluno();
    }

    @PostMapping
    public Aluno salavarNovoAluno(@RequestBody Aluno dadosAluno){

        return alunoService.salvarAluno(dadosAluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunosId(@PathVariable Long id){
        return alunoService.buscarAlunoId(id);

    }

    @DeleteMapping("/{id}")
    public void excluirAlunosId(@PathVariable Long id){
         alunoService.buscarAlunoId(id);

    }
}
