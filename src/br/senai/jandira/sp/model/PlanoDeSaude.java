package br.senai.jandira.sp.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    private static int contador = 99;
    private Integer codigo;
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private static int quantidade;
    
    
    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            this.validade = validade;
            gerarCodigo();
        }
	
	public PlanoDeSaude(String operadora) {
            this.operadora = operadora;
            gerarCodigo();
	}
	
	public PlanoDeSaude() {
            gerarCodigo();
	}
        
        public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade, Integer codigo) {
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            this.validade = validade;
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
	
    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

   

    public String getPlanoSeparadaPorPontoEVirgula() {
        return this.codigo + ";" + this.operadora + ";" + this.numero + ";" + this.categoria + ";" + this.validade;
    }

}
