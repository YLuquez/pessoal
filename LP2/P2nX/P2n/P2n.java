
import java.util.Scanner;

public class P2n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valida = ValidaPessoa.validaCampos(args); // Verifica se os dados passados por argumentos
        if (valida) { // Cria o primeiro usuário e mostra ele caso valide os dados
            String genero = args[0];
            String nome = args[1];
            String sobrenome = args[2];
            int dia = Integer.parseInt(args[3]);
            int mes = Integer.parseInt(args[4]);
            int ano = Integer.parseInt(args[5]);
            String cpf = args[6];
            float peso = Float.parseFloat(args[7]);
            float altura = Float.parseFloat(args[8]);

            Pessoa primeiro = new Pessoa(genero, nome, sobrenome, dia, mes, ano, cpf);
            System.out.println(primeiro.toString());
        }

        System.out.println("------ Cadastro de Usuários ------\n");

        int numCadastro = 0;
        while (numCadastro <= 0) { // Solicitação de quantidade de usuários
            System.out.print("Digite a quantidade de usuários a serem cadastrados: ");
            String numCadastroString = scanner.nextLine();
            if (Pessoa.contemNumeros(numCadastroString)) {
                numCadastro = Integer.parseInt(numCadastroString);
                if (numCadastro <= 0) {
                    System.out.println("Quantidade invalida!");
                }
            } else {
                System.out.println("Quantidade invalida!");
            }
        }

        // Array que armazena a quantidade de pessoas registradas
        Pessoa[] novasPessoas = new Pessoa[numCadastro];

        MinhaListaOrdenavel listaOrdenavel = new MinhaListaOrdenavel();

        for (int i = 0; i < numCadastro; i++) { // Cadastra novos usuários
            System.out.println("\n=====> Novo Usuário <=====");

            // Validação de Gênero
            // Verifica se o usuário informou apenas H para homem ou M para mulher
            String genero = "";
            while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
                System.out.print("Sexo:\n H - Homem\n M - Mulher\n");
                genero = scanner.nextLine();
                if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M") && !genero.isEmpty()) {
                    System.out.println("Sexo INVALIDO! Use apenas H - Homem ou M - Mulher.");
                }
                if (genero.isEmpty()) {
                    System.out.println("Nenhum sexo fornecido. Encerrando o registro.");
                    break;
                }
            }

            // Verifica se o usuário deseja parar
            if (genero.isEmpty()) {
                break;
            }

            // Validação de nome
            String nome = "";
            while (nome.isEmpty()) {
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                if (Pessoa.contemNumeros(nome)) {
                    System.out.println("Nome INVALIDO! Não é permitido inserir números.");
                    nome = "";
                }
            }

            // Validação de sobrenome
            String sobrenome = "";
            while (sobrenome.isEmpty()) {
                System.out.print("Sobrenome: ");
                sobrenome = scanner.nextLine();
                if (Pessoa.contemNumeros(sobrenome)) {
                    System.out.println("Sobrenome INVALIDO! Não é permitido inserir números.");
                    sobrenome = "";
                }
            }

            // Validação de dia de nascimento
            int dia = 0;
            System.out.println("Data de Nascimento");
            while (dia == 0) {
                System.out.print("Dia: ");
                String diaString = scanner.nextLine();
                if (diaString.matches("\\d+")) {
                    dia = Integer.parseInt(diaString);
                    if (!ValidaData.isDiaValido(dia)) {
                        System.out.println("Dia de Nascimento INVALIDO!");
                        dia = 0;
                    }
                } else {
                    System.out.println("Dia de Nascimento INVALIDO!");
                }
            }

            // Validação de mês de nascimento
            int mes = 0;
            while (mes == 0) {
                System.out.print("Mês: ");
                String mesString = scanner.nextLine();
                if (mesString.matches("\\d+")) {
                    mes = Integer.parseInt(mesString);
                    if (!ValidaData.isMesValido(mes)) {
                        System.out.println("Mês de Nascimento INVALIDO!");
                        mes = 0;
                    }
                } else {
                    System.out.println("Mês de Nascimento INVALIDO!");
                }
            }

            // Validação de ano de nascimento
            int ano = 0;
            while (ano == 0) {
                System.out.print("Ano: ");
                String anoString = scanner.nextLine();
                if (anoString.matches("\\d+")) {
                    ano = Integer.parseInt(anoString);
                    if (!ValidaData.isAnoValido(ano)) {
                        System.out.println("Ano de Nascimento INVALIDO!");
                        ano = 0;
                    }
                } else {
                    System.out.println("Ano de Nascimento INVALIDO!");
                }
            }

            // Verificar se a data de nascimento é válida
            if (!ValidaData.isDataValida(dia, mes, ano)) {
                System.out.println("Data de Nascimento invalida! Registro cancelado.");
                return;
            }

            // Validação de CPF
            String cpf = "";
            while (cpf.isEmpty() || !ValidaCPF.isCPF(cpf)) {
                System.out.print("CPF: ");
                cpf = scanner.nextLine();
                if (!ValidaCPF.isCPF(cpf)) {
                    System.out.println("CPF INVALIDO! Insira novamente.");
                    cpf = "";
                }
            }

            float peso = 0;
            while (peso <= 0) {
                System.out.print("Peso em Kg: ");
                String pesoString = scanner.nextLine();

                if (pesoString.matches("\\d+(\\.\\d+)?")) {
                    peso = Float.parseFloat(pesoString);
                    if (peso <= 0) {
                        System.out.println("Peso INVALIDO! O peso deve ser um valor positivo.");
                    }
                } else {
                    System.out.println("Peso INVALIDO! Insira um valor numérico.");
                }
            }

            float altura = 0;
            while (altura <= 0) {
                System.out.print("Altura em cm: ");
                String alturaString = scanner.nextLine();

                if (alturaString.matches("\\d+(\\.\\d+)?")) {
                    altura = Float.parseFloat(alturaString);
                    if (altura <= 0) {
                        System.out.println("Altura invalida! A altura deve ser um valor positivo.");
                    }
                } else {
                    System.out.println("Altura invalida! Insira um valor numérico.");
                }
            }

            if (genero.equalsIgnoreCase("H")) {
                novasPessoas[i] = new Homem(genero, nome, sobrenome, dia, mes, ano, cpf, peso, altura);
            } else if (genero.equalsIgnoreCase("M")) {
                novasPessoas[i] = new Mulher(genero, nome, sobrenome, dia, mes, ano, cpf, peso, altura);
            }

            listaOrdenavel.add((PessoaIMC) novasPessoas[i]);

        }

        // Switch para escolher o modo de ordenação

        System.out.println("\nEscolha a opção de ordenação:");
        System.out.println("1. Alfabetica (A-Z) - nome da pessoa");
        System.out.println("2. Alfabetica (Z-A) - nome da pessoa");
        System.out.println("3. Menor Peso - crescente");
        System.out.println("4. Maior Peso - decrescente");
        System.out.println("5. Menor Altura - crescente");
        System.out.println("6. Menor IMC - crescente");
        System.out.println("7. Homem / Mulher - ordenar por gênero");
        System.out.println("0. Sair");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        switch (opcao) {
            case 1:
                listaOrdenavel.ordenarPorNomeAZ();
                listaOrdenavel.imprimirLista(); // Imprime a lista ordenada
                break;
            case 2:
                listaOrdenavel.ordenarPorNomeZA();
                listaOrdenavel.imprimirLista(); // Imprime a lista ordenada
                break;
            case 3:
                listaOrdenavel.ordenarPorPesoCrescente();
                listaOrdenavel.imprimirLista(); // Imprime a lista ordenada
                break;
            case 4:
                listaOrdenavel.ordenarPorPesoDecrescente();
                listaOrdenavel.imprimirLista(); // Imprime a lista ordenada
                break;
            case 5:
                listaOrdenavel.ordenarPorAlturaCrescente();
                listaOrdenavel.imprimirLista(); // Imprime a lista ordenada
                break;
            case 6:
                listaOrdenavel.ordenarPorIMCCrescente();
                listaOrdenavel.imprimirLista(); // Imprime a lista ordenada
                break;
            case 7:
                listaOrdenavel.ordenarPorGenero();
                listaOrdenavel.imprimirLista(); // Imprime a lista ordenada
                break;
            case 0:
                break;
            default:
                System.out.println("Opção invalida!");
        }

        

        // Contar quantos homens e mulheres foram cadastrados utilizando instanceof
        int numHomens = 0;
        int numMulheres = 0;

        for (Pessoa pessoa : novasPessoas) {
            if (pessoa instanceof Homem) {
                numHomens++;
            } else if (pessoa instanceof Mulher) {
                numMulheres++;
            }
        }

        System.out.println("=-=-=-=-=-=-= Lista de Pessoas Cadastradas Pelo Usuario: =-=-=-=-=-=-= \n");
        for (int i = 0; i < novasPessoas.length; i++) {
            if (novasPessoas[i] != null) {
                System.out.println("\nPessoa " + (i + 1) + ": \n" + novasPessoas[i]);
            }
        }
        System.out.println("=-=-=-= Total de Pessoas Cadastradas: " + (numHomens + numMulheres) + " =-=-=-=\n");

        System.out.println("=-=-=-= Total de Homens Cadastrados: " + numHomens + " =-=-=-=\n");
        System.out.println("=-=-=-= Total de Mulheres Cadastradas: " + numMulheres + " =-=-=-=\n");

        
    }
}
