package org.sistemaControleBancario.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "contasComum")
public class ContaComum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "numeroConta")
	protected long numeroConta;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "aberturaConta", nullable = false)
	protected Calendar aberturaConta;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fechamentoConta")
	protected Calendar fechamentoConta;
	
	@Column(name = "situacaoConta")
	protected int situacaoConta = 1;
	
	@Column(name = "senhaConta")
	protected int senhaConta;
	
	@Column(name = "saldoConta")
	protected double saldoConta = 0d;
	
	@Column(name = "clienteId")
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	@JoinTable(name = "pessoa_contacomuns", 
						 joinColumns = {@JoinColumn(name = "numeroconta", referencedColumnName = "numeroConta")},
					 	inverseJoinColumns = {@JoinColumn( name = "idpessoa", referencedColumnName = "id")})
	protected Set<Pessoa > clientes;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "contaMovimento", fetch = FetchType.LAZY)
	protected Set<Movimento> movimentosConta;
	
	// Getters
	public Calendar getAberturaConta() {
		return aberturaConta;
	}

	public Calendar getFechamentoConta() {
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
	public void setFechamentoConta(Calendar fechamentoConta) {
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
