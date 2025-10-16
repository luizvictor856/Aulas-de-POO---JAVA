package exerciciotarefa;

public class TarefaSimples extends Tarefa implements Executavel{
    public class tarefasimples () {
        super(descricao);
    }

    @Override
    public String resumo () {
        // todo auto-generated methos stub
        return String.format("Tarefa Simples: %s", getDescricao());
    }
}

/// etccc