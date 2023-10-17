package modelo;

public class Pessoa {
	private String nome;
	private String cpf;
	private Data dtNasc;
	public Pessoa(String nome, String cpf, Data dtNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}
	public Pessoa() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Data getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Data dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String toString() {
		return ("\nNome: "+nome+
				"\nCPF: "+cpf+
				"\nData de nascimento: "+dtNasc);
	}
}
