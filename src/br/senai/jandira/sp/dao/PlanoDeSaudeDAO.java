package br.senai.jandira.sp.dao;

import br.senai.jandira.sp.model.Especialidade;
import java.time.LocalDate;
import br.senai.jandira.sp.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private final static String URL = "C:\\Users\\22282222\\javadst\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282222\\javadst\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude plano) { //criar
        planosDeSaude.add(plano);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(plano.getPlanoSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
        }
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
            atualizarArquivo();
        }
    }

    public static void excluir(Integer codigo) { // DELETE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                planosDeSaude.remove(p);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        // criar representação dos arquivos que serao manipulados 
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //criararquivo
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //interar para add as especialidade no arquivo temporario exceto o que o registro nao que mais
            for (PlanoDeSaude p : planosDeSaude) {
                bwTemp.write(p.getPlanoSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            
            
            // Excluir o arquivo atual
            arquivoAtual.delete();

            // Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void criarListaDePlanoDeSaude() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //transformar os dados da linha em especialdade
                String[] vetor = linha.split(";");
               PlanoDeSaude p = new PlanoDeSaude(vetor[1], vetor[2], vetor[3],LocalDate.parse(vetor[4]) ,Integer.valueOf(vetor[0]));

                //guardar a especialidade na lista
                  planosDeSaude.add(p);
                //ler a proxima linha 
                linha = leitor.readLine();
            }
            leitor.close();

        } catch (IOException p) {
        }

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
