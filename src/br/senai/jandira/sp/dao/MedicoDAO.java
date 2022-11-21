package br.senai.jandira.sp.dao;

import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MedicoDAO {
private final static String URL = "C:\\Users\\22282222\\javadst\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282222\\javadst\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medico = new ArrayList<>();

    public static void gravar(Medico m) {
        medico.add(m);

        // gravar em arquivo  
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
    }
        }
    

    public static ArrayList<Medico> getMedicos() {
        return medico;
    }

//    public static Medico getEspecialidade(Integer codigo) {
//        for (Medico m : medico) {
//            if (m.getCrm()== codigo) {
//                return m;
//            }
//
//        }
//        return null;
//    }
//
////    public static void atualizar(Medico especialidadeAtualizada) {
////        int i = 0;
////        for (Medico m  : medico) {
////            if (m.getCodigo() == especialidadeAtualizada.getCodigo()) {
////                //e= especialidadeAtualizada;
////                medico.set(i, especialidadeAtualizada);
////                break;
////            }
////            i++;
////        }
////        atualizarArquivo();
////    }
////
////    public static void excluir(Integer codigo) {
////        for (Medico m  : medico) {
////            if (m.getCodigo().equals(codigo)) {
////                medico.remove(m);
////                break;
////            }
////            
////        }
//        atualizarArquivo();
//    }
//
//    private static void atualizarArquivo() {
//        // criar representação dos arquivos que serao manipulados 
//        File arquivoAtual = new File(URL);
//        File arquivoTemp = new File(URL_TEMP);
//
//        try {
//            //criararquivo
//            arquivoTemp.createNewFile();
//
//            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
//                    StandardOpenOption.APPEND,
//                    StandardOpenOption.WRITE);
//
//            //interar para add as especialidade no arquivo temporario exceto o que o registro nao que mais
//            for (Medico m  : medico) {
//                bwTemp.write(m.getEspecialidadeSeparadaPorPontoEVirgula());
//                bwTemp.newLine();
//            }
//            bwTemp.close();
//            
//            
//            // Excluir o arquivo atual
//            arquivoAtual.delete();
//
//            // Renomear o arquivo temporário
//            arquivoTemp.renameTo(arquivoAtual);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    //criar uma lista inicial
//    
//    //criar lista de especialidade
//    public static void criarListaDeEspecialidade() {
//        try {
//            BufferedReader leitor = Files.newBufferedReader(PATH);
//
//            String linha = leitor.readLine();
//
//            while (linha != null) {
//                //transformar os dados da linha em especialdade
//                String[] vetor = linha.split(";");
//               //Medico m = new Medico(vetor[1], vetor[2], Integer.valueOf(vetor[0]));
//
//                //guardar a especialidade na lista
//               // medico.add(m);
//
//                //ler a proxima linha 
//                linha = leitor.readLine();
//            }
//            leitor.close();
//
//        } catch (IOException m) {
//        }

    }

//}
