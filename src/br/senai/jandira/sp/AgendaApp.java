package br.senai.jandira.sp;

import javax.swing.JOptionPane;

import br.senai.jandira.sp.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		
	 Especialidade especialidade = new Especialidade();
	 especialidade.setNome("Cardiologia");
	 especialidade.setDescricao("A cardiologia cuida do coração");
	 JOptionPane.showMessageDialog(null, especialidade.getNome());
	 JOptionPane.showMessageDialog(null, especialidade.getDescricao());
	 
	 System.out.println(especialidade.getNome());
	 System.out.println(especialidade.getDescricao());
	 
	 Especialidade especialidade2 = new Especialidade();
	 especialidade2.setNome("Clinico");
	 especialidade2.setDescricao("O clinico cuida é responsavel diagnosticar doenças, \ndesde as mais simples até as mais complexas");
	 JOptionPane.showMessageDialog(null, especialidade2.getNome());
	 JOptionPane.showMessageDialog(null, especialidade2.getDescricao());
	 
	 System.out.println(especialidade2.getNome());
	 System.out.println(especialidade2.getDescricao());
	}

}
