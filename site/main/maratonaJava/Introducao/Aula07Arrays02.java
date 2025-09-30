package site.main.maratonaJava.Introducao;
import java.util.Scanner;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Thais";
        nomes[2] = "Alice";
        nomes[3] = "Franc";

        for(int i = 0; i < nomes.length; i++){
          System.out.println(nomes[i]);
      }
    }
}