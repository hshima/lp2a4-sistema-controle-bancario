package org.sistemaControleBancario.model;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "movimentos")
public class Movimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int idMovimento;
	
	@Column(name = "tipo")
	private int tipoMovimento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataHora")
	private Calendar datahoraMovimento;
	
	@Column(name = "valor")
	private double valorMovimento;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "numeroconta")
	private ContaComum contaMovimento;
	
	
	public int registrarMovimento(int entradaSaida, double valor) {
		return 0;
	}
	
	public String consultaMovimento(Date dataMovimentacao) {
		return null;
	}

}
