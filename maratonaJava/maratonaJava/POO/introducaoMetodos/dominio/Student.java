package maratonaJava.maratonaJava.POO.introducaoMetodos.dominio;

public class Student {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
