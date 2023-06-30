package dev.klaydm.aplicacao;

import dev.klaydm.dominio.Colecionador;
import dev.klaydm.dominio.Item;

import java.util.Scanner;

public class ColecaoDeItens {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Colecionador colecionador;
    Item item;
    String nomeDoColecionador;
    String nomeDoItem;
    int ano;

    System.out.println("Digite o nome do colecionador: ");
    nomeDoColecionador = scan.nextLine();
    colecionador = new Colecionador(nomeDoColecionador);
    System.out.println();

    while(true) {
      System.out.print("Informe o nome do item: ");
      nomeDoItem = scan.nextLine();

      if(nomeDoItem.isEmpty()) {
        break;
      }

      System.out.print("Informe o ano de fabricação do item: ");
      ano = Integer.parseInt(scan.nextLine());
      item = new Item(nomeDoItem, ano);
      colecionador.getColecao().add(item);
    }

    System.out.printf("A coleção de %s é %s %n", colecionador.getNome(), colecionador.getColecao());
  }
}