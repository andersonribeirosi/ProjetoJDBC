package br.cesed.jdbc;

public class Livros {
	
	private Integer idLivro;
	private String codLivro;
	private String nome;
    private String descricao;
    
    
	public Integer getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	public String getCodLivro() {
		return codLivro;
	}
	public void setCodLivro(String codLivro) {
		this.codLivro = codLivro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
