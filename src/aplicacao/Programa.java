
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();

		Produto produto = new Produto(nome, preco);

		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos a sérem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos a sérem removidos do sistema: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		sc.close();
	}
}
