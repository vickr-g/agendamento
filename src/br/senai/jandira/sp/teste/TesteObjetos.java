package br.senai.jandira.sp.teste;

import java.util.ArrayList;

import br.senai.jandira.sp.AgendaApp;
import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.PlanoDeSaude;

public class TesteObjetos {
	
	public static void main(String[] args) {

		Especialidade  e1 = new Especialidade();
		e1.setNome("Cardiologia");
		e1.setDescricao("nao deixa ter um ataque");
		
		Especialidade  e2 = new Especialidade();
		e2.setNome("Gastroenterologia");
		e2.setDescricao("nao deixa ter dor no estomago");
	
		
		Especialidade e3 = new Especialidade();
		e3.setNome("QUALQUER COISA");
		
		Especialidade e4 = new Especialidade();
		e4.setNome("Clinico geral");
		e4.setDescricao("da o diagnostico");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		System.out.println(especialidades.size());
		
		//imprimir dno console o nome das especialidades que estao armazenadas no arraylist
//		
//		int i = 0;
//		while (i < especialidades.size()) {
//			System.out.println(especialidades.get(i).getNome());
//			i++;
//		}
			
			//utilização do for para iteração
			
			
//			System.out.println("~~~~~~~~~~~~~~~ FOR ~~~~~~~~~~~~");
//			for(int x = 0; x < especialidades.size(); x++) {
//			System.out.println(especialidades.get(x).getNome());
			
//			}
//			//FOR EACH PARA CADA
//			System.out.println("~~~~~~~~~~~~~~~ FOR EACH ~~~~~~~~~~~~");
//			for (Especialidade e : especialidades){
//				System.out.println(e.getNome());
				
//			}
			// criar 3 planos de saude e armazenar em arraylist 
			// e exibir o nome de cada operadora
			
			PlanoDeSaude plano = new PlanoDeSaude("AMIL");
			PlanoDeSaude plano2 = new PlanoDeSaude("INTERMEDICA");
			PlanoDeSaude plano3 = new PlanoDeSaude("BRADESCO");
			
			ArrayList<PlanoDeSaude> planos  = new ArrayList<>();
			planos.add(plano);
			planos.add(plano2);
			planos.add(plano3);
			
			System.out.println(planos.size());
			
			//Imprimir no console
			System.out.println("------------------------------------------------------");
			for(PlanoDeSaude p : planos) {
				System.out.println(p.getOperadora());
				System.out.println(p.getQuantidade());
				
				
				AgendaApp.main(args);
			}
			
					
			
			
			}
			
		}
		
		
	

