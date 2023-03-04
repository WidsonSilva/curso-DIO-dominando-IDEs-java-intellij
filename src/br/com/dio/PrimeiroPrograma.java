package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
       /* int a = 5, b = 3;
        System.out.printf("SOMA: "+(a+b));*/
        Gato gato = new Gato();
        gato.setNome("Atim");
        gato.setCor("Laranja");
        gato.setIdade(1);

        Livro livro1 = new Livro("The Godfather",462);

        System.out.println(livro1+"\n");
        System.out.println(gato);

    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

}
