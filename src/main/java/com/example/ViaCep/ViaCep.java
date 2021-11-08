package com.example.ViaCep;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ViaCep {
	
		@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	
	protected ViaCep() {}
	
	public ViaCep(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		return String.format("CEP[id=%d, cep='%s', logradouro='%s', complemento='%s', bairro='%s', localidade='%s', uf='%s', ibge='%s', gia='%s', ddd='%s', siafi='%s']", id, cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi);
	}

	public Long getId() {
		return id;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getUf() {
		return uf;
	}

	public String getIbge() {
		return ibge;
	}

	public String getGia() {
		return gia;
	}

	public String getDdd() {
		return ddd;
	}

	public String getSiafi() {
		return siafi;
	}
		
}
