package site.main.maratonaJava.Introducao;

public class Aula05Condicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String messageDonate = "É possível doar";
        String messageNotDonate = "Não é possível fazer a doação";
        String result = (salary > 5000) ? messageDonate:messageNotDonate;

        System.out.println(result);
    }
}
