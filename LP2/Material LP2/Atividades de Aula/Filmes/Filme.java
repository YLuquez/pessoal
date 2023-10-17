package modelo;

public class Filme {
	private String titulo;
	private String descricao;
	private Diretor diretor;
	private int duracaoMin;
	private static int contador = 0;
	
	public Filme(String titulo, String descricao, Diretor diretor, int duracaoMin) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.diretor = diretor;
		this.duracaoMin = duracaoMin;
	}
	
	// Contador
	public static int getContador() {
		return contador;
	}
	
	public Filme(){
		contador+=1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public int getDuracaoMin() {
		return duracaoMin;
	}

	public void setDuracaoMin(int duracaoMin) {
		this.duracaoMin = duracaoMin;
	}
	
	public String toString() {
		return("\nTítulo do filme: "+titulo+
				"\nDescrição: "+descricao+
				"\nDiretor: "+diretor+
				"\nDuração: "+duracaoMin+" min.");
	}
	
	public String exibirDuracaoEmHoras(int duracaoMin) {
		int duracaoHoras = duracaoMin/60;
		int restoMinutos = duracaoMin%60;
		return ("O filme "+titulo+" possui "+duracaoHoras+" horas e "+restoMinutos+" minutos de duração.");
	}
	
	// Comparação de títulos
	public boolean comparaTitulo(String titulo) {
		if (this.titulo.equalsIgnoreCase(titulo)) {
			return true;
		} else {
			return false;
		}
	}
}
