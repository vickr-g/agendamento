package br.senai.jandira.sp.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private LocalDate dataDeNacsimento;
	private String telefone;
	private String rg;
	private String cpf;
	private PlanoDeSaude planoDeSaude;
	private Endereco endereco;

	// metodos de acesso
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNacsimento() {
		return dataDeNacsimento;
	}

	public void setDataDeNacsimento(LocalDate dataDeNacsimento) {
		this.dataDeNacsimento = dataDeNacsimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}