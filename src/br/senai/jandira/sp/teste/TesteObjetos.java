package br.senai.jandira.sp.teste;

import java.util.ArrayList;

import br.senai.jandira.sp.AgendaApp;
import br.senai.jandira.sp.dao.EspecialidadeDAO;
import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        EspecialidadeDAO dao = new EspecialidadeDAO();
        
        
        Especialidade e1 = new Especialidade();
        e1.setNome("Cardiologia");
        e1.setDescricao("nao deixa ter um ataque");
        
        EspecialidadeDAO.gravar(e1);

        Especialidade e2 = new Especialidade();
        e2.setNome("Gastroenterologia");
        e2.setDescricao("nao deixa ter dor no estomago");

       EspecialidadeDAO.gravar(e2);
   
        for (Especialidade ee : EspecialidadeDAO.getEspecialidades()){
            System.out.println(ee.getNome());
        }
        
       
        
        Especialidade e3 = new Especialidade();
        e3.setNome("QUALQUER COISA");
        
        
        Especialidade e4 = new Especialidade();
        e4.setNome("Clinico geral");
        e4.setDescricao("da o diagnostico");

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        System.out.println(especialidades.size());

        //imprimir dno console o nome das especialidades que estao armazenadas no arraylist	
         //criar 3 planos de saude e armazenar em arraylist 
        // e exibir o nome de cada operadora
        
        PlanoDeSaude plano = new PlanoDeSaude("AMIL");
        PlanoDeSaude plano2 = new PlanoDeSaude("INTERMEDICA");
        PlanoDeSaude plano3 = new PlanoDeSaude("BRADESCO");

        ArrayList<PlanoDeSaude> planos = new ArrayList<>();
        planos.add(plano);
        planos.add(plano2);
        planos.add(plano3);

        //Imprimir no console
  
        for (PlanoDeSaude p : planos) {
            System.out.println(p.getOperadora()); 
       }
       
            System.out.println(plano.getQuantidade());

            AgendaApp.main(args);

            System.out.println("------" + PlanoDeSaude.getQuantidade());
        }

    }