package modelo;

public abstract class PessoaIMC extends Pessoa {
	private double peso;
	private double altura;
	
	public PessoaIMC(String nome, String dataNasc, double peso, double altura) {
		super(nome, dataNasc);
		this.peso = peso;
		this.altura = altura;
	}
	
	public PessoaIMC(Pessoa p, double peso, double altura) {
		super(p.getNome(),p.getDataNasc());
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaIMC(double peso,double altura) {
		double imc = peso/(altura*altura);
		return (imc);
	}
	
	public abstract String resultIMC();
	
	public String toString() {
		return(super.toString()+
				"\n| Peso: "+peso+
				"\n| Altura: "+altura);
	}
}