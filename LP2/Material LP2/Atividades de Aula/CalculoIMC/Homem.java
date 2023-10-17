package modelo;

public class Homem extends PessoaIMC{
	
	public Homem(String nome, String dataNasc, double peso, double altura) {
		super(nome, dataNasc, peso, altura);
	}
	
	public Homem(Pessoa p, double peso, double altura) {
		super(p, peso, altura);
	}

	public String resultIMC() {
		double imc = super.calculaIMC(getPeso(),getAltura());
		
		if(imc < 20.7) {
			return("Abaixo do peso ideal.");
		}
		else if(imc <= 26.4) {
			return("Peso ideal.");
		}
		else {
			return("Acima do peso ideal.");
		}
	}
	
	public String toString() {
		return (super.toString()+
				"\n| IMC: "+resultIMC());
	}
}