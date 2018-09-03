package br.com.sisacad.model;

import java.util.Calendar;

public class Professor extends Usuario{
	
	private String nomeDoProfessor;
	private Calendar datanasc;	
	
	public Professor(String login, String email, String senha, String nomeDoProfessor, Calendar datanasc) {
		setLogin(login);
		setEmail(email);
		setSenha(senha);
		this.nomeDoProfessor = nomeDoProfessor;
		this.datanasc = datanasc;
	}
	public String getNomeDoProfessor() {
		return nomeDoProfessor;
	}
	public void setNomeDoProfessor(String nomeDoProfessor) {
		this.nomeDoProfessor = nomeDoProfessor;
	}
	public Calendar getData_nasc() {
		return datanasc;
	}
	public void setData_nasc(Calendar datanasc) {
		this.datanasc = datanasc;
	}
	

}
