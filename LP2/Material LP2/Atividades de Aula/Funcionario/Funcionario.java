package principal;

public class Funcionario {

	public String nome;
	public double salario;
	public String cpf;
	public int anoContratacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void aumentarSalario(double percentual) {
		this.salario += (this.salario*percentual);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAnoContratacao() {
		return anoContratacao;
	}
	public void setAnoContratacao(int anoContratacao) {
		this.anoContratacao = anoContratacao;
	}
	public void imprimirDados() {
		System.out.println("------------------------");
		System.out.println("Nome: "+nome);
		System.out.println("Salário atual: R$ "+salario);
		System.out.println("CPF: "+cpf);
		System.out.println("Ano de contratação: "+anoContratacao);
		}
}