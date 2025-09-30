package site.main.maratonaJava.Introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int result = number2 + number1;
        int result2 = number2-number1;
        System.out.println(result);
        System.out.println(result2);

        boolean isDez = 10 > 20;
        System.out.println("10 é maior que 20: "+isDez);
        boolean isVinte = 10 < 20;
        System.out.println("10 é menor que 20: "+isVinte);
        boolean isDezigualVinte = 10 == 2;
        System.out.println("10 = 20: "+isDezigualVinte);
        boolean isDezDiferenteVinte = 10 !=20;
        System.out.println("10 diferente de 20: "+isDezDiferenteVinte);

        int age = 35;
        float salary = 3500;
        boolean isInsideLawBiggerThirty = age > 30  && salary > 4612;
        System.out.println("Pode usufruir da lei para maiores que 30: "+isInsideLawBiggerThirty);
        boolean isInsideLawDownThirty = age < 30 && salary > 3381;
        System.out.println("Pode usufruir da lei para menores que 30: "+isInsideLawDownThirty);

        double totalValueCurrentCount = 200;
        double totalCount = 100;

        boolean isPlaystationBuy = totalValueCurrentCount > 5000 || totalCount > 5000;

        double bonus = 1800;
        bonus+=1000;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador ++;

    }


}
