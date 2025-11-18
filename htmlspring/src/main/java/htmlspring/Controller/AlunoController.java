package htmlspring.Controller;


import htmlspring.Model.AlunoModel;
import htmlspring.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class AlunoController {
@Autowired

    public AlunoService alunoService;

@GetMapping

 public List<AlunoModel> listarAlunos() {
     return alunoService.listarAlunos();
 }
 @PostMapping

    public ResponseEntity<Map<String,Object>> salvar(@RequestBody AlunoModel aluno) {
    AlunoService.salvar(aluno);
    return ResponseEntity.ok(Map.of("message","Aluno cadastrado com sucesso"));
     }
@PutMapping("/{id}")

    public ResponseEntity<Map<String,Object>> atualizar(@RequestBody AlunoModel aluno, @PathVariable Long id) {
    alunoService.atualizar(id, aluno);
    return ResponseEntity.ok(Map.of("message", "Aluno atualizado com sucesso"));
}


@DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> deletar(@PathVariable Long id) {
    alunoService.deletar(id);
    return ResponseEntity.ok(Map.of("message", "Aluno deletado com sucesso"));


}


}
