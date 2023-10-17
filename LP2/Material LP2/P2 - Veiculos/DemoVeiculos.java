package principal;
import java.util.Scanner;

import modelo.Veiculo;
import modelo.CarroPasseio;
import modelo.Caminhao;

public class DemoVeiculos {
	
	//Cadastro de veiculos
	public static Veiculo cadastrarVeiculo(Scanner sc) {

		Veiculo v = new Veiculo();
		System.out.print("Digite o peso do veículo: ");
		v.setPeso(sc.nextDouble());

		System.out.println("Digite a velocidade máxima: ");
		v.setVelocMax(sc.nextDouble());
		
		System.out.println("Digite o preço: ");
		v.setPreco(sc.nextDouble());
		
		return v;
	}
	
	//O usuario escolhe quantos veiculos deseja cadastrar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nQuantos veículos deseja cadastrar?");
		int num = sc.nextInt();
		sc.nextLine();
		
		Veiculo[] veiculos = new Veiculo[num];
		
		int i=0;
		

		while(i<num){
			System.out.println("\nO "+(i+1)+"º veículo cadastrado será um carro de passeio ou um caminhão? \n Para carro, digite 1. Para caminhao, digite 0: ");
			int escolha = sc.nextInt();
			sc.nextLine();
			
			if(escolha==1) {
				//Cadastro de carros
				System.out.println("-------- Iniciando cadastro de carro --------");
				Veiculo v = cadastrarVeiculo(sc);
				
				System.out.print("\nDigite a cor do carro: ");
				String cor = sc.nextLine();
				sc.nextLine();
				
				System.out.print("\nDigite o modelo: ");
				String modelo = sc.nextLine();
				sc.nextLine();
				
				System.out.print("\nDigite o número do cilindro do motor: ");
				int numCilindro = sc.nextInt();
				
				System.out.print("\nDigite a potência do motor: ");
				int potencia = sc.nextInt();
				
				veiculos[i] = new CarroPasseio(v,cor,modelo,numCilindro,potencia);
				i++;
				
			}else if(escolha==0) {
				//Cadastro de caminhao
				System.out.println("------- Iniciando cadastro de caminhão -------");
				Veiculo v = cadastrarVeiculo(sc);
				
				System.out.print("\nDigite a carga máxima do caminhão: ");
				double toneladasMax = sc.nextDouble();
				
				System.out.print("\nDigite a altura máxima: ");
				double alturaMax = sc.nextDouble();
				
				System.out.print("\nDigite o comprimento: ");
				double comprimento = sc.nextDouble();
				
				System.out.print("\nDigite o número do cilindro do motor: ");
				int numCilindro = sc.nextInt();
				
				System.out.print("\nDigite a potência do motor: ");
				int potencia = sc.nextInt();
				
				veiculos[i] = new Caminhao(v,toneladasMax,alturaMax,comprimento,numCilindro,potencia);
				i++;
				
			}else {
				System.out.println("Erro: Opção inválida! Escolha 0 ou 1 para realizar o cadastro.");
			}
		}
		//Fim do cadastro
		System.out.println("\nFinalizando cadastro...\n\n");
		
		//Exibicao dos veiculos cadastrados
		System.out.println("-------------- Exibindo veículos cadastrados --------------");
		for (int j = 0; j < num; j++) {
			System.out.println(veiculos[j]);
			System.out.println("----------------------------------------------------------");
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("\n Finalizando programa...");
	}
}
