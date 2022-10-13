package entities;

public class Product {
  public String name;
  public String date;
  public int lote;
  public int quantity;
  public double price;
  public double weight;
  public int hora;
  public int enter;

  public void horaProducts(int hora) {
    this.hora = 1;
    if (hora >= 12) {
      System.out.println("Horário não permitido para entradas de novos produto no estoque.");
    } else {
      System.out.println("Entre com os dados dos produtos.");
    }
  }

  public void enterProducts(int enter) {
    this.enter = 1;
    if (enter == 1) {
      System.out.println("Novos produtos adicionado com sucesso ao estoque.");
    } else {
      System.out.println("ERRO!.");
    }
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
    if (quantity > 500) {
      System.out.println("Você não pode entrar com essa quantidade no estoque após 12:00 horas");
    }
  }

  public String toString() {
    return "Product's name: " + name
        + " ,Last release date: " + date
        + " ,Nº Lote: " + lote
        + " ,Amount received: " + quantity
        + " ,Product unit value: $" + price
        + " ,Unit Weight: " + String.format("%.2fKg", weight);
  }
}
