package br.com.sisacad.service;

import br.com.sisacad.model.Estudante;
import br.com.sisacad.model.Professor;

public class Cadastro {

	public boolean cadastrarUsuario(String email, String senha, String login, String nome, String dataNasc, boolean estudante){
		if(email.contains("@") && !senha.isEmpty() && senha.length() > 6 && 
				!login.equals("admin") && !login.equals("root")	){
			
			if(estudante){
				Estudante novoEstudante = new Estudante(login, email, senha, nome, null, null);
				return true;
			} else {
				Professor novoProfessor = new Professor(login, email, senha, nome, null);
			}
		}
		return false;
	}
}
