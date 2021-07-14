
public class main {

	public static void main(String[] args) {
		ContaCorrente ContaCorrente = new ContaCorrente("Josue Cardoso","978.337.423-98", "0005","55938954-9", 12380.97);
		System.out.println(ContaCorrente.imprimirBanco());
		
		
		ContaCorrente ContaCorrente2 = new ContaCorrente("Willian Santos","648.877.983-57", "0002","75839476-1", 2590.97);
		System.out.println(ContaCorrente2.imprimirBanco());
		
		ContaInvestimento ContaInvestimento = new ContaInvestimento("Josue Cardoso","978.337.423-98", "0005","55938954-9", 12380.97, 250.0, 2000);
		System.out.println(ContaInvestimento.imprimirBanco());
		ContaInvestimento.valor(250, 2.5);
		System.out.println("Acrecimo no Deposito Mensal: "+ContaInvestimento.bonus);
		ContaInvestimento.valor2(2, 500);
		System.out.println("Saque especial de: "+ContaInvestimento.dobrovalor);
		
		
		ContaInvestimento ContaInvestimento2 = new ContaInvestimento("Willian Santos","648.877.983-57", "0002","75839476-1", 2590.97, 600, 5000);
		System.out.println(ContaInvestimento2.imprimirBanco());
		ContaInvestimento.valor(1000, 10);
		System.out.println("Acrecimo no Deposito Mensal: "+ContaInvestimento.bonus);
		ContaInvestimento.valor2(2, 5000);
		System.out.println("Saque especial de: "+ContaInvestimento.dobrovalor);
		
		
		
		

	}

}
