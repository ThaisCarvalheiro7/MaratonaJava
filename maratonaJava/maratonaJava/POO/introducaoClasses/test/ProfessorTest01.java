package maratonaJava.maratonaJava.POO.introducaoClasses.test;

import maratonaJava.maratonaJava.POO.introducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome ="Kakashi";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println(professor.nome +" "+ professor.idade+" " + professor.sexo);
    }
}
