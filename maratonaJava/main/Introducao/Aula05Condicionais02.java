package maratonaJava.main.Introducao;

public class Aula05Condicionais02 {
    public static void main(String[] args) {
        int agePlayer = 14;

        if(agePlayer < 15){
            System.out.println("Categoria: infantil");
        } else if (agePlayer >= 15 && agePlayer < 18) {
            System.out.println("Categoria: juvenil");
        }else {
            System.out.println("Categoria: adulto");
        }
    }
}
