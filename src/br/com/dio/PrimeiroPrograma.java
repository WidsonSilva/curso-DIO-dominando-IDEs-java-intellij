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

        System.out.println(gato);

    }
}
