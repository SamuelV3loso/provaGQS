package br.com.sisacad.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.sisacad.service.Cadastro;

public class Testes {

	/*
	 * Testes de cadastros de estudantes
	 */
	@Test
	public void testeCadastrarEstudante1() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a", "a", "a", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarEstudante2() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "12345678", "ze", "a","a", true);
		assertEquals(true, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarEstudante3() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("acom.br", "12345678", "ze", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarEstudante4() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "123", "ze", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarEstudante5() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "", "ze", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarEstudante6() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "12345678", "admin", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarEstudante7() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "12345678", "root", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}

	
	/*
	 * Testes de cadastros de professores
	 */
	@Test
	public void testeCadastrarProfessor1() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a", "a", "a", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarProfessor2() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "12345678", "ze", "a","a", true);
		assertEquals(true, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarProfessor3() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("acom.br", "12345678", "ze", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarProfessor4() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "123", "ze", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarProfessor5() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "", "ze", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarProfessor6() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "12345678", "admin", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void testeCadastrarProfessor7() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrarUsuario("a@com.br", "12345678", "root", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
}
