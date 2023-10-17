package modelo;

public class Caminhao extends Veiculo {
	private Motor motor;
	private double toneladasMax;
	private double alturaMax;
	private double comprimento;
	
	//Construtor
	public Caminhao(double peso, double velocMax, double preco, double toneladasMax, double alturaMax, double comprimento, int numCilindro, int potencia) {
		super(peso, velocMax, preco);
		motor = new Motor(numCilindro, potencia);
		this.toneladasMax = toneladasMax;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
		
	//Outra possibilidade de construtor
	public Caminhao(Veiculo v, double toneladasMax, double alturaMax, double comprimento, int numCilindro, int potencia) {
		super(v.getPeso(),v.getVelocMax(),v.getPreco());
		motor = new Motor(numCilindro, potencia);
		this.toneladasMax = toneladasMax;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
	
	//Construtor vazio
	public Caminhao() {
		
	}
		
	//Getters e setters
	public double getToneladasMax() {
		return toneladasMax;
	}
	public void setToneladasMax(double toneladasMax) {
		this.toneladasMax = toneladasMax;
	}
	public double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	//Exibicao das informacoes do Caminhao
	public String toString() {
		return(super.toString()+
				"\nCarga máxima do caminhão: "+toneladasMax+
				"\nAltura máxima do caminhão: "+alturaMax+
				"\nComprimento do caminhão: "+comprimento+
				"\n\n--> Informações sobre o motor do caminhão"+motor);
	}
}
