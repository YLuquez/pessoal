package principal;

import java.util.Scanner;

import modelo.Pessoa;
import modelo.Homem;
import modelo.Mulher;

public class Principal {
	
	public static Pessoa cadastrarPessoa(Scanner sc) {
		Pessoa p = new Pessoa();
		System.out.print("Digite o nome: ");
		p.setNome(sc.nextLine());
		sc.nextLine();

		System.out.println("Digite a data de nascimento (formato dd/mm/aaaa): ");
		p.setDataNasc(sc.nextLine());
		sc.nextLine();
		
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nQuantas pessoas deseja cadastrar?");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		int i=0;
		

		while(i<n){
			System.out.println("\nA "+(i+1)+"a pessoa cadastrada será uma mulher ou um homem? \n Para mulher, digite 1. Para homem, digite 0: ");
			int escolha = sc.nextInt();
			sc.nextLine();
			
			if(escolha==1) {
				System.out.println("Ok, iniciando cadastro de mulher...");
				Pessoa p = cadastrarPessoa(sc);
				
				System.out.print("\nDigite o peso (kg): ");
				double peso = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("\nDigite a altura (m): ");
				double altura = sc.nextDouble();
				sc.nextLine();
				
				pessoas[i] = new Mulher(p,peso,altura);
				i++;
				
			}else if(escolha==0) {
				System.out.println("Ok, iniciando cadastro de homem...");
				Pessoa p = cadastrarPessoa(sc);
				
				System.out.print("\nDigite o peso (kg): ");
				double peso = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("\nDigite a altura (m): ");
				double altura = sc.nextDouble();
				sc.nextLine();
				
				pessoas[i] = new Homem(p,peso,altura);
				i++;
				
			}else {
				System.out.println("Erro: opção inválida! Escolha uma opção válida para fazer o cadastro.");
			}
		}
		System.out.println("Finalizando cadastro...");

		System.out.println(" ____________________________________________________");
		System.out.println("|___________ Exibindo pessoas cadastradas ___________|");
		for (int j = 0; j < n; j++) {
			System.out.println(pessoas[j]);
			System.out.println("|----------------------------------------------------|");
		}
		System.out.println("|_________________________*__________________________|");
		System.out.println("\n Finalizando programa...");
	}

}
