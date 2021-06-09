package org.sistemaControleBancario.model;

import java.util.Date;

public class ContaComum {

	protected long numeroConta;
	protected Date aberturaConta;
	protected Date fechamentoConta;
	protected int situacaoConta = 1;
	protected int senhaConta;
	protected double saldoConta = 0d;
	protected Pessoa cliente;
	
	// Getters
	public Date getAberturaConta() {
		return aberturaConta;
	}

	public Date getFechamentoConta() {
		return fechamentoConta;
	}

	public long getNumeroConta() {
		return numeroConta;
	}
	
	public int getSituacaoConta() {
		return situacaoConta;
	}

	public int getSenhaConta() {
		return senhaConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	// Setters
	public void setFechamentoConta(Date fechamentoConta) {
		this.fechamentoConta = fechamentoConta;
	}

	public void setSituacaoConta(int situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

	public void setSenhaConta(int senhaConta) {
		this.senhaConta = senhaConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	// Métodos
	public long abrirConta(int valor) {
		return 0L;
	}
	
	public int consultarConta(long codigoConsulta) {
		return 1;
	}

	public int validarSenha(int senha) {
		return 0;
	}
	
	public double emitirSaldo() {
		return getSaldoConta();
	}
	
	public double emitirExtrato(Date dataMaisRecente, Date dataMaisAntiga) {
		return 0D;
	}
	
	public int sacarValor(double saque) {
		return 0;
	}
	
	public int depositarValor(long tipo, double valor) {
		return 0;
	}
	
	public int encerrarConta(long codigo) {
		return 0;
	}
}
