package principal;

public class Cliente {

	private static int contador = 0;
	private int codigo;
	private String nome;
	private long cpf;
	private long telefone;

	// Contador
	public static int getContador() {
		return contador;
	}

	// Cliente
	public Cliente() {
		contador += 1;
	}

	// Código
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// CPF
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	// Telefone
	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	// Impressão
	public String toString() {
		return ("------------------------" + "\nCódigo do cliente: " + this.getCodigo() + "\nNome: " + this.getNome()
				+ "\nCPF: " + this.getCpf() + "\nTelefone: " + this.getTelefone() + '\n');
	}

	// Verificação de nome
	public boolean buscaNome(String buscaNome) {
		if (this.nome.equalsIgnoreCase(buscaNome)) {
			return true;
		} else {
			return false;
		}
	}

}