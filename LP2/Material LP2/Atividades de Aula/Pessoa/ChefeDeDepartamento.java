package modelo;

public class ChefeDeDepartamento extends Funcionario {
	private String nomeDpt;
	private Data dataProm;
	public ChefeDeDepartamento(String nome, String cpf, Data dtNasc, Data dtAdm, double salario, String nomeDpt,
			Data dataProm) {
		super(nome, cpf, dtNasc, dtAdm, salario);
		this.nomeDpt = nomeDpt;
		this.dataProm = dataProm;
	}
	public ChefeDeDepartamento() {
		
	}
	public String getNomeDpt() {
		return nomeDpt;
	}
	public void setNomeDpt(String nomeDpt) {
		this.nomeDpt = nomeDpt;
	}
	public Data getDataProm() {
		return dataProm;
	}
	public void setDataProm(Data dataProm) {
		this.dataProm = dataProm;
	}
	public String toString() {
		return(super.toString()+
				"\nNome do departamento que chefia: "+nomeDpt+
				"\nData da promoção: "+dataProm);
	}
}
