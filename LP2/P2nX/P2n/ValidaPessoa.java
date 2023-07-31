
public class ValidaPessoa { // Classe para validar os argumentos
    public static boolean validaCampos(String[] args){
        if (args.length != 9) {
            System.out.println("Argumentos insuficientes.");
            return false;
        }

        String genero = args[0];
        String nome = args[1];
        String sobrenome = args[2];
        int dia = Integer.parseInt(args[3]);
        int mes = Integer.parseInt(args[4]);
        int ano = Integer.parseInt(args[5]);
        String cpf = args[6];
        float peso = Float.parseFloat(args[7]);
        float altura = Float.parseFloat(args[8]);

        

        if(!validaGenero(genero)){
            return false;
        }

        if(!validaNome(nome)){
            return false;
        }

        if(!validaSobrenome(sobrenome)){
            return false;
        }

        if (!ValidaData.isDataValida(dia, mes, ano)) {
            return false;
        }

        if (!ValidaCPF.isCPF(cpf)) {
            return false;
        }

        if (!validaPeso(peso)){
            return false;
        }

        if (!validaAltura(altura)){
            return false;
        }
        
        return true;
    }

    private static boolean validaGenero(String genero) {
            if(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")){
                System.out.println("\nGênero do argumento foi INVALIDO. Use 'H' para homem ou 'M' para mulher.");
                return false;
            }
        return true;
    }

    private static boolean validaNome(String nome){
        if(Pessoa.contemNumeros(nome)){
            System.out.println("\nNome INVALIDO! Nao eh permitido inserir numeros.");
            return false;
        }
        return true;
    }

    public static boolean validaSobrenome(String sobrenome) {
        if(Pessoa.contemNumeros(sobrenome)){
            System.out.println("\nSobrenome INVALIDO! Nao eh permitido inserir numeros.");
            return false;
        }
        return true;
    }

    public static boolean validaPeso(float peso){
        if(peso <= 0){
            System.out.println("\nPeso INVALIDO! O peso deve ser valor positivo!");
            return false;
        }
        return true;
    }

    public static boolean validaAltura(float altura){
        if(altura <= 0){
            System.out.println("\nAltura INVALIDA! A altura deve ser valor positivo!");
            return false;
        }
        return true;
    }
}

