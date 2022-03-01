
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo = 0;
	protected Cliente cliente;
	
	
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		if(validarSaldo(valor)) {
			this.saldo -= valor;
		} else {
			System.err.println("Salso insuficiente!");
		}
		
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(validarSaldo(valor)) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}
	
	protected void imprimirInfos() {
		System.out.println("Titular: " + cliente.getNome());
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.format("Saldo: %.2f\n", saldo);
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private boolean validarSaldo(double valor) {
		return valor <= this.saldo;
	}
	

}
