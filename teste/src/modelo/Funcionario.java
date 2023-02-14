package modelo;

import java.util.ArrayList;

public class Funcionario {

	private String nome;
	private Long cpf;
	
	private ArrayList<Pessoa> pessoas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
}
