package br.senai.jandira.sp;



import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.jandira.sp.model.Agenda;
import br.senai.jandira.sp.model.Endereco;
import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.Estados;
import br.senai.jandira.sp.model.Medico;
import br.senai.jandira.sp.model.Paciente;
import br.senai.jandira.sp.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
	 // criar objeeto plano de saude
		
	PlanoDeSaude planoDeSaude = new PlanoDeSaude();
	planoDeSaude.setOperadora("Intermédica");
	planoDeSaude.setCategoria("Bronze");
	planoDeSaude.setNumero("5414-9018-2039");
	planoDeSaude.setValidade(LocalDate.of(2023, 8, 20)); //data
	
	PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
	planoDeSaude2.setOperadora("Intermédica");
	planoDeSaude2.setCategoria("Prata");
	planoDeSaude2.setNumero("5255-814-582-2");
	planoDeSaude2.setValidade(LocalDate.of(2023, 2, 20)); //data
	
	//endereço
	Endereco endereco = new Endereco();
	endereco.setBairro("Centro");
	endereco.setCep("06600-025");
	endereco.setCidade("Jandira");
	endereco.setComplemento("Instituição de Ensino");
	endereco.setEstado(Estados.SAO_PAULO);
	endereco.setLogradouro("Rua Elton Silva");
	endereco.setNumero("905");
	
	// paciente
	Paciente paciente = new Paciente();
	paciente.setCpf("541.490.018-39");
	paciente.setDataDeNacsimento(LocalDate.of(2003, 5, 6)); //data
	paciente.setEndereco(endereco);
	paciente.setNome("Victoria Gindre");
	paciente.setPlanoDeSaude(planoDeSaude);
	paciente.setRg("60.198.198-4");
	paciente.setTelefone("(11) 97418-7088");
	
	Paciente paciente2 = new Paciente();
	paciente2.setCpf("458.525.631-02");
	paciente2.setDataDeNacsimento(LocalDate.of(2004, 8, 7)); //data
	paciente2.setEndereco(endereco);
	paciente2.setNome("Pablo Pontes");
	paciente2.setPlanoDeSaude(planoDeSaude2);
	paciente2.setRg("10.125.125-8");
	paciente2.setTelefone("(11) 97418-7088");
	
	//exibir os dados do paciente
 
	// nome do paciente:
	// telefone do paciente:
	// operadora do plano:
	// categoria do plano:
	// cidade do paciente:
	// estado do paciente:
	
	System.out.println("Nome do paciente: " + paciente.getNome());
	System.out.println("");
	System.out.println("Telefone do paciente: " + paciente.getTelefone());
	System.out.println("");
	System.out.println("Operadora do Plano: " + paciente.getPlanoDeSaude().getOperadora());
	System.out.println("");
	System.out.println("Validade: " + paciente.getPlanoDeSaude().getValidade());
	System.out.println("");
	System.out.println("RG do paciente: " + paciente.getRg());
	System.out.println("");
	System.out.println("CPF do paciente: " + paciente.getCpf());
	System.out.println("");
	System.out.println("Data de Nascimento do paciente: " + paciente.getDataDeNacsimento());
	System.out.println("");
	System.out.println("Endereço do paciente: " + paciente.getEndereco().getLogradouro());
	System.out.println("");
	System.out.println("Numero da casa: " + paciente.getEndereco().getNumero());
	System.out.println("");
	System.out.println("Cidade do paciente: " + endereco.getCidade());
	System.out.println("");
	
	
	System.out.println("Nome do paciente: " + paciente2.getNome());
	System.out.println("");
	System.out.println("Telefone do paciente: " + paciente2.getTelefone());
	System.out.println("");
	System.out.println("Operadora do Plano: " + paciente2.getPlanoDeSaude().getOperadora());
	System.out.println("");
	System.out.println("Validade: " + paciente2.getPlanoDeSaude().getValidade());
	System.out.println("");
	System.out.println("RG do paciente: " + paciente2.getRg());
	System.out.println("");
	System.out.println("CPF do paciente: " + paciente2.getCpf());
	System.out.println("");
	System.out.println("Data de Nascimento do paciente: " + paciente2.getDataDeNacsimento());
	System.out.println("");
	System.out.println("Endereço do paciente: " + paciente2.getEndereco().getLogradouro());
	System.out.println("");
	System.out.println("Numero da casa: " + paciente2.getEndereco().getNumero());
	System.out.println("");
	System.out.println("Cidade do paciente: " + endereco.getCidade());
	System.out.println("");
	

	
	// criar especialidade
	Especialidade especialidade1 = new Especialidade();
	especialidade1.setNome("Cardiologia");
	especialidade1.setDescricao("cuida do coraçãoo");
	
	
	Especialidade especialidade2 = new Especialidade();
	especialidade2.setNome("Otorrinolaringologista");
	especialidade2.setDescricao("cuida da gartganta, ouvido, etc..");
	
	
	Especialidade especialidade3 = new Especialidade();
	especialidade3.setNome("Clinico");
	especialidade3.setDescricao("sabe de tudo um poquinho");
	
	
	Especialidade especialidade4 = new Especialidade();
	especialidade4.setNome("Ortopedista");
	especialidade4.setDescricao("cuida dos ossos");
	
	
	// objeto medico
	Medico medico = new Medico();
	medico.setNome("Maria Ana");
	medico.setEmail("ana123dr@gmail.com");
	medico.setCrm("25417-8");
	Especialidade[] especialidades1 = { especialidade1, especialidade2};
	medico.setEspecialidades(especialidades1);
	
	Medico medico2 = new Medico();
	medico2.setNome("João Pontes");
	medico2.setEmail("Joao523dr@gmail.com");
	medico2.setCrm("4547-5");
	Especialidade[] especialidades2  = { especialidade1, especialidade2, especialidade3, especialidade4};
	medico2.setEspecialidades(especialidades2);
	
	//exibir especialidades 
	
	//nome do medico:
	//especialidade 1:
	//especialidade 2:
	// especialidade3:
	
	System.out.println("Nome do medico: " + medico.getNome());
	int contador = 0;
	
	while (contador < especialidades1.length) {
		System.out.println("Especialidade: " + (contador+1) + " - " + medico.getEspecialidades()[contador].getNome());
		contador++;
		
		System.out.println("");
		
		System.out.println("Nome do medico: " + medico2.getNome());
		 contador = 0;
		
		while (contador < especialidades2.length) {
			System.out.println("Especialidade: " + (contador+1) + " - " + medico2.getEspecialidades()[contador].getNome());
			contador++;
			
			
			//fazer agendamento para victoria 
			// cardio dia 27/09 - 14h15m
			
			Agenda agenda1 = new Agenda();
			agenda1.setPaciente(paciente);
			agenda1.setEspecialidade(especialidade1);
			agenda1.setMedico(medico);
			agenda1.setData(LocalDate.of(2022, 9, 27));
			agenda1.setTime(LocalTime.of(14, 15));
			
			
			//fazer agendamento para pablo 
			//ortopedista - 12/10 - 09h30m
			Agenda agenda2 = new Agenda();
			agenda2.setPaciente(paciente2);
			agenda2.setEspecialidade(especialidade4);
			agenda2.setMedico(medico2);
			agenda2.setData(LocalDate.of(2022, 10, 12));
			agenda2.setTime(LocalTime.of(9, 30));
			
			// mostrar agendas
			System.out.println("");
			System.out.println("Agenda do paciente: " + agenda1.getPaciente().getNome());
			System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
			System.out.println("Medico: " + agenda1.getMedico().getNome());
			System.out.println("data: " + agenda1.getData());
			System.out.println("hora: " + agenda1.getTime());
			
			
			System.out.println("");
			System.out.println("Agenda do paciente: " + agenda2.getPaciente().getNome());
			System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
			System.out.println("Medico: " + agenda2.getMedico().getNome());
			System.out.println("data: " + agenda2.getData());
			System.out.println("hora: " + agenda2.getTime());
			
		
		
	}
	
	
	}

	}
}
