package maratonaJava.maratonaJava.POO.introducaoMetodos.test;

import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        int salario1;
        Funcionario funcionario = new Funcionario();
        Funcionario calculo = new Funcionario();
        funcionario.setNome("Deidara");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[] {1200, 3000, 4500});
        funcionario.imprimeFuncionario();
        System.out.println("Média: "+funcionario.getMedia());
    }
}

