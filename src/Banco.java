import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void listarClientes() {
		System.out.println("==========================");
		System.out.println("Clientes " + this.nome);
		System.out.println("==========================");
		this.contas.forEach(conta -> System.out.println(conta.getCliente().getNome()));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}	
}
