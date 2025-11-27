package br.edu.unisep.tarefas.view;

import br.edu.unisep.tarefas.model.Tarefa;
import br.edu.unisep.tarefas.util.Funcoes;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int opt;
       while (true){
           System.out.println("\n\n=== LISTA DE TAREFAS ===");
           System.out.println("1 - Adicionar tarefa");
           System.out.println("2 - Listar tarefas");
           System.out.println("3 - Editar tarefa");
           System.out.println("4 - Excluir tarefa");
           System.out.println("0 - Sair");
           System.out.print("Opção: ");
           opt = sc.nextInt();
           sc.nextLine();
           switch (opt){
               case 1:
                   System.out.println("Informe a Descrição");
                   String desc = sc.nextLine();
                   System.out.println("Informe o Local");
                   String local = sc.nextLine();
                   Funcoes.adicionarTarefa(new Tarefa(desc, local));
                   break;
               case 2:
                   List<Tarefa> lista = Funcoes.lerArquivo();
                   for (Tarefa t : lista){
                       System.out.println(t);
                   }
                   System.out.println("Digite qualquer tecla para continuar...");
                   sc.nextLine();
                   break;
               case 3:
                   System.out.println("FAZER O EDITAR");
                   break;
               case 4:
                   List<Tarefa> lista2 = Funcoes.lerArquivo();
                   int id = 0;
                   for (Tarefa t : lista2){
                       System.out.println(id + " - " + t);
                       id++;
                   }
                   System.out.println("Digite o id para excluir");
                   int idExc = sc.nextInt();
                   lista2.remove(idExc);
                   Funcoes.salvarTodas(lista2);
                   break;
               case 0:
                   System.exit(0);
           }
       }
    }
}
