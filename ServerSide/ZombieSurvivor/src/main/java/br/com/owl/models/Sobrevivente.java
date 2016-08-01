package br.com.owl.models;

import java.util.Date;

public class Sobrevivente {
	private int id;
	private String nome;
	private Sexo sexo;
	private String latitude;
	private String longitude;
	private int idade;
	private Inventario inventario;
	private boolean infectado;
	private int numeroIndicacoes;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNumeroIndicacoes() {
		return numeroIndicacoes;
	}
	public void setNumeroIndicacoes(int numeroIndicacoes) {
		this.numeroIndicacoes = this.numeroIndicacoes + numeroIndicacoes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	public boolean isInfectado() {
		return infectado;
	}
	public void setInfectado(boolean infectado) {
		this.infectado = infectado;
	}
	
	public Sobrevivente(String nome, Sexo sexo, String latitude, String longitude, int idade, Inventario inventario, boolean infectado) {
		setNome(nome);
		setSexo(sexo);
		setLatitude(latitude);
		setLongitude(longitude);
		setInventario(inventario);
		setInfectado(infectado);
		setIdade(idade);
	}
	
	public Sobrevivente() {
	}
}
