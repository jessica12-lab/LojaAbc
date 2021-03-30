package br.com.lojaAbc.modelo;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String cnae;
	
	
	public void setAll(String nome, String email, String fone, String cnpj, String cnae) {
		super.setAll(nome, email, fone);
		this.cnpj = cnpj;
		this.cnae = cnae;
	}
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", cnae=" + cnae + ", toString()=" + super.toString() + "]";
	}
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, String email, String fone, String cnpj, String cnae) {
		super(nome, email, fone);
		this.cnpj = cnpj;
		this.cnae = cnae;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	
	
}
