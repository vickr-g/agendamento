package br.senai.jandira.sp.teste;

import java.util.ArrayList;

import br.senai.jandira.sp.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		
		
		
		ArrayList<Especialidade> especialidades = new ArrayList<>(); 
		
		Especialidade  e1 = new Especialidade();
		e1.setNome("Cardiologia");
		e1.setDescricao("nao deixa ter um ataque");
		
		Especialidade  e2 = new Especialidade();
		e2.setNome("gastroenterologia");
		e2.setDescricao("nao deixa ter dor no estomago");
		
		Especialidade  e3 = new Especialidade();
		e3.setNome("fisioterapia");
		e3.setDescricao("nao deixa ficar com dor nas costas");
		
		Especialidade  e4 = new Especialidade();
		e4.setNome("Clinico geral");
		e4.setDescricao("da o diagnostico");
		
//		Especialidade[] especialidades = {e1, e2, e3, e4};
		
	
		Especialidade  e5 = new Especialidade();
		e5.setNome("pediatra");
		e5.setDescricao("cuida das crianças");
				
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(12);
		notas.add(25);
		notas.add(13);
		System.out.println(notas.size());
		
		notas.add(28);
		notas.add(9);
		
		System.out.println(notas.size());
		
//		System.out.println(especialidades.get(3).getNome());

		   especialidades.get(1).setNome("Teste");

			System.out.println(especialidades.get(1).getNome());

			Especialidade nova = especialidades.get(2);
			System.out.println(nova.getNome());
			System.out.println(nova.getNome());


	}

}
