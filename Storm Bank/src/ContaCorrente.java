
public class ContaCorrente {
	protected String nome;
	protected String cpf;
	protected String agencia;
	protected String conta;
	protected double saldobancario;
	
	public ContaCorrente(String nome, String cpf, String agencia, String conta, double saldobancario) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		this.saldobancario = saldobancario;
	}
	public String imprimirBanco()
	{
		return "Nome da conta: "+nome+"\n"+
				"CPF: "+cpf+"\n"+
				"Agencia: "+agencia+"\n"+
				"Numero da Conta: "+conta+"\n"+
				"Saldo na Conta: "+saldobancario;
}
}