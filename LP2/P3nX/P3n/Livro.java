
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Livro {
    private String codigoLivro;
    private String tituloLivro;
    private String categoria;
    private int quantidade;
    private int emprestados;
    private ArrayList<EmprestPara> hist;
    private GregorianCalendar dataPrevistaDevolucao;

    public Livro(String codigoLivro, String tituloLivro, String categoria, int quantidade, int emprestados) {
        this.codigoLivro = codigoLivro;
        this.tituloLivro = tituloLivro;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.emprestados = emprestados;
        this.hist = new ArrayList<>();
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEmprestados() {
        return emprestados;
    }

    public void setEmprestados(int emprestados) {
        this.emprestados = emprestados;
    }

    public ArrayList<EmprestPara> getHist() {
        return hist;
    }

    public void setHist(ArrayList<EmprestPara> hist) {
        this.hist = hist;
    }

    public void empresta() throws CopiaNaoDisponivelEx {
        if (emprestados == quantidade) {
            throw new CopiaNaoDisponivelEx("Todas as cópias do livro estão emprestadas.");
        }
        emprestados++;
    }

    public void devolve() throws NenhumaCopiaEmprestadaEx {
        if (emprestados == 0) {
            throw new NenhumaCopiaEmprestadaEx("Nenhuma cópia do livro foi emprestada.");
        }
        emprestados--;
        
    }

    public void addUsuarioHist(GregorianCalendar dataLocacao, GregorianCalendar dataDevolucao, int codigoUsuario) {
        EmprestPara emprestimo = new EmprestPara(dataLocacao, dataDevolucao, codigoUsuario);
        hist.add(emprestimo);
    }

    public GregorianCalendar getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public String toString() {
        return "Código do Livro: " + codigoLivro + "\n" +
               "Título do Livro: " + tituloLivro + "\n" +
               "Categoria: " + categoria + "\n" +
               "Quantidade: " + quantidade + "\n" +
               "Emprestados: " + emprestados + "\n" +
               "Histórico: " + hist.toString() + "\n";
    }

}
