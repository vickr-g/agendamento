package br.senai.jandira.sp.model;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Medico {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String crm;
    private String email;
    private LocalDate dataDeNacsimento;

    public Medico(String crm, String nome, String telefone, String email, LocalDate dataDeNascimento, Integer codigo) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNacsimento = dataDeNascimento;
        this.codigo = codigo;
        this.contador = codigo;
    }

    public Medico() {
        gerarCodigo();
    }

    public Medico(String crm, String nome, String telefone, Integer codigo) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
        this.contador = codigo;
    }

    //metodos de acesso aos atributos
    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " Não é um nome válido!\nDeve conter pelo menos 3 letras!");
        }

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNacsimento() {
        return dataDeNacsimento;
    }

    public void setDataDeNacsimento(LocalDate dataDeNascimento) {
        this.dataDeNacsimento = dataDeNascimento;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.dataDeNacsimento + ";" + getCodigoEspecialidades();
    }

    public String getCodigoEspecialidades() {
        String codigoEspecialidades = "";
        for (Especialidade especialidade : especialidades) {
            codigoEspecialidades += especialidade.getCodigo() + "&";
        }
        return codigoEspecialidades;
    }

}
