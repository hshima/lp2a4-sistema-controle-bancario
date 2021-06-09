package org.sistemaControleBancario.model;

import java.util.List;

public abstract class Pessoa {

	protected String nomePessoa;
	protected String enderecoPessoa;
	protected long cepPessoa;
	protected String telefonePessoa;
	protected double rendaPessoa;
	protected  int situacaoPessoa = 1;
	private List<ContaComum > conta;
	
}
