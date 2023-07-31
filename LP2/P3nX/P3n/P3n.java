package P3n;

import java.util.Scanner;

public class P3n {
    public static void main(String[] args) throws CopiaNaoDisponivelEx {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = null;

        System.out.println("Bem-vindo(a) à Biblioteca!");
        System.out.println("--------------------------");

        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    biblioteca = iniciarBibliotecaDoZero();
                    break;
                case 2:
                    biblioteca = carregarBancoDados();
                    break;
                case 3:
                    if (biblioteca != null) {
                        realizarOperacoes(biblioteca);
                    } else {
                        System.out.println("A biblioteca ainda não foi iniciada ou os dados não foram carregados.");
                    }
                    break;
                case 4:
                    if (biblioteca != null) {
                        realizarCadastro(biblioteca);
                    } else {
                        System.out.println("A biblioteca ainda não foi iniciada ou os dados não foram carregados.");
                    }
                    break;
                case 5:
                    if (biblioteca != null) {
                        salvarCadastro(biblioteca);
                    } else {
                        System.out.println("A biblioteca ainda não foi iniciada ou os dados não foram carregados.");
                    }
                    break;
                case 6:
                    if (biblioteca != null) {
                        realizarEmprestimo(biblioteca);
                    } else {
                        System.out.println("A biblioteca ainda não foi iniciada ou os dados não foram carregados.");
                    }
                    break;
                case 7:
                    if (biblioteca != null) {
                        realizarDevolucao(biblioteca);
                    } else {
                        System.out.println("A biblioteca ainda não foi iniciada ou os dados não foram carregados.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenuPrincipal() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Iniciar biblioteca do zero");
        System.out.println("2 - Carregar banco de dados");
        System.out.println("3 - Realizar operações");
        System.out.println("4 - Cadastro");
        System.out.println("5 - Salvar cadastro em arquivo");
        System.out.println("6 - Empréstimo");
        System.out.println("7 - Devolução");
        System.out.println("0 - Sair");
    }

    public static Biblioteca iniciarBibliotecaDoZero() {
        System.out.println("Iniciando biblioteca do zero...");
        return new Biblioteca();
    }

    public static Biblioteca carregarBancoDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo de usuários: ");
        String arquivoUsuarios = scanner.nextLine();

        System.out.println("Digite o nome do arquivo de livros: ");
        String arquivoLivros = scanner.nextLine();

        System.out.println("Carregando banco de dados...");
        return new Biblioteca(arquivoUsuarios, arquivoLivros);
    }

    public static void realizarOperacoes(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        System.out.print("Nome: ");
        nome = scanner.nextLine();
    }

    public static void realizarCadastro(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenuCadastro();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarUsuario(biblioteca);
                    break;
                case 2:
                    cadastrarLivro(biblioteca);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);
    }

    public static void exibirMenuCadastro() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Cadastrar livro");
        System.out.println("0 - Retornar ao menu principal");
    }

    public static void cadastrarUsuario(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do usuário:");
        // Leia os dados do usuário
        // Exemplo:
        String genero = scanner.nextLine();
        String nome = scanner.nextLine();
        // ...

        // Crie um objeto Usuário com os dados lidos
        Usuário usuario = new Usuário(genero, nome, ...);

        // Cadastre o usuário na biblioteca
        // biblioteca.cadastrarUsuario(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void cadastrarLivro(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do livro:");
        // Leia os dados do livro
        // Exemplo:
        // String codigoLivro = scanner.nextLine();
        // String tituloLivro = scanner.nextLine();
        // ...

        // Crie um objeto Livro com os dados lidos
        // Livro livro = new Livro(codigoLivro, tituloLivro, ...);

        // Cadastre o livro na biblioteca
        // biblioteca.cadastrarLivro(livro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    public static void salvarCadastro(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenuSalvarCadastro();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do arquivo para salvar o cadastro de usuários: ");
                    String arquivoUsuarios = scanner.nextLine();
                    biblioteca.salvaArquivo(biblioteca.cadastrarUsuario(usuario), arquivoUsuarios);
                    System.out.println("Cadastro de usuários salvo com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do arquivo para salvar o cadastro de livros: ");
                    String arquivoLivros = scanner.nextLine();
                    biblioteca.salvaArquivo(biblioteca.cadastrarLivro(), arquivoLivros);
                    System.out.println("Cadastro de livros salvo com sucesso!");
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);
    }

    public static void exibirMenuSalvarCadastro() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Salvar cadastro de usuários");
        System.out.println("2 - Salvar cadastro de livros");
        System.out.println("0 - Retornar ao menu principal");
    }

    public static void realizarEmprestimo(Biblioteca biblioteca) throws CopiaNaoDisponivelEx {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exibindo cadastro de livros:");
        System.out.println(biblioteca.imprimeLivros());

        System.out.println("Digite o código do livro que deseja emprestar: ");
        String codigoLivro = scanner.nextLine();

        System.out.println("Digite o código do usuário que está realizando o empréstimo: ");
        String codigoUsuario = scanner.nextLine();

        try {
            Livro livro = biblioteca.getLivro(codigoLivro);
            Usuario usuario = biblioteca.getUsuario(codigoUsuario);

            biblioteca.emprestaLivro(usuario, livro);
            System.out.println("Empréstimo realizado com sucesso!");
        } catch (LivroNaoCadastradoEx e) {
            System.out.println("Livro não encontrado: " + e.getMessage());
        } catch (UsuarioNaoCadastradoEx e) {
            System.out.println("Usuário não encontrado: " + e.getMessage());
        }
    }

    public static void realizarDevolucao(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do livro que deseja devolver: ");
        String codigoLivro = scanner.nextLine();

        System.out.println("Digite o código do usuário que está realizando a devolução: ");
        String codigoUsuario = scanner.nextLine();

        try {
            Livro livro = biblioteca.getLivro(codigoLivro);
            Usuario usuario = biblioteca.getUsuario(codigoUsuario);

            biblioteca.devolveLivro(usuario, livro);
            System.out.println("Devolução realizada com sucesso!");
        } catch (LivroNaoCadastradoEx e) {
            System.out.println("Livro não encontrado: " + e.getMessage());
        } catch (UsuarioNaoCadastradoEx e) {
            System.out.println("Usuário não encontrado: " + e.getMessage());
        } catch (NenhumaCopiaEmprestadaEx e) {
            System.out.println("Nenhuma cópia do livro foi emprestada: " + e.getMessage());
        }
    }
}
