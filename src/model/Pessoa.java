package model;


import javax.persistence.Embedded;

public class Pessoa {

	private String nome;
	private String cpf;
	private int idade;
	private String telefone;
	@Embedded
	private Endereco endereco;
	
	 public Pessoa(String nome, String cpf, int idade, String fone, Endereco end) {
		 this.nome = nome;
		 this.idade = idade;
		 this.cpf = cpf;
		 telefone = fone;
	};
	
	
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
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
