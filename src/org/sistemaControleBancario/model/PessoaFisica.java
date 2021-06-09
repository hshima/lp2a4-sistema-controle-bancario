package org.sistemaControleBancario.model;

public class PessoaFisica extends Pessoa {

	private long cpfPessoa;
	private long rgPessoa;
	private int idadePessoa;
	
	public long getCpfPessoa() {
		return cpfPessoa;
	}
	public void setCpfPessoa(long cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}
	public long getRgPessoa() {
		return rgPessoa;
	}
	public void setRgPessoa(long rgPessoa) {
		this.rgPessoa = rgPessoa;
	}
	public int getIdadePessoa() {
		return idadePessoa;
	}
	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	
	public int registrarPessoa() {
		return 0;
	}
	
	public int validarCpf(long cpf) {
		return 0;
	}
	
	public String consultarCpf(long cpf) {
		return null;
	}
}
