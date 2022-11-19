package br.com.lopes.orm;

import br.com.lopes.orm.modelo.entidade.Produto;
import br.com.lopes.orm.modelo.persistencia.ProdutoDAO;

import java.util.List;

public class App {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
		Produto produto = new Produto();
		produto.setCodigo(10);
		produto.setNome("Livro Java");
		produto.setValor(12);
		dao.salvar(produto);
		Produto produto2 = dao.obter(1l);
	    System.out.println(produto2);
		List<Produto> listaTodos = dao.listaTodos();
		System.out.println(listaTodos);
    }
}
