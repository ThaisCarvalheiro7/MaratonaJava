package maratonaJava.main.Introducao;

import java.util.Scanner;

public class ArraysMultidimensaionais {
    public static void main(String[] args) {
//        int [][]dias = new int [3][3];
//        dias [0][0] = 31;
//        dias [0][1] = 28;
//        dias [0][2] = 31;
//
//        dias [1][0] = 31;
//        dias [1][1] = 28;
//        dias [1][2] = 31;
//        System.out.println(dias[0][0]);
//
//    for (int i = 0; i < dias.length; i++){
//        for (int j = 0; j < dias[0].length; j++){
//            System.out.println(dias[i][j]);
//        }
//    }
        Scanner sc = new Scanner(System.in);
        String [] equipes = {"Gerencial", "Integração", "Plataforma", "SAP"};
        int [] boas = new int [4];
        int boasInt = 0;
        int [] ruins = new int[4];
        int ruinsInt = 0;
        int [] totalMensal = new int[1];

        for (int i = 0; i < equipes.length; i++) {
            System.out.println(equipes[i]);
                System.out.println("Quantidade de boas: ");
                boasInt = sc.nextInt();
                System.out.println("Quantidade de ruins: ");
                ruinsInt = sc.nextInt();
                ruins[i] = ruinsInt;
                boas[i] = boasInt;
                totalMensal[i] = ruinsInt+boasInt;
            System.out.println("O total do mes é: "+totalMensal[i]);

        }





    }



}
