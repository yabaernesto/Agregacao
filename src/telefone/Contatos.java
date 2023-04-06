package telefone;
import java.util.ArrayList;

public class Contatos {
  // Do tipo Contato
  private ArrayList<Contato> contatos;

  public Contatos() {
    this.contatos = new ArrayList<Contato>();
  }

  public void adicionar(String nome, String numero) {
    Contato novoContato = new Contato(nome, numero);
    contatos.add(novoContato);
  }

  public void adicionar(Contato novoContato) {
    contatos.add(novoContato);
  }

  // search [filtrar]
  public Contatos buscar(String palavraChave) {
    String palavraChaveMinuscula = palavraChave.toLowerCase();
    Contatos contatosFiltrados = new Contatos();
    for (Contato contato : this.contatos) {
      String nomeContatoMinusculo = contato.getNome().toLowerCase();
      if (nomeContatoMinusculo.startsWith(palavraChaveMinuscula)) {
        contatosFiltrados.adicionar(contato);
      }
    }
    return contatosFiltrados;
  }

  public ArrayList<Contato> getContatos() {
    return contatos;
  }

  @Override
  public String toString() {
    String informacao = "Contato: \n";

    for (Contato contato : contatos) {
      informacao += contato.toString() + "\n";
    }
    return informacao;
  }
}
