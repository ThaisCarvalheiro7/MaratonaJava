package maratonaJava.maratonaJava.POO.introducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num3, double num4){
       if (num3 == 0){
           return 0;
       }
       return num3 / num4;
    }

    public double divideDoisNumero1(double num3, double num4){
        if (num4 == 0){
            return 0;
        }else{
            return num3 / num4;
        }
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Valor inválido!");
        }else {
            System.out.println(num1/num2);
        }
    }
}
