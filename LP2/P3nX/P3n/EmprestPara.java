
import java.util.GregorianCalendar;

public class EmprestPara {
    private GregorianCalendar dataEmprestimo;
    private GregorianCalendar dataDevolucao;
    private int codigoUsuario;

    public EmprestPara(GregorianCalendar dataEmprestimo, GregorianCalendar dataDevolucao, int codigoUsuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.codigoUsuario = codigoUsuario;
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

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
}
