package br.cesed.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GerenteDeBiblioteca {
	// aqui fazemos a conexao com o banco
	private Connection con = Conexao.conecta();

	// método para inserir no BD
	public void cadastrarLivro(Livros livro) {

		String sql = "INSERT INTO Livros(codlivro, nome, descricao) VALUES (?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, livro.getCodLivro());
			ps.setString(2, livro.getNome());
			ps.setString(3, livro.getDescricao());

			ps.execute();
			ps.close();

			System.out.println("Cadastrado com sucesso");

		} catch (SQLException e) {
			System.out.println("Erro = " + e.getMessage());
		}

	}

	// método para atualizar no BD
	public void atualizarDados(Livros livro) {

		String sql = "UPDATE livros SET codlivro=?, nome=?, descricao=? WHERE idLivro = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, livro.getCodLivro());
			ps.setString(2, livro.getNome());
			ps.setString(3, livro.getDescricao());
			ps.setInt(4, livro.getIdLivro());

			ps.execute();
			ps.close();

			System.out.println("Atualizado com Sucesso");

		} catch (SQLException e) {
			System.out.println("Erro = " + e.getMessage());
		}

	}

	// método para excluir no BD
	public void removerDados(Livros livro) {

		String sql = "DELETE FROM livros WHERE idLivro = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, livro.getIdLivro());
			ps.execute();
			ps.close();

			System.out.println("Deletado com Sucesso");

		} catch (SQLException e) {
			System.out.println("Erro = " + e.getMessage());
		}

	}
	
	// método para listar todos do BD
	public List<Livros> buscarRegistros(Livros livro) {
		String sql = "DELETE FROM livros WHERE idLivro = ?";
		List<Livros> lista = new ArrayList<Livros>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			
			while (res.next()){
				Livros busca = new Livros();
				busca.setIdLivro(res.getInt("idLivro"));
				busca.setCodLivro(res.getString("CodLivro"));
				busca.setNome(res.getString("nome"));
				lista.add(busca);
				
			}

			
		} catch (SQLException e) {
			System.out.println("Erro = " + e.getMessage());
		}
		return lista;

	}

}
