package maratonaJava.maratonaJava.POO.Construtores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
    public Anime(){

    }

    public void imprimeAnime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNome(){
        return this.nome;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getEpisodios(){
        return this.episodios;
    }
    public String getGenero(){
        return this.genero;
    }
}
