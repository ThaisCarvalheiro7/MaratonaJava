package maratonaJava.main.Introducao;

public class Aula05Condicionais {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorhizedCreatAccount = age >= 18;

        if(isAutorhizedCreatAccount== true){
            System.out.println("Cadastro realizado!");
        }else{
            System.out.println("Idade inválida!");
        }

    }




}
