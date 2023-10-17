package modelo;

public class Motor {
	private int numCilindro;
	private int potencia;
	
	//Construtor
	public Motor(int numCilindro, int potencia) {
		this.numCilindro = numCilindro;
		this.potencia = potencia;
	}
	
	//Construtor vazio
	public Motor() {
		
	}
	
	//Getters e setters
	public int getNumCilindro() {
		return numCilindro;
	}

	public void setNumCilindro(int numCilindro) {
		this.numCilindro = numCilindro;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	//Exibicao das informacoes do Motor
	public String toString() {
		return("\nNúmero do cilindro: "+numCilindro
				+"\nPotência: "+potencia);
	}
}
