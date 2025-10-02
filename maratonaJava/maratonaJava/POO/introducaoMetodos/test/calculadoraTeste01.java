package maratonaJava.maratonaJava.POO.introducaoMetodos.test;

import maratonaJava.maratonaJava.POO.introducaoMetodos.dominio.Calculadora;

public class calculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        Calculadora calculadora1 = new Calculadora();
        calculadora1.subtraiDoisNumeros();
    }
}
