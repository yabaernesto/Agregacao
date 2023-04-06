import telefone.Contato;
import telefone.Contatos;
import telefone.Ligacao;
import telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("4002 8900");

        Contato contatoA = new Contato("Yaba", "948 232 55");
        Contato contatoB = new Contato("Mayk", "232 234 55");
        Contato contatoC = new Contato("Joilson", "234 232 55");

        // System.out.println(contatoA);
        // System.out.println(contatoB);
        // System.out.println(contatoC);

        // telefone.getContatos().adicionar(contatoA);
        // telefone.getContatos().adicionar(contatoB);
        // telefone.getContatos().adicionar(contatoC);

        Contatos telefoneContato = telefone.getContatos();
        telefoneContato.adicionar(contatoB);
        telefoneContato.adicionar(contatoA);
        telefoneContato.adicionar(contatoC);
        System.out.println(telefoneContato);

        System.out.println("Contatos filtrados: ");
        System.out.println(telefoneContato.buscar("lu"));

        Ligacao ligacao = new Ligacao("123", "455");
        ligacao.ligar();
        System.out.println(ligacao);
    }
}
