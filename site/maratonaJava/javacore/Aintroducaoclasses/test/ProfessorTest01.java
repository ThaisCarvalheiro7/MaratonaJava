package site.maratonaJava.javacore.Aintroducaoclasses.test;

import site.maratonaJava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome ="Kakashi";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println(professor.nome +" "+ professor.idade+" " + professor.sexo);
    }
}
