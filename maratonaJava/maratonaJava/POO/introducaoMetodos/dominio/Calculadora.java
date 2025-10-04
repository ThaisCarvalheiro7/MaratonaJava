package maratonaJava.maratonaJava.POO.introducaoMetodos.dominio;
import java.util.Scanner;
public class Calculadora {
    public void somaDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o numero 2: ");
        int num2 = sc.nextInt();
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num3, double num4){
       if (num3 == 0){
           return 0;
       }
       return num3 / num4;
    }

    public double divideDoisNumero1(double num3, double num4){
        if (num4 == 0){
            return 0;
        }else{
            return num3 / num4;
        }
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Valor inválido!");
        }else {
            System.out.println(num1/num2);
        }
    }
    public void alteraDoisNumeros(int num1, int num2){
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = 33;

        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num 1: "+num1);
        System.out.println("Num 2: "+num2);
    }
    public void somaArray(int [] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);

    }
}
