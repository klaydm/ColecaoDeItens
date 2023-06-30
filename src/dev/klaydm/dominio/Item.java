package dev.klaydm.dominio;

public class Item {

  private String nome;
  private int anoFabricacao;

  public Item(String nome, int anoFabricacao) {
    this.nome = nome;
    this.anoFabricacao = anoFabricacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnoFabricacao() {
    return anoFabricacao;
  }

  public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }

  @Override
  public String toString() {
    return "Item{" +
            "nome='" + nome + '\'' +
            ", anoFabricacao=" + anoFabricacao +
            '}';
  }
}
