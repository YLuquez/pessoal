package principal;

import java.util.Scanner;

public class CadastroClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cliente[] lista = new Cliente[50];
		boolean loop = true;
		int opcaoEscolhida;
		int i;
		String nomeBusca;

		// Loop
		while (loop) {
			System.out.println("\nEscolha uma das opcoes do Menu: ");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Buscar pelo nome do cliente cadastrado");
			System.out.println("3 - Exibir dados dos clientes");
			System.out.print("4 -  Sair\n ");
			opcaoEscolhida = sc.nextInt();
			sc.nextLine();

			if ((opcaoEscolhida == 2 || opcaoEscolhida == 3) && (Cliente.getContador() == 0)) {
				System.out.println("\nNão há clientes cadastrados. É necessário cadastrar um cliente antes!");
			} else {
				switch (opcaoEscolhida) {
				case (1): {
					if (Cliente.getContador() < 50) {
						i = Cliente.getContador();
						lista[i] = new Cliente();
						System.out.println("\n--- Cadastro de novo cliente ---");
						System.out.println("Código do Cliente: ");
						lista[i].setCodigo(sc.nextInt());
						System.out.println("Nome: ");
						lista[i].setNome(sc.next());
						System.out.println("CPF: ");
						lista[i].setCpf(sc.nextLong());
						System.out.println("Telefone: ");
						lista[i].setTelefone(sc.nextLong());
						sc.nextLine();
					} else {
						System.out.println("\nVocê atingiu o número máximo de cadastros (50).\n");
					}
					break;
				}
				case (2): {
					System.out.println("\nDigite o nome do cliente que deseja buscar: ");
					nomeBusca = sc.next();

					for (i = 0; i < Cliente.getContador(); i++) {
						if (lista[i].buscaNome(nomeBusca)) {
							System.out.println("\nCliente Encontrado!");
							System.out.println(lista[i]);
							break;
						} else {
							System.out.println("\nCliente não encontrado!");
						}

					}
					break;
				}
				case (3): {
					for (i = 0; i < Cliente.getContador(); i++) {
						System.out.println("------------------------");
						System.out.println((i + 1) + "º cliente:");
						System.out.println(lista[i]);
					}
					break;
				}
				case (4): {
					System.out.println("\nSessão finalizada.");
					loop = false;
					break;
				}
				case (5): {
					System.out.println(Cliente.getContador());
					break;
				}
				default: {
					System.out.println("Esta opção não existe. Escolha uma opção válida.\n");
					break;
				}
				}
			}
		}
	}
}
