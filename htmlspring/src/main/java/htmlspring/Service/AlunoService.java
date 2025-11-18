package htmlspring.Service;


import htmlspring.Controller.AlunoController;
import htmlspring.Model.AlunoModel;
import htmlspring.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired

    public AlunoRepository alunoRepository;

    public static void salvar(AlunoModel aluno) {
    }

    public List<AlunoModel> listarAlunos() {
        return alunoRepository.findAll();
    }

    public AlunoModel salvarAluno(AlunoModel aluno) {

     if (alunoRepository.findByEmail(aluno.getEmail()).isPresent()) {
         throw new IllegalArgumentException("Email ja cadastrado");
     }
        return alunoRepository.save(aluno);
    }

    public AlunoModel atualizar(Long id,AlunoModel aluno) {
        if (!alunoRepository.existsById(id)) {
            throw new IllegalArgumentException("Aluno nao encontrado");
        }
        aluno.setId(id);
        return alunoRepository.save(aluno);

    }
    public void deletar(Long id) {
        if (!alunoRepository.existsById(id)) {
            throw new IllegalArgumentException("Aluno nao encontrado");
        }
        alunoRepository.deleteById(id);
    }


}
