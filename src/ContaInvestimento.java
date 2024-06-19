
public class ContaInvestimento extends Conta{
	
	public ContaInvestimento(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void investir(double valor, IConta contaInvestimento) {
		System.out.println("Parabéns! Voce investiu " + valor + "!!!");
		
	}

}
