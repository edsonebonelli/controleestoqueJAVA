import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /*
         * Objetivo do código é armazenar, retirar e controlar produtos no estoque de um
         * armazen.
         * Na primeira parte o código vai solicitar ao usuário várias informações
         * referente ao produto.
         * tais como: (NOME, Nº DO LOTE, QUANTIDADE, DATA DA ENTREGA E VALOR).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Informe o horário de recebimento: ");
        System.out.print(": ");
        int hora = sc.nextInt();
        product.horaProducts(hora);
        System.out.println();

        System.out.println("Enter the product name: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.println();

        System.out.println("Enter the date of receipt: ");
        System.out.print("Date: ");
        product.date = sc.nextLine();
        System.out.println();

        System.out.println("Enter the number of lote: ");
        System.out.print("Nº Lote: ");
        product.lote = sc.nextInt();
        System.out.println();

        System.out.println("Enter the number of quantity: ");
        System.out.print("Nº Quantity: ");
        product.quantity = sc.nextInt();
        System.out.println();

        System.out.println("Enter product value: ");
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.println();

        System.out.println("Enter the weigth of product: ");
        System.out.print("Weigth: ");
        product.weight = sc.nextDouble();
        System.out.println();

        System.out.println("Add new products to stock? Enter 1");
        int enter = sc.nextInt();
        product.enterProducts(enter);
        System.out.println();
        System.out.println("Current inventory: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
