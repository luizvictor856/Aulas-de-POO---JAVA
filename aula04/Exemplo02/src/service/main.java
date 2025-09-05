import model.pessoa;
import service.CadastrarService;

// responsabilidade da chamada fica para o main 
// instanciou, cadastrou e exibiu

public class main {
    public static void main (String [] args) {
        CadastrarService service = new CadastrarService();
        Pessoa pessoa1 = service.cadastrarPessoa("Luiz", 23);


        System.out.println(service.mostrarPessoa(pessoa1));
    }
}