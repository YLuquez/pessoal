
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinhaListaOrdenavel {
    private List<PessoaIMC> lista;

    public MinhaListaOrdenavel() {
        lista = new ArrayList<>();
        adicionarPessoasCadastradas();
    }

    private void adicionarPessoasCadastradas() {
    // Instanciando e adicionando 5 mulheres
    lista.add(new Mulher("M", "Ana", "Silva", 10, 5, 1990, "12345678901", 60, 160));
    lista.add(new Mulher("M", "Maria", "Santos", 15, 8, 1985, "98765432109", 65 , 165 ));
    lista.add(new Mulher("M", "Julia", "Souza", 20, 3, 1993, "56789012345", 55 , 155 ));
    lista.add(new Mulher("M", "Laura", "Oliveira", 5, 11, 1988, "90123456789", 70 , 170 ));
    lista.add(new Mulher("M", "Beatriz", "Ferreira", 25, 2, 1992, "34567890123", 62 , 158 ));

    // Instanciando e adicionando 5 homens
    lista.add(new Homem("H", "Pedro", "Santos", 12, 7, 1987, "45678901234", 75 , 180 ));
    lista.add(new Homem("H", "João", "Silva", 8, 4, 1984, "89012345678", 80 , 185 ));
    lista.add(new Homem("H", "Lucas", "Ferreira", 30, 9, 1995, "23456789012", 70 , 175 ));
    lista.add(new Homem("H", "Miguel", "Oliveira", 18, 1, 1989, "67890123456", 85 , 190 ));
    lista.add(new Homem("H", "Gustavo", "Souza", 22, 6, 1991, "01234567890", 77 , 178 ));
}

    public void add(PessoaIMC pessoa) {
        lista.add(pessoa);
    }

    public PessoaIMC get(int index) {
        return lista.get(index);
    }

    public void ordenarPorNomeAZ() {
        Collections.sort(lista, new Comparator<PessoaIMC>() {
            @Override
            public int compare(PessoaIMC p1, PessoaIMC p2) {
                return p1.getNome().compareToIgnoreCase(p2.getNome());
            }
        });
    }

    public void ordenarPorNomeZA() {
        Collections.sort(lista, new Comparator<PessoaIMC>() {
            @Override
            public int compare(PessoaIMC p1, PessoaIMC p2) {
                return p2.getNome().compareToIgnoreCase(p1.getNome());
            }
        });
    }

    public void ordenarPorGenero() {
        Collections.sort(lista, new Comparator<PessoaIMC>() {
            @Override
            public int compare(PessoaIMC p1, PessoaIMC p2) {
                return p1.getGenero().compareToIgnoreCase(p2.getGenero());
            }
        });
    }

    public void ordenarPorDataNascimento() {
        Collections.sort(lista, new Comparator<PessoaIMC>() {
            @Override
            public int compare(PessoaIMC p1, PessoaIMC p2) {
                int result = Integer.compare(p1.getAnoNascimento(), p2.getAnoNascimento());
                if (result == 0) {
                    result = Integer.compare(p1.getMesNascimento(), p2.getMesNascimento());
                    if (result == 0) {
                        result = Integer.compare(p1.getDiaNascimento(), p2.getDiaNascimento());
                    }
                }
                return result;
            }
        });
    }

    public void ordenarPorPesoCrescente() {
    Collections.sort(lista, new Comparator<PessoaIMC>() {
        @Override
        public int compare(PessoaIMC p1, PessoaIMC p2) {
            return Float.compare(p1.getPeso(), p2.getPeso());
        }
    });
}

    public void ordenarPorPesoDecrescente() {
        Collections.sort(lista, new Comparator<PessoaIMC>() {
            @Override
            public int compare(PessoaIMC p1, PessoaIMC p2) {
                return Float.compare(p2.getPeso(), p1.getPeso());
            }
        });
    }

    public void ordenarPorAlturaCrescente() {
        Collections.sort(lista, new Comparator<PessoaIMC>() {
            @Override
            public int compare(PessoaIMC p1, PessoaIMC p2) {
                return Float.compare(p1.getAltura(), p2.getAltura());
            }
        });
    }

    public void ordenarPorIMCCrescente() {
        Collections.sort(lista, new Comparator<PessoaIMC>() {
            @Override
            public int compare(PessoaIMC p1, PessoaIMC p2) {
                return Float.compare(p1.calculaIMC(), p2.calculaIMC());
            }
        });
    }

    public void imprimirLista() {
        System.out.println("\n ~~~~~~ Lista de pessoas ordenadas ~~~~~~\n");
        for (PessoaIMC pessoa : lista) {
            System.out.println(pessoa);
            System.out.println();
        }
    }
}
