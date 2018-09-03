package br.com.sisacad.model;

import java.util.Calendar;
import java.util.List;

public class Estudante extends Usuario{
	
	private String nomeEstudante;
	private Calendar dataNasc;
	private List<Disciplina> listaDisciplinas;	
	
	public Estudante(String login, String email, String senha, String nomeEstudante, Calendar dataNasc, List<Disciplina> listaDisciplinas) {
		setLogin(login);
		setEmail(email);
		setSenha(senha);
		this.nomeEstudante = nomeEstudante;
		this.dataNasc = dataNasc;
		this.listaDisciplinas = listaDisciplinas;
	}
	public String getNomeDoEstudante() {
		return nomeEstudante;
	}
	public void setNomeDoEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}
	public Calendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	public List<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}
	public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

}
