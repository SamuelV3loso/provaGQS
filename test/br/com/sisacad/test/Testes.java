package br.com.sisacad.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.sisacad.service.Cadastro;

public class Testes {

	/*
	 * Testes de cadastros de estudantes
	 */
	@Test
	public void test1() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a", "a", "a", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test2() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "12345678", "ze", "a","a", true);
		assertEquals(true, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test3() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("acom.br", "12345678", "ze", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test4() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "123", "ze", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test5() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "", "ze", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test6() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "12345678", "admin", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test7() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "12345678", "root", "a","a", true);
		assertEquals(false, cadastroRealizadoComSucesso);
	}

	
	/*
	 * Testes de cadastros de professores
	 */
	@Test
	public void test11() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a", "a", "a", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test12() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "12345678", "ze", "a","a", true);
		assertEquals(true, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test13() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("acom.br", "12345678", "ze", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test14() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "123", "ze", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test15() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "", "ze", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test16() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "12345678", "admin", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
	
	@Test
	public void test17() {
		Cadastro cadastro = new Cadastro();
		boolean cadastroRealizadoComSucesso = cadastro.cadastrodeusuario("a@com.br", "12345678", "root", "a","a", false);
		assertEquals(false, cadastroRealizadoComSucesso);
	}
}
