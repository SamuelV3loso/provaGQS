package br.com.sisacad.service;

import br.com.sisacad.model.Estudante;
import br.com.sisacad.model.Professor;

public class Cadastro {
	
	/*
	 * Método para cadastrar um novo usuário, recebe o email, senha, o nome de login,
	 * a data de nascimento e um boolean que será true se o novo usuário for um estudante
	 * e false se o novo usuário for um professor. O método retorna true se o usuário for
	 * cadastrado com sucesso e false caso contrário.
	 * para o usuário poder ser cadastrado ele precisa atender alguns requisitos.
	 */
	public boolean cadastrarUsuario(String email, String senha, String login, String nome, String dataNasc, boolean estudante){
		if(email.contains("@") && !senha.isEmpty() && senha.length() > 6 && 
				!login.equals("admin") && !login.equals("root")	){
			
			if(estudante){
				Estudante e = new Estudante(login, email, senha, nome, null, null);
				return true;
			} else {
				Professor p = new Professor(login, email, senha, nome, null);
			}
		}
		return false;
	}
}
