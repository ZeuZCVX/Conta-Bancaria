
public class ContaInvestimento extends ContaCorrente {
	protected double deposito;
	protected double bonus;
	protected double dobrovalor;
	protected double saqueespecial;
	 
	
	public ContaInvestimento(String nome, String cpf, String agencia, String conta, double saldobancario,double deposito, double saqueespecial) {
		super(nome, cpf, agencia, conta, saldobancario );
		this.deposito = deposito;
	}
	public void valor(double dp, double bo)
	{
		this.bonus = (dp + bo);
	}
	public void valor2(double dobro, double especial) {
		this.dobrovalor = (dobro * especial);
		
	}
	

}
