package br.senai.jandira.sp.dao;

import br.senai.jandira.sp.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    /*
    essa classe será responsavel pela persistencia de dados
    das especialidades, por exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc..
     */
    private final static String URL = "C:\\Users\\22282222\\javadst\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282222\\javadst\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) {
        especialidades.add(e);

        // gravar em arquivo  
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
    }
        }
    

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }

        }
        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {
        int i = 0;
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                //e= especialidadeAtualizada;
                especialidades.set(i, especialidadeAtualizada);
                break;
            }
            i++;
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
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
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
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

    //criar uma lista inicial
    
    //criar lista de especialidade
    public static void criarListaDeEspecialidade() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //transformar os dados da linha em especialdade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2], Integer.valueOf(vetor[0]));

                //guardar a especialidade na lista
                especialidades.add(e);

                //ler a proxima linha 
                linha = leitor.readLine();
            }
            leitor.close();

        } catch (IOException e) {
        }

    }

    public static DefaultTableModel getTabelaEspecialidades() {

        String[] titulo = {"CODIGO", "NOME DA ESPECIALIDADE", "DESCRICAO"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();

        }
        return new DefaultTableModel(dados, titulo);
    }
    public static DefaultListModel<Especialidade> getListaDeEspecialidades() {
        DefaultListModel<Especialidade> listaDeEspecialidades = new DefaultListModel<>();
        for (Especialidade i : getEspecialidades()) {
            listaDeEspecialidades.addElement(i);
            listaDeEspecialidades.toString();
        }
        return listaDeEspecialidades;
    }

}

