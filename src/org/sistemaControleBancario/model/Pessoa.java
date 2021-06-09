package org.sistemaControleBancario.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name = "pessoas")
public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = 1797751696562931034L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int idPessoa;

	@Column(name = "nome", nullable = false)
	protected String nomePessoa;
	
	@Column(name = "endereco")
	protected String enderecoPessoa;
	
	@Column(name = "cep")
	protected long cepPessoa;
	
	@Column(name = "telefone")
	protected String telefonePessoa;
	
	@Column(name = "renda")
	protected double rendaPessoa;
	
	@Column(name = "situacao")
	protected  int situacaoPessoa = 1;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "pessoa_contascomuns",
						  joinColumns = {@JoinColumn(name = "idPessoa", referencedColumnName = "numeroConta")},
						  inverseJoinColumns = {@JoinColumn(name = "numeroconta", referencedColumnName = "numeroconta")})
	private List<ContaComum > conta;
	
}
