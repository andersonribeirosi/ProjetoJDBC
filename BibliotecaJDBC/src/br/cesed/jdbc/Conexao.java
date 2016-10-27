package br.cesed.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection conecta() {

		Connection con = null;

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblioteca", "postgres", "5414jb");
			System.out.println("Conectado com sucesso");
		} catch (Exception e) {
			System.out.println("Erro - conexão" + e.getMessage());

		}
		return con;

	}

}
