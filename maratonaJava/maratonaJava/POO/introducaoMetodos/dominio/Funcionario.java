package maratonaJava.maratonaJava.POO.introducaoMetodos.dominio;
import java.util.Scanner;

public class Funcionario {
        private String nome;
        private int idade;
        private double [] salarios = new double[3];
        private double media = 0;

        public void imprimeFuncionario(){
            System.out.println(this.nome);
            System.out.println(this.idade);

            for (double salario: salarios ){
                System.out.println(salario + " ");
            }
        }
        public void calcularMedia(){
             double media = 0;
             for (double salario: salarios){
                 media += salario;
             }
             media /= salarios.length;
            System.out.println("Média salarial: "+media);
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}





