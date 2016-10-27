package br.cesed.jdbc;

public class TestDAO {

	public static void main(String[] args) {

		testCadastroLivro();
//		testAlterarDados();

	}

	public static void testCadastroLivro() {

		Livros inserir = new Livros();

		inserir.setNome("Adriano Santos");
		inserir.setCodLivro("3450");
		inserir.setDescricao("Banco de Dados Relacional");
		
//		inserir.setNome("Paul Deitel e Harvey Deitel");
//		inserir.setCodLivro("3240");
//		inserir.setDescricao("Java, Como programar (Deitel)");

		GerenteDeBiblioteca nv = new GerenteDeBiblioteca();
		nv.cadastrarLivro(inserir);
	}
	
	public static void testAlterarDados() {

		Livros update = new Livros();

		update.setNome("Paul Deitel");
		update.setCodLivro("3240");
		update.setDescricao("Java, Como programar (Deitel)");
		update.setIdLivro(1);

		GerenteDeBiblioteca nv = new GerenteDeBiblioteca();
		nv.atualizarDados(update);
	}
}
