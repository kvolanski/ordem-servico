package io.github.kvolanski.ordemservico.domain.enuns;

public enum Status {

	ABERTO(0 , "ABERTO"),
	ANDAMENTO (1, "ANDAMENTO"),
	ENCERRADO (2 , "ENCERRADO");
	
	private Integer cod;
	private String descricao;
	
	private Status(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Status status : Status.values()) {
			if(cod.equals(status.getCod())) {
				return status;
			}
		}
		
		throw new IllegalArgumentException("Status inválido!" + cod);
	}
	
}
