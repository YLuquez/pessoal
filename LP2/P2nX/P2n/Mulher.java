
public class Mulher extends PessoaIMC {
    public Mulher(String genero, String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento, String cpf, float peso, float altura) {
        super(genero, nome, sobrenome, diaNascimento, mesNascimento, anoNascimento, cpf, peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC();
        if (imc < 19) {
            return "Abaixo do peso ideal";
        } else if (imc < 25.8) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nResultado do IMC: " + resultIMC();
    }
}
