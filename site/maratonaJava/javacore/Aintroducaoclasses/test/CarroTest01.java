package site.maratonaJava.javacore.Aintroducaoclasses.test;

import site.maratonaJava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Mercedes";
        carro.modelo = "Meca";
        carro.ano = 2025;

        Carro carro2 = new Carro();
        carro2.nome = "Ferrari";
        carro2.modelo = "La Ferrari";
        carro2.ano = 2025;

        carro = carro2;

        System.out.println("Nome: " +carro.nome+"\n");
        System.out.println("Modelo: " +carro.modelo+"\n");
        System.out.println("Ano: "+ carro.ano+"\n");
        System.out.println("-------------------------------------\n");
        System.out.println("Nome: "+ carro2.nome+"\n");
        System.out.println("Modelo: " +carro2.modelo+"\n");
        System.out.println("Ano: "+ carro2.ano+"\n");


    }
}
