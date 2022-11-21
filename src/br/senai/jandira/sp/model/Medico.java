package br.senai.jandira.sp.model;

import java.time.LocalDate;

public class Medico {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String crm;
    private String email;
    private LocalDate dataDeNacsimento;

    public Medico(String operadora, String categoria, String numero, LocalDate validade) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNacsimento = dataDeNacsimento;
        gerarCodigo();
    }

    public Medico(String crm) {
        this.crm = crm;
        gerarCodigo();
    }

    public Medico() {
        gerarCodigo();
    }

    public Medico(String operadora, String categoria, String numero, LocalDate validade, Integer codigo) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNacsimento = dataDeNacsimento;
        this.codigo = codigo;
        this.contador = codigo;
    }

    //metodos de acesso aos atributos
    public void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

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
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public LocalDate getDataDeNacsimento() {
        return dataDeNacsimento;
    }

    public void setDataDeNacsimento(LocalDate dataDeNacsimento) {
        this.dataDeNacsimento = dataDeNacsimento;
    }

    public String getEspecialidadeSeparadaPorPontoEVirgula() {
        return this.crm + ";" + this.nome + ";" + this.email + ";" + this.telefone + ";" + this.dataDeNacsimento + ";" + this.especialidades + ";";
    }

}
