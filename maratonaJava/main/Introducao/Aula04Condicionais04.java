package maratonaJava.main.Introducao;

public class Aula04Condicionais04 {
    public static void main(String[] args) {
        double yearSalary = 45000;
        double firstImpost = 9.7/100;
        double  secondImpost= 37.35/100;
        double treeImpost = 49.5/100;
        double impostValue;
        if (yearSalary <= 34712){
            yearSalary *=firstImpost;
        } else if (yearSalary > 34713 && yearSalary <=68507) {
            yearSalary *=secondImpost;
        }else {
            yearSalary*=treeImpost;
        }
        System.out.println(yearSalary);
    }
}
