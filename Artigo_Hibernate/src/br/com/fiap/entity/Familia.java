package br.com.fiap.entity;

public class Familia {
	private String nome;
	private String telefoneResidencia;
	private String celular;
	
	
	public Familia(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneResidencia() {
		return telefoneResidencia;
	}

	public void setTelefoneResidencia(String telefoneResidencia) {
		this.telefoneResidencia = telefoneResidencia;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
