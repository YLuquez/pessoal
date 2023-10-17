package modelo;

public class Mulher extends PessoaIMC{
	
	public Mulher(String nome, String dataNasc, double peso, double altura) {
		super(nome, dataNasc, peso, altura);
	}
	
	public Mulher(Pessoa p, double peso, double altura) {
		super(p, peso, altura);
	}

	public String resultIMC() {
		double imc = super.calculaIMC(getPeso(),getAltura());
		
		if(imc < 19) {
			return("Abaixo do peso ideal.");
		}
		else if(imc <= 25.8) {
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