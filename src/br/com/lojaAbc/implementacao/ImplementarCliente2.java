package br.com.lojaAbc.implementacao;

import br.com.lojaAbc.lib.Lib;
import br.com.lojaAbc.modelo.Cliente;
import br.com.lojaAbc.modelo.PessoaFisica;
import br.com.lojaAbc.modelo.PessoaJuridica;

public class ImplementarCliente2 {
	public static void main(String[] args) {
	Cliente cliente = new Cliente();
	char resposta = Lib.s("Digite F ou J").charAt(0);
	if (resposta=='F') {
		cliente = new PessoaFisica(
				"Nome da PF", 
				"email da PF", 
				"12345678",
				"123456",
				"123456x"
				);
	}else if (resposta=='J') {
		cliente = new PessoaJuridica(
				"Nome da PJ", 
				"email da PJ", 
				"12345678",
				"1234560001",
				"cnae"
				);
	}else {
		System.out.println("Opção inválida");
	}
	
	System.out.println(cliente.toString());
}

}
