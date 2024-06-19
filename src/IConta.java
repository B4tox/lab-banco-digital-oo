
public interface IConta {
	
	void sacar(double valor);
	void depositar(double valor);
	void investir(double valor, IConta contaInvestimento);
	void transferir(double valor, IConta contaDestino);
	void imprimirExtrato();
}
