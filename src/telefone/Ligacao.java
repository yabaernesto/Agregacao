package telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
  private String numeroOrigem;
  private String numeroDestino;
  private String horarioLigacao;

  public Ligacao(String numeroOrigem, String numeroDestino) {
    this.numeroOrigem = numeroOrigem;
    this.numeroDestino = numeroDestino;
  }

  public Ligacao(Contato numeroOrigem, Contato numeroDestino) {
    this.numeroOrigem = numeroOrigem.getNome();
    this.numeroDestino = numeroDestino.getNome();
  }

  public void ligar() {
    System.out.println("Ligando para "+ numeroDestino);
    System.out.println("Chamando...");
    System.out.println("O número está ocupado");
    DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
    LocalDateTime horarioAgora = LocalDateTime.now();
    horarioLigacao = formatadorData.format(horarioAgora);
  }

  public String getnumeroOrigem() {
    return numeroOrigem;
  }
  public void setnumeroOrigem(String numeroOrigem) {
    this.numeroOrigem = numeroOrigem;
  }
  public String getnumeroDestino() {
    return numeroDestino;
  }
  public void setnumeroDestino(String numeroDestino) {
    this.numeroDestino = numeroDestino;
  }

  @Override
  public String toString() {
    String informacao = String.format("Origem: %s\tDestino: %s\tHorario: %s",
      numeroOrigem, 
      numeroDestino, 
      horarioLigacao
    );
    return informacao;
  }
}
