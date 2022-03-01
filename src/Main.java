
public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setNome("Caixa");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Ana Maria");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Jacob");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente2);
		
		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		banco.listarClientes();

	}

}
