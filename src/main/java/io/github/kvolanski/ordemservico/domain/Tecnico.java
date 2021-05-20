package io.github.kvolanski.ordemservico.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = false)
public class Tecnico extends Pessoa{

	@OneToMany(mappedBy = "tecnico")
	private List<OrdemServico> list = new ArrayList<>();
	
}
