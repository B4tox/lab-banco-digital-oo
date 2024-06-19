
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("MarcosMelo");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		Conta investimento = new ContaInvestimento(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		investimento.investir(1000, investimento);
		
		
	}

}
