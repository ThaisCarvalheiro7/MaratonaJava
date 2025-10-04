package maratonaJava.maratonaJava.POO.introducaoMetodos.test;

import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Student;

public class studentTest02 {
    public static void main(String[] args) {
        Student estudante = new Student();
        Student estudante1 = new Student();

        estudante.nome = "Itachi";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante1.nome = "Neji";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante.imprime();
        estudante1.imprime();
    }
}
