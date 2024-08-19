package br.com.projeto.pizzaria3d.service;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.pizzaria3d.model.entity.Aluno;
import br.com.projeto.pizzaria3d.model.repository.AlunoRepository;

public class AlunoService implements AlunoRepository {

	@Override
	public Aluno find() {
		Aluno aluno = new Aluno(86424, "Larissa", 23);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Anna", 17));
		alunos.add(new Aluno(98768, "Maria", 18));
		alunos.add(new Aluno(98760, "Vitoria", 19));
		return alunos;
	}

	@Override
	public Aluno findByRm(long rm) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Anna", 17));
		alunos.add(new Aluno(98768, "Maria", 18));
		alunos.add(new Aluno(98760, "Vitoria", 19));
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getRm() == rm) {
				return alunos.get(i);
			}
		}
		return null;
	}

}
