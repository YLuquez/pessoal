package modelo;

public class CarroPasseio extends Veiculo {
	private Motor motor;
	private String cor;
	private String modelo;
	
	//Construtor
	public CarroPasseio(double peso, double velocMax, double preco, String cor, String modelo,int numCilindro, int potencia) {
		super(peso, velocMax, preco);
		motor = new Motor(numCilindro, potencia);
		this.cor = cor;
		this.modelo = modelo;
	}
	
	//Outra possibilidade de construtor
	public CarroPasseio(Veiculo v, String cor, String modelo, int numCilindro, int potencia) {
		super(v.getPeso(),v.getVelocMax(),v.getPreco());
		motor = new Motor(numCilindro, potencia);
		this.cor = cor;
		this.modelo = modelo;
	}
	
	//Construtor vazio
	public CarroPasseio() {

	}
	
	//Getters e setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Exibicao das informacoes do Carro de Passeio
	public String toString() {
		return(super.toString()+
				"\nCor do carro: "+cor+
				"\nModelo do carro: "+modelo+
				"\n\n--> Informações sobre o motor do carro"+motor);
	}
}
