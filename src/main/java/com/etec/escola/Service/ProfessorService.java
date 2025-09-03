package com.etec.escola.Service;

import com.etec.escola.Interface.AlunoRepository;

import com.etec.escola.Interface.ProfessorRepository;
import com.etec.escola.Models.Professor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }


    public List<Professor> buscarProfessor() {
        return professorRepository.findAll();
    }

    public Professor salvarProfessor(Professor professor) {
    return professorRepository.save(professor);
    }

    public Professor buscarProfessorId(Long Id){
        return professorRepository.findById(Id).orElse(null);
    }
    public void deletarProfessor(Long Id){
        professorRepository.deleteById(Id);
    }

}