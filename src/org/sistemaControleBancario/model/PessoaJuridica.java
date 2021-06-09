package org.sistemaControleBancario.model;

public class PessoaJuridica extends Pessoa {

	private long cnpjPessoa;
	
	public int registrarPessoa() {
		return 0;
	}
	
	public int validarCnpj(long cnpj) {
		return 0;
	}
	
	public String consultarCnpj(long cnpj) {
		return null;
	}
}
