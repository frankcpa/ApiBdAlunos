package aluno.apiAlunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aluno.apiAlunos.model.AlunoModel;
import aluno.apiAlunos.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	@Autowired
	AlunoService alunoService = new AlunoService();
	
	@GetMapping
	public String saudacao() {
		return "No Get do Aluno";
	}
	
	@PostMapping
	public void salvar(AlunoModel aluno) {
		alunoService.salvar(aluno);
	}
}
