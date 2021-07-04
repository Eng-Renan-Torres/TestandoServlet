package br.com.rtorres.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	static private Integer contadorId = 1;
	private Integer id;
	private String nome;
	private Date dataAbertura = new Date();
	
	public Empresa(String nome,Date dataAbertura) {
		this.id = contadorId;
		contadorId++;
		this.nome = nome;
		this.dataAbertura = dataAbertura;
	}
	
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	

}
