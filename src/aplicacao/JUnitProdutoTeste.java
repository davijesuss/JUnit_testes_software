package aplicacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitProdutoTeste {

	@Test
    public void testTotalValueInStock() {
        Produto produto = new Produto("pc", 10, 12);

        double valorEsperado = 10 * 12; // preço * quantidade
        double valorCalculado = produto.totalValueInStock();

        assertEquals(valorEsperado, valorCalculado, 0.001); // Verifica se o valor está correto com uma margem de erro de 0.001
    }

    @Test
    public void testAddProduto() {
        Produto produto = new Produto("pc", 10, 12);

        produto.addProduto(5); // Adiciona 5 unidades

        assertEquals(17, produto.getQuantidade()); // Verifica se a quantidade foi atualizada corretamente
    }

    @Test
    public void testRemoveProduto() {
        Produto produto = new Produto("pc", 10, 12);

        produto.removeProduto(3); // Remove 3 unidades

        assertEquals(9, produto.getQuantidade()); // Verifica se a quantidade foi atualizada corretamente
    }

}
