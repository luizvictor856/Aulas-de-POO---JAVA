package exercicioTarefa;

public class TarefaPrazo extends Tarefa implements Executavel {
    private String prazo;

    public TarefaPrazo(String descricao, String parazo) {
        super (descricao);
        this.prazo = prazo;
    }

    @Override
    public String resumo () {
        return String.format("tarefa agendada: %s Prazo: %s")
    }
}

/// etcccc