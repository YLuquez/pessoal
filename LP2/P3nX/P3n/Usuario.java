
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Usuario extends Pessoa {
    private String endereco;
    private String codigoUsuario;
    private ArrayList<Emprest> hist;

    public Usuario(String genero, String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento, String cpf, float peso, float altura, String endereco, String codigoUsuario) {
        super(genero, nome, sobrenome, diaNascimento, mesNascimento, anoNascimento, cpf, peso, altura);
        this.endereco = endereco;
        this.codigoUsuario = codigoUsuario;
        this.hist = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void addLivroHist(GregorianCalendar dataLocacao, String codigoLivro) {
        Emprest emprestimo = new Emprest(dataLocacao, null, codigoLivro);
        hist.add(emprestimo);
    }

    public ArrayList<Emprest> getHist() {
        return hist;
    }

    public void setHist(ArrayList<Emprest> hist) {
        this.hist = hist;
    }

    public void removeLivroHist(String codigoLivro) {
        // Percorre o histórico de empréstimos e remove o livro com o código correspondente
        for (Emprest emprestPara : hist) {
            if (emprestPara.getCodigoLivro().equals(codigoLivro)) {
                hist.remove(emprestPara);
                break;
            }
        }
    }

    public String toString() {
        return super.toString() + 
               "Endereço: " + endereco + "\n" +
               "Código do Usuário: " + codigoUsuario + "\n" +
               "Histórico: " + hist.toString() + "\n";
    }

}
