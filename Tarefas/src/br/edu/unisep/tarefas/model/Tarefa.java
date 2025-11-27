package br.edu.unisep.tarefas.model;

public class Tarefa {
    private String descricao;
    private String local;

    public Tarefa() {
    }

    public Tarefa(String descricao, String local) {
        this.descricao = descricao;
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + " - Local: " + local;
    }

    /***
     *  Recebe a linha que veio do arquivo e cria um objeto Tarefa.
     * @param linha tarefa|local
     * @return Objeto Tarefa com os dados carregados.
     */
    public static Tarefa paraClasse(String linha){
        String[] partes = linha.split("\\|");
        if (partes.length != 2){
            return null;
        }
        String desc = partes[0];
        String loc = partes[1];

        return new Tarefa(desc, loc);
    }

    public String paraArquivo(){
        return descricao + "|" + local;
    }
}
