package maratonaJava.maratonaJava.POO.introducaoMetodos.test;
import java.util.Scanner;
import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Funcionario;

public class funcionarioTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario executar = new Funcionario();


        System.out.println("NOME DOS FUNCIONÁRIOS: ");
        Funcionario func1 = new Funcionario();
        System.out.println("Funcionário 1: ");
        func1.nome = sc.next();
        Funcionario func2 = new Funcionario();
        System.out.println("Funcionário 2:" );
        func2.nome = sc.next();
        System.out.println("Funcionario 3: ");
        Funcionario func3 = new Funcionario();
        func3.nome = sc.next();
        System.out.println("-------------------------------------------------------");
        System.out.println("IDADE DOS FUNCIONÁRIOS: ");
        System.out.println("Funcionario 1: ");
        func1.idade = sc.nextInt();
        System.out.println("Funcionario 2: ");
        func2.idade = sc.nextInt();
        System.out.println("Funcionario 3: ");
        func3.idade = sc.nextInt();

        System.out.println("SALARIOS");


    }
}
