package exercicioTarefa;

public class exercicioMain {
    public static void main (String [] args) {
        List<Tarefa> tarefalist = new Arraylist <>(); // Tarefa é uma super classe
        //upcasting
        tarefalist.add(new TarefaSimples("fazer chamada"));
        tarefalist.add(new TarefaPrazo("aplicar Prova2", "06/11/2025"));
        tarefalist.add(new TarefaRecorrente("Dar aula", 7));

        for(Tarefa tarefa: tarefaList) {
            System.out.println (tarefa.resumo()); // todas as tarefas tem o metodo resumo

            if(tarefa instanceof TarefaPrazo) {
               System.out.println ((TarefaPrazo) tarefa).getPrazo();
            }
        }


    }
}