package br.com.lojaAbc.modelo;

public class PessoaFisica extends Cliente{
       private String cpf;
       private String rg;
       
       
       
	public void setAll(String nome, String email, String fone, String cpf, String rg) {
		super.setAll(nome, email, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	


	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", toString()=" + super.toString() + "]";
		
	}
  //qualquer coisa chamar o super. com o getAtributo.




	public PessoaFisica() {
		super();
	}





	public PessoaFisica(String nome, String email, String fone, String cpf, String rg) {
		super(nome, email, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
       
       
       
       
       
       
}
