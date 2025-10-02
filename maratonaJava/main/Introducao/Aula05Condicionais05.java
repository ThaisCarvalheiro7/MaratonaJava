package maratonaJava.main.Introducao;

public class Aula05Condicionais05 {
    public static void main(String[] args) {
        System.out.println("Digite um numero para dia da semana, sendo 1 domingo:" );
        int dayWeek = 5;
        switch (dayWeek){
            case 1:{
                System.out.println("Domingo");
                break;
            }
            case 2: {
                System.out.println("Segunda-feira");
                break;
            }
            case 3:{
                System.out.println("Terça feira");
                break;
            }
            case 4:{
                System.out.println("Quarta-feira");
                break;
            }
            case 5:{
                System.out.println("Quinta-feira");
                break;
            }
            case 6:{
                System.out.println("Sexta-feira");
                break;
            }
            case 7:{
                System.out.println("Sábado");
                break;
            }
            default:{
                System.out.println("Número inválido");
                break;
            }
        }
        char sex = 'f';
        switch (sex){
            case 'M':{
                System.out.println("Masculino");
                break;
            }
            case 'F':{
                System.out.println("Feminino");
                break;
            }
            default:
                System.out.println("Valor inválido!");
        }
    }
}
