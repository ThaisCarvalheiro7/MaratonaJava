package maratonaJava.maratonaJava.POO.introducaoMetodos.test;

import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Pessoa;

public class pessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Naruto";
        pessoa.setNome("Naruto");
        //pessoa.idade = 21;
        pessoa.setIdade(21);
//        pessoa.imprimePessoa();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());


    }
}
