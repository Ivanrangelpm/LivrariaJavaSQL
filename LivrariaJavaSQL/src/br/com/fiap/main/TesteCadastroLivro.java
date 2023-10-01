package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteCadastroLivro {

	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		LivroDAO dao = new LivroDAO();
		
		Livro objetoLivro = new Livro();
		
		objetoLivro.setCodigo(inteiro("Digite o codigo"));
		objetoLivro.setTitulo(texto("Titulo do livro"));
		objetoLivro.setEditora(texto("Editora do livro"));
		objetoLivro.setAutor(texto("Autor do livro"));
		objetoLivro.setValor(real("Valor do livro"));
		
		
		System.out.println(dao.inserir(objetoLivro));
		
	}

}
