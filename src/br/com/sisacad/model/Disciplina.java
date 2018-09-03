package br.com.sisacad.model;

public class Disciplina {
	
	private String Nome;
	private Professor prof;
	private String listaDeEstudantes;
	private int ano;
	private int semestre;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	public String getListaDeEstudantes() {
		return listaDeEstudantes;
	}
	public void setListaDeEstudantes(String listaDeEstudantes) {
		this.listaDeEstudantes = listaDeEstudantes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

}
