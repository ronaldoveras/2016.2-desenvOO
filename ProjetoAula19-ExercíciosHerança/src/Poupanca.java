
public class Poupanca extends ContaCorrente {

	public Poupanca(double saldo, String numero, Cliente cliente) {
		super(saldo, numero, cliente);
	}

	public void renderJuros(double taxa) {
		creditar(getSaldo() * taxa);
	}
}
