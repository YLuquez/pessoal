package modelo;

public class Diretor {
	private String nome;
	private int tempoExp;
	private int origem;
	
	public Diretor(String nome, int tempoExp, int origem) {
		super();
		this.nome = nome;
		this.tempoExp = tempoExp;
		this.origem = origem;
	}
	
	public Diretor() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoExp() {
		return tempoExp;
	}

	public void setTempoExp(int tempoExp) {
		this.tempoExp = tempoExp;
	}

	public int getOrigem() {
		return origem;
	}

	public void setOrigem(int origem) {
		this.origem = origem;
	}
	
	public String toString() {
		return("\nNome do Diretor: "+nome+
				"\nTempo de experiência: "+tempoExp+" anos"+
				"\nLocal de origem: "+origem);
	}
}
