package models;

import java.util.Date;

public class Cliente {
	private int id;
	private String cpf;
	private String nome;
	private EstadoCivil estado_civil;
	private Date nascimento;
	
	public Cliente(int id, String cpf, String nome, EstadoCivil estado_civil, Date nascimento) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.estado_civil = estado_civil;
		this.nascimento = nascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCivil getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(EstadoCivil estado_civil) {
		this.estado_civil = estado_civil;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
}
