package aplicacao;

import org.junit.Test;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) { // construtot
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preco) { // sobrecarga
		this.nome = nome;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco() {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome() {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Test
	public double totalValueInStock() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}