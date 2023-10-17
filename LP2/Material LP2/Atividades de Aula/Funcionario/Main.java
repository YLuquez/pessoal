package principal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
			
		// Funcionario f1
		System.out.println("Digite o seu nome: ");
		f1.setNome(sc.nextLine());
		
		System.out.println("Digite o seu salário: ");
		f1.setSalario(sc.nextDouble());
		
		System.out.println("Digite o seu CPF: ");
		f1.setCpf(sc.next());
		
		System.out.println("Digite o ano da contratação: ");
		f1.setAnoContratacao(sc.nextInt());
		
		System.out.println("Informe o percentual de aumento salarial: ");
		double percentual1 = sc.nextDouble();
		f1.aumentarSalario(percentual1);
		System.out.println("Salário atualizado: "+f1.getSalario());
		System.out.println("\nPróximo funcionário...");
		sc.nextLine();
		
		// Funcionario f2
		System.out.println("Digite o seu nome: ");
		f2.setNome(sc.next());
		
		System.out.println("Digite o seu salário: ");
		f2.setSalario(sc.nextDouble());
		
		System.out.println("Digite o seu CPF: ");
		f2.setCpf(sc.next());
		
		System.out.println("Digite o ano da contratação: ");
		f2.setAnoContratacao(sc.nextInt());
		
		System.out.println("Informe o percentual de aumento salarial: ");
		double percentual2 = sc.nextDouble();
		f2.aumentarSalario(percentual2);
		System.out.println("Salário atualizado: "+f2.getSalario());
		
		// Impressao dos dados
		System.out.println("\n------------------------");
		System.out.println(" Dados dos funcionários");
		f1.imprimirDados();
		f2.imprimirDados();
		System.out.println("------------------------");
		}
}