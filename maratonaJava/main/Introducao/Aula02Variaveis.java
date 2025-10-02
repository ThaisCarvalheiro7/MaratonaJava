package maratonaJava.main.Introducao;

public class Aula02Variaveis {
    public static void main(String[] args) {
        //int,  double, float, char, byte, short, long, boolean
        int ageUsers = 21;
        System.out.println("Age: " + ageUsers);
        double salary = 2000;
        float wage =  2500;
        boolean value = true;
        char caractere = 'M'; //apenas UMA letra
        char number = 10; // numero tambem
        String name = "text";

        System.out.println("A idade é: "+ ageUsers);
        System.out.println("O salario mensal é: "+salary);
        System.out.println("O salario semanal é: "+wage);
        System.out.println("Valor: "+value);
        System.out.println(name);
    }
}
