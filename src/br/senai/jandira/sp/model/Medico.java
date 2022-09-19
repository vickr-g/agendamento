package br.senai.jandira.sp.model;

public class Medico {

	private String nome;
	private Especialidade[] especialidades;
	private String telefone;
	private String crm;
	private String Email;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Especialidade[] getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(Especialidade[] especialidades) {
		this.especialidades = especialidades;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCrm() {
		return crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}

	
	}

