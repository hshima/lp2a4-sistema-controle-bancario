package org.sistemaControleBancario.model;

import java.sql.Time;
import java.util.Date;

public class Movimento {
	private int tipoMovimento;
	private Date dataMovimento;
	private Time horaMovimento;
	private double valorMovimento;
	
	public int registrarMovimento(int entradaSaida, double valor) {
		return 0;
	}
	
	public String consultaMovimento(Date dataMovimentacao) {
		return null;
	}

}
