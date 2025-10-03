package maratonaJava.maratonaJava.POO.introducaoMetodos.test;

import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Calculadora;

public class calculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(0, 20);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumero1(0, 10));

        Calculadora calculadora1 = new Calculadora();
        calculadora1.imprimeDivisaoDeDoisNumeros(10, 0);
    }
}
