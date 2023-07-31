
public abstract class PessoaIMC extends Pessoa {
    private float peso;
    private float altura;

    public PessoaIMC(String genero, String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento, String cpf, float peso, float altura) {
        super(genero, nome, sobrenome, diaNascimento, mesNascimento, anoNascimento, cpf);
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float calculaIMC() {
        float alturaEmMetros = altura / 100; // Converter altura de centímetros para metros
        return peso / (alturaEmMetros * alturaEmMetros);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return super.toString() +
                "  Peso: " + peso + " kg\n" +
                "  Altura: " + altura + " cm";
    }
}
