package P1nX;

public class Homem extends Pessoa {
    public Homem(String genero,String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento, String cpf, float peso, float altura) {
        super(genero, nome, sobrenome, diaNascimento, mesNascimento, anoNascimento, cpf, peso, altura);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}