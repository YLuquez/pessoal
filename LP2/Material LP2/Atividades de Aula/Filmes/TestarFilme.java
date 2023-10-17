package principal;

import java.util.Scanner;
import modelo.Filme;
import modelo.Diretor;

public class TestarFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\nQuantos filmes devem ser cadastrados?");
		int n = sc.nextInt();
		Filme filmes[] = new Filme[n];
		int cont = 0;
		int cont2 = 0;
		int resp;
		
		//Cadastro dos filmes
		System.out.println("----Cadastro de Filmes----\n");
		do {
			filmes[cont] = new Filme();//IMPORTANTE PARA NAO GERAR VETOR NULO
			sc.nextLine(); 
			System.out.println("\nDigite o título do filme: ");
			filmes[cont].setTitulo(sc.nextLine());
			sc.nextLine();
			System.out.println("\nDescrição: ");
			filmes[cont].setDescricao(sc.nextLine());
			sc.nextLine();
			System.out.println("\nDiretor: ");
			filmes[cont].setDiretor(sc.nextLine());
			sc.nextLine();
			System.out.println("\nDuração do filme em minutos: ");
			filmes[cont].setDuracaoMin(sc.nextInt());
			sc.nextLine();
			System.out.println("\nDeseja fazer um novo cadastro? (1-Sim 2-Não)");
			resp = sc.nextInt();
			cont++;
		}while(resp == 1 && cont<n);
		
		
		//Busca do título
		System.out.println("\nDigite o titulo do filme que deseja buscar: ");
		String titulo = sc.nextLine();
		
		int j;
		for (j = 0; j < Filme.getContador(); j++) {
			if (filmes[j].comparaTitulo(titulo)) {
				System.out.println("\nFilme Encontrado!");
				System.out.println(filmes[j]);
				break;
			} else {
				System.out.println("\nFilme não encontrado!");
			}
		}
		
		//Impressao dos dados dos filmes e quantidade de horas
		int i;
		int menor = 999999; 
		System.out.println("\nFilmes cadastrados");
		for(i=0; i < cont2; i++) {
			System.out.println(filmes[i]);
			System.out.println("\nTítulo: "+filmes[i].getTitulo()+ " - Duração: "+filmes[i].exibirDuracaoEmHoras(filmes[i].getDuracaoMin())+"h");
		}
	}
}
