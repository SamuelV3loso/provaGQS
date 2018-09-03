package br.com.sisacad.model;

public class Disciplina {
	
	private String nomeDisciplina;
	private Professor professor;
	private String listaEstudantes;
	private int ano;
	private int semestre;
	
	public String getNome() {
		return nomeDisciplina;
	}
	public void setNome(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getListaEstudantes() {
		return listaEstudantes;
	}
	public void setListaEstudantes(String listaEstudantes) {
		this.listaEstudantes = listaEstudantes;
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
