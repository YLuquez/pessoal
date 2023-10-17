package modelo;

public class Pessoa {
	private String nome;
	private String dataNasc;
	
	public Pessoa(String nome, String dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String toString() {
		return("| Nome: "+nome+
				"\n| Data de nascimento: "+dataNasc);
	}
}
