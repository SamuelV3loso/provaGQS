package br.com.sisacad.model;

import java.util.Calendar;
import java.util.List;

public class Estudante extends Usuario{
	
<<<<<<< HEAD
	private String nomeEstudante;
	private Calendar dataNasc; //data de nascimento
	private List<Disciplina> listaDisciplinas;	
	
	public Estudante(String login, String email, String senha, String nomeEstudante, Calendar dataNasc, List<Disciplina> listaDisciplinas) {
=======
	private String nomeDoEstudante;
	private Calendar data; //data de nascimento
	private List<Disciplinas> lista_de_disciplinas;	
	
	public Estudante(String login, String email, String senha, String nomeDoEstudante, Calendar data, List<Disciplinas> lista_de_disciplinas) {
>>>>>>> parent of df42cb6... Alteração de nomes de variáveis e metódos da classe Estudante
		setLogin(login);
		setEmail(email);
		setSenha(senha);
		this.nomeDoEstudante = nomeDoEstudante;
		this.data = data;
		this.lista_de_disciplinas = lista_de_disciplinas;
	}
	public String getNomeDoEstudante() {
		return nomeDoEstudante;
	}
	public void setNomeDoEstudante(String nomeDoEstudante) {
		this.nomeDoEstudante = nomeDoEstudante;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
<<<<<<< HEAD
	public List<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}
	public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
=======
	public List<Disciplinas> getLista_de_disciplinas() {
		return lista_de_disciplinas;
	}
	public void setLista_de_disciplinas(List<Disciplinas> lista_de_disciplinas) {
		this.lista_de_disciplinas = lista_de_disciplinas;
>>>>>>> parent of df42cb6... Alteração de nomes de variáveis e metódos da classe Estudante
	}

}
