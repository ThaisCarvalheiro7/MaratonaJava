package maratonaJava.maratonaJava.POO.introducaoMetodos.test;

import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Pessoa;

public class pessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Naruto");
        pessoa.setIdade(18);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
