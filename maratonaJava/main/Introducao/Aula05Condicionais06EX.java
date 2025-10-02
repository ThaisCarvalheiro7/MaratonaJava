package maratonaJava.main.Introducao;

public class Aula05Condicionais06EX {
    public static void main(String[] args) {
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Domingo: Final de semana");
                break;
            case 2:
                System.out.println("Segunda: Dia útil");
                break;
            case 3:
                System.out.println("Terça: Dia útil");
                break;
            case 4:
                System.out.println("Quarta: Dia útil");
                break;
            case 5:
                System.out.println("Quinta: Dia útil");
                break;
            case 6:
                System.out.println("Sexta: Dia útil");
                break;
            case 7:
                System.out.println("Sábado: Dia útil");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
