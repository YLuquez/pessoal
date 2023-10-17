package principal;
import modelo.Data;
import modelo.Pessoa;
import modelo.Funcionario;
import modelo.ChefeDeDepartamento;

public class DemoPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Ana","12312312345",new Data(05,04,1990));
		Funcionario f1,f2;
		f1 = new Funcionario("Maria","23423423456",new Data(06,02,1993),new Data(01,02,2022),4000d);
		f2 = new Funcionario(p1,new Data(02,03,2020),5000d);
		ChefeDeDepartamento c1 = new ChefeDeDepartamento("Valéria","15615615678",new Data(04,04,1980),new Data(01,04,2010),15000d,"RH",new Data(04,03,2018));
		
		//Exibicao
		System.out.println("Pessoa 1:\n"+p1+"\n");
		System.out.println("Funcionário 1:\n"+f1+"\n");
		System.out.println("Funcionário 2:\n"+f2+"\n");
		System.out.println("Chefe de Departamento 1:\n"+c1+"\n");
	}
}
