package Trabalho_Final;

public abstract class Pessoa {
	
	public Pessoa(String nome, int idade, int id) {
		this.setNome(nome);;
		this.setIdade(idade);
		this.setId(id);
	}
	
	private String nome;
	private int idade;
	private int id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
