package br.com.sisacad.model;

import java.util.Calendar;

public class Professor extends Usuario{
	
	private String nomeProfessor;
	private Calendar dataNasc;	
	
	public Professor(String login, String email, String senha, String nomeProfessor, Calendar dataNasc) {
		setLogin(login);
		setEmail(email);
		setSenha(senha);
		this.nomeProfessor = nomeProfessor;
		this.dataNasc = dataNasc;
	}
	public String getNomeDoProfessor() {
		return nomeProfessor;
	}
	public void setNomeDoProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public Calendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	

}
