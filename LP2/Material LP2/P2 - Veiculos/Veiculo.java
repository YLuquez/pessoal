package modelo;

public class Veiculo {
	private double peso;
	private double velocMax;
	private double preco;
	
	//Construtor
	public Veiculo(double peso, double velocMax, double preco) {
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
	}
	
	//Construtor vazio
	public Veiculo() {
		
	}
	
	//Getters e setters
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(double velocMax) {
		this.velocMax = velocMax;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//Exibicao das informacoes do Veiculo
	public String toString() {
		return("\n--> Informações sobre o veículo\n"+
				"\nPeso: "+peso+
				"\nVelocidade máxima: "+velocMax+
				"\nPreço: R$ "+preco);
	}
}
