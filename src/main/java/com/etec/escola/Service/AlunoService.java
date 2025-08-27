package com.etec.escola.Service;

import com.etec.escola.Interface.AlunoRepository;
import com.etec.escola.Models.Aluno;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.theme.CookieThemeResolver;

import java.util.ArrayList;
import java.util.List;


@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> buscarAluno() {
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
    return alunoRepository.save(aluno);
    }

    public Aluno buscarAlunoId(Long Id){
        return alunoRepository.findById(Id).orElse(null);
    }
    public void deletarAluno(Long Id){
        alunoRepository.deleteById(Id);
    }

}