package io.github.kvolanski.ordemservico.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = false)
public class Cliente extends Pessoa{

	@OneToMany(mappedBy = "cliente")
	private List<OrdemServico> list = new ArrayList<>();

	
}
