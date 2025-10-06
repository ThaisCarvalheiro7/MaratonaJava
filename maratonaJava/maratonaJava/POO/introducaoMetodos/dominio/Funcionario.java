package maratonaJava.maratonaJava.POO.introducaoMetodos.dominio;
import java.util.Scanner;

public class Funcionario {
    Scanner sc = new Scanner(System.in);
    public String nome;
    public int idade;
    public double[] salarioArray = new double[3];
public double salario;
    double salario1;
    double salario2;
    double salario3;

    public double [] calculoSalario() {

        System.out.println("Funcionário 1: ");
        salario1 = sc.nextDouble();
        salarioArray[0] = salario1;
        System.out.println("Funcionario 2: ");
        salario2 = sc.nextDouble();
        salarioArray[1] = salario2;
        System.out.println("Funcionario 3: ");
        salario2 = sc.nextDouble();
        salarioArray[2] = salario3;

        double mediaSlario = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média salarial é: " + mediaSlario);
        return salarioArray;

    }
        public void exibirDados () {
            System.out.println("Nome: "+this.nome);
            System.out.println("Idade: "+this.idade);


        }
    }





