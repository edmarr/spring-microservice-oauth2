package br.com.tcc.ocorrencia.enumerator;

public enum TipoOcorrencia{
	ENTREGUE(1 ,"Entregue"),EXTRAVIADO(2 ,"Extraviado"),DANIFICADO(3 ,"Danificado"),DEVOLVIDO(4 ,"Devolvido");
	
	private Integer id;
	private String descricao;
	
	private TipoOcorrencia(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoOcorrencia valueById(Integer id) {
		TipoOcorrencia tipo = null;
		for(TipoOcorrencia t : values()) {
			if(t.getId().equals(id)) {
				tipo = t;
				break;
			}
		}
		return tipo;
	}
	
	
	
}
