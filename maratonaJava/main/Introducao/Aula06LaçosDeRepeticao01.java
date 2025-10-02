package maratonaJava.main.Introducao;

public class Aula06LaçosDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            count++;
            System.out.println(count);
        }
        do {
            count++;
            System.out.println("Do While: " + count);
        } while (count < 10);

        for (int i=0;i<10;i++){
            System.out.println("Count for: "+i);
        }
    }
}

