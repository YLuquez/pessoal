
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Biblioteca {
    private Hashtable<String, Usuario> cadastroUsuarios;
    private Hashtable<String, Livro> cadastroLivros;

    public Biblioteca() {
        cadastroUsuarios = new Hashtable<>();
        cadastroLivros = new Hashtable<>();
    }

    public Biblioteca(String arquivoUsuarios, String arquivoLivros) {
        cadastroUsuarios = new Hashtable<>();
        cadastroLivros = new Hashtable<>();
        carregarUsuarios(arquivoUsuarios);
        carregarLivros(arquivoLivros);
    }

    public void cadastrarUsuario(Usuario usuario) {
        cadastroUsuarios.put(usuario.getCodigoUsuario(), usuario);
    }

    public void removerUsuario(String cpf) {
        cadastroUsuarios.remove(cpf);
    }

    public Usuario buscarUsuario(String cpf) {
        return cadastroUsuarios.get(cpf);
    }

    public void cadastrarLivro(Livro livro) {
        cadastroLivros.put(livro.getCodigoLivro(), livro);
    }

    public void removerLivro(String codigoLivro) {
        cadastroLivros.remove(codigoLivro);
    }

    public Livro buscarLivro(String codigoLivro) {
        return cadastroLivros.get(codigoLivro);
    }

    private void carregarUsuarios(String arquivoUsuarios) {
        try {
            FileInputStream fis = new FileInputStream(arquivoUsuarios);
            ObjectInputStream ois = new ObjectInputStream(fis);
            cadastroUsuarios = (Hashtable<String, Usuario>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void carregarLivros(String arquivoLivros) {
        try {
            FileInputStream fis = new FileInputStream(arquivoLivros);
            ObjectInputStream ois = new ObjectInputStream(fis);
            cadastroLivros = (Hashtable<String, Livro>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void salvaArquivo(Hashtable<?, ?> objeto, String nomeArquivo) {
        try {
            FileOutputStream fos = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objeto);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lêArquivo(String nomeArquivo) {
        try {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Hashtable<?, ?> objeto = (Hashtable<?, ?>) ois.readObject();
            
            // Verifica se o objeto lido é um cadastro de usuários ou um acervo de livros
            if (objeto instanceof Hashtable<?, ?>) {
                if (objeto.equals(cadastroUsuarios)) {
                    cadastroUsuarios = (Hashtable<String, Usuario>) objeto;
                } else if (objeto.equals(cadastroLivros)) {
                    cadastroLivros = (Hashtable<String, Livro>) objeto;
                }
            }
            
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void emprestaLivro(Usuario usuario, Livro livro) {
        try {
            livro.empresta();  // Chama o método empresta() no objeto Livro
            GregorianCalendar dataEmprestimo = new GregorianCalendar();  // Obtém a data do empréstimo

            usuario.addLivroHist(dataEmprestimo, livro.getCodigoLivro());  // Atualiza o histórico no objeto Usuário
        } catch (CopiaNaoDisponivelEx e) {
            // Trata a exceção de cópia não disponível
            System.out.println(e.getMessage());
        }
    }

    public void devolveLivro(Usuario usuario, Livro livro) throws NenhumaCopiaEmprestadaEx {
        livro.devolve();  // Chama o método devolve() no objeto Livro
        
        GregorianCalendar dataDevolucao = new GregorianCalendar();  // Obtém a data da devolução
        
        // Verifica se há atraso na devolução
        if (dataDevolucao.after(livro.getDataPrevistaDevolucao())) {
            int diasAtraso = calcularDiasAtraso(dataDevolucao, livro.getDataPrevistaDevolucao());
            float multa = calcularMulta(diasAtraso);
            
            System.out.println("Devolução com atraso! Multa de R$" + multa + " aplicada.");
        }
        
        usuario.removeLivroHist(livro.getCodigoLivro());
    }
    
    private int calcularDiasAtraso(GregorianCalendar dataDevolucao, GregorianCalendar dataPrevista) {
        long diferenca = dataDevolucao.getTimeInMillis() - dataPrevista.getTimeInMillis();
        return (int) (diferenca / (24 * 60 * 60 * 1000));
    }
    
    private float calcularMulta(int diasAtraso) {
        return diasAtraso * 1.0f;
    }

    public String imprimeLivros() {
        ArrayList<Livro> livros = new ArrayList<>(cadastroLivros.values());
        
        // Ordena os livros pelo título
        Collections.sort(livros, Comparator.comparing(Livro::getTituloLivro));
        
        StringBuilder sb = new StringBuilder();
        
        for (Livro livro : livros) {
            sb.append(livro.toString()).append("\n");
        }
        
        return sb.toString();
    }

    public String imprimeUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>(cadastroUsuarios.values());
        
        // Ordena os usuários pelo nome
        Collections.sort(usuarios, Comparator.comparing(Usuario::getNome));
        
        StringBuilder sb = new StringBuilder();
        
        for (Usuario usuario : usuarios) {
            sb.append(usuario.toString()).append("\n");
        }
        
        return sb.toString();
    }

    public Livro getLivro(String codigo) throws LivroNaoCadastradoEx {
        Livro livro = cadastroLivros.get(codigo);
        
        if (livro == null) {
            throw new LivroNaoCadastradoEx("Livro não cadastrado.");
        }
        
        return livro;
    }

    public Usuario getUsuario(String codigo) throws UsuarioNaoCadastradoEx {
        for (Usuario usuario : cadastroUsuarios.values()) {
            if (usuario.getCodigoUsuario() == codigo) {
                return usuario;
            }
        }
        
        throw new UsuarioNaoCadastradoEx("Usuário não cadastrado.");
    }

}
