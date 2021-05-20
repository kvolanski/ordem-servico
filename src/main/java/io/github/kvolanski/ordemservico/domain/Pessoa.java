package io.github.kvolanski.ordemservico.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;

@Entity
@Data
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@CPF
	private String cpf;
	private String telefone;
	
}
