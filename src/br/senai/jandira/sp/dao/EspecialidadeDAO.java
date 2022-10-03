package br.senai.jandira.sp.dao;

import br.senai.jandira.sp.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {

    /*
    essa classe será responsavel pela persistencia de dados
    das especialidades, por exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc..
     */
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) {
        especialidades.add(e);

    }

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
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
    }

    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }

        }

    }
}
