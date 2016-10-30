
public class TesteConta {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("João da Silva", "055.677.111-17");
		Cliente cliente2 = new Cliente("Maria Antônia", "736.223.157-12");
		
		// Conta Corrente ------------------------------ :
		
		ContaCorrente contaCorrente = new ContaCorrente(150.0, "411013", cliente);
		
		System.out.println("Conta: " + contaCorrente.getNumero());
		System.out.println("Saldo: " + contaCorrente.getSaldo());
		System.out.println("Cliente: " + contaCorrente.getCliente().getNome());
		System.out.println(" ----- ");
		
		contaCorrente.debitar(20.0);
		contaCorrente.debitar(205.0);
		contaCorrente.creditar(10.0);
		
		System.out.println("Conta: " + contaCorrente.getNumero());
		System.out.println("Saldo: " + contaCorrente.getSaldo());
		System.out.println("Cliente: " + contaCorrente.getCliente().getNome());
		System.out.println(" ----- ");
		
		// Conta Poupanca ------------------------------ :
		
		Poupanca poupanca = new Poupanca(500.0, "947823", cliente2);
		System.out.println("Conta: " + poupanca.getNumero());
		System.out.println("Saldo: " + poupanca.getSaldo());
		System.out.println("Cliente: " + poupanca.getCliente().getNome());
		System.out.println(" ----- ");
		
		poupanca.debitar(50.0);
		poupanca.creditar(15.0);
		poupanca.renderJuros(0.02);
		
		System.out.println("Conta: " + poupanca.getNumero());
		System.out.println("Saldo: " + poupanca.getSaldo());
		System.out.println("Cliente: " + poupanca.getCliente().getNome());
		System.out.println(" ----- ");
	}
}
