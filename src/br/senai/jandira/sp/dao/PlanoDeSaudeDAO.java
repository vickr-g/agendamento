package br.senai.jandira.sp.dao;

import java.time.LocalDate;
import br.senai.jandira.sp.model.PlanoDeSaude;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

   
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) { //criar
        planosDeSaude.add(p);
    }

    public static ArrayList<PlanoDeSaude> getPlano() { //read
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) { // READ

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                return p;
            }

        }

        return null;

    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizada) { // UPDATE
        
        for (PlanoDeSaude p : planosDeSaude) {

            if (p.getNumero() == planoDeSaudeAtualizada.getNumero()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizada);
                break;

            }

        }
    }

    public static void excluir(Integer codigo) { // DELETE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                planosDeSaude.remove(p);
                break;
            }
        }

    }

// Criar uma lista inicial de especialidades
    public static void criarListaDePlanoDeSaude() {
        PlanoDeSaude plano1 = new PlanoDeSaude("125422552", "Prata", "Intermedica", LocalDate.of(2026, 02, 15));
        PlanoDeSaude plano2 = new PlanoDeSaude("125347812", "Ouro", "NotreDame", LocalDate.of(2028, 12, 12));
        PlanoDeSaude plano3 = new PlanoDeSaude("145646514", "Prata", "Amil", LocalDate.of(2027, 11, 18));
        PlanoDeSaude plano4 = new PlanoDeSaude("600865453", "Prata", "Unimed", LocalDate.of(2035, 8, 20));

        planosDeSaude.add(plano1);
        planosDeSaude.add(plano2);
        planosDeSaude.add(plano3);
        planosDeSaude.add(plano4);

    }

    public static DefaultTableModel getTabelaPlanosDeSaude() {

        String[] titulo = {"CÓDIGO", "NÚMERO", "OPERADORA", "CATEGORIA", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][6];

        for (PlanoDeSaude p : planosDeSaude) {
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNumero();
            dados[i][2] = p.getOperadora();
            dados[i][3] = p.getCategoria();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][4] = p.getValidade().format(barra);

        }

        return new DefaultTableModel(dados, titulo);
    }

}
