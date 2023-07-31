
public class Homem extends PessoaIMC {
    public Homem(String genero, String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento, String cpf, float peso, float altura) {
        super(genero, nome, sobrenome, diaNascimento, mesNascimento, anoNascimento, cpf, peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC();
        if (imc < 20.7) {
            return "Abaixo do peso ideal";
        } else if (imc < 26.4) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n  Resultado do IMC: " + resultIMC();
    }
}
