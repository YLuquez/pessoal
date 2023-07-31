
public class Pessoa {
    private String genero;
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String cpf;

    public Pessoa(){    // Contrutor caso o usuario não forneça dados
        this.nome = "";
        this.sobrenome = "";
        this.diaNascimento = 0;
        this.mesNascimento = 0;
        this.anoNascimento = 0;
        this.cpf = "";

        
    }
    
    public Pessoa(String genero, String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento, String cpf) {
        this.genero = setGenero(genero);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    private String setGenero(String genero) {
        if (genero.equalsIgnoreCase("H")) {
            return "Homem";
        } else if (genero.equalsIgnoreCase("M")) {
            return "Mulher";
        } else {
            return "Gênero inválido";
        }
    }

    public String getNome() {   
        return nome;
    }

    public void setNome(String nome) {
        if (!contemNumeros(nome)){
            this.nome = nome;
        }else{
            System.out.println("O nome não pode conter números.");
        }
        
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (!contemNumeros(sobrenome)){
            this.sobrenome = sobrenome;
        }else{
            System.out.println("O sobrenome não pode conter números.");
        }
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento){
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento){
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public static boolean contemNumeros(String texto){      // Validador que pode ser chamado sempre para verificar se a string tem numeros
        for (char c:texto.toCharArray()){
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public String toString() {      // toString personalizado
        return
                "  Genero: " + genero + "\n" +  
                "  Nome: " + nome + "\n" +
                "  Sobrenome: " + sobrenome + "\n" +
                "  Data de Nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + "\n" +
                "  CPF: " + cpf + "\n";
    }

}
