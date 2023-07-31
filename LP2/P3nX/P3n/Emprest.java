
import java.util.GregorianCalendar;

public class Emprest {
    private GregorianCalendar dataEmprestimo;
    private GregorianCalendar dataDevolucao;
    private String codigoLivro;

    public Emprest(GregorianCalendar dataEmprestimo, GregorianCalendar dataDevolucao, String codigoLivro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.codigoLivro = codigoLivro;
    }

    public GregorianCalendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(GregorianCalendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public GregorianCalendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(GregorianCalendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
}
