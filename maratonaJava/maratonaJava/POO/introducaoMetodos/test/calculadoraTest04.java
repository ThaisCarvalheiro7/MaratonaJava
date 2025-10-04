package maratonaJava.maratonaJava.POO.introducaoMetodos.test;
import java.util.Scanner;
import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Calculadora;

public class calculadoraTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int num1 = 0;
        int num2 = 0;
        calculadora.alteraDoisNumeros(num1 , num2);

    }

}
