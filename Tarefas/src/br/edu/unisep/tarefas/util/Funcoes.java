package br.edu.unisep.tarefas.util;

import br.edu.unisep.tarefas.model.Tarefa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Funcoes {

    public static final String NOME_ARQUIVO = "tarefas.txt";

    public static void adicionarTarefa(Tarefa t){
        try{
            FileWriter fw = new FileWriter(NOME_ARQUIVO, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(t.paraArquivo());
            bw.newLine();

            bw.close();
            fw.close();
            System.out.println("Tarefa salva com sucesso!");
        } catch (Exception e){
            System.err.println("Erro ao salvar! " + e.getMessage() );
        }
    }

    public static List<Tarefa> lerArquivo(){
        List<Tarefa> lista = new ArrayList<>();
        try{
            File arquivo = new File(NOME_ARQUIVO);
            if (!arquivo.exists()){
                return lista;
            }
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while((linha = br.readLine()) != null){
                if (linha.isBlank()){
                    continue;
                }
//                Tarefa t = new Tarefa();
                lista.add(Tarefa.paraClasse(linha));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.err.println("Erro ao ler arquivo! "+e.getMessage());
        }
        return lista;
    }

    public static void salvarTodas(List<Tarefa> lista){
        try{
            FileWriter fw = new FileWriter(NOME_ARQUIVO);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Tarefa t : lista){
                bw.write(t.paraArquivo());
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Todas as tarefas salvas com sucesso!");
        } catch (Exception e){
            System.err.println("Erro ao salvar! " + e.getMessage() );
        }
    }


}
