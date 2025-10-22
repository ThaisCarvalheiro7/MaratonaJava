package maratonaJava.maratonaJava.POO.blocosInicializacao.domain;


import java.util.Arrays;

public class Anime {
    private String nome;
    private int [] episodios;
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }


    public Anime(String nome) {
        this();
        this.nome = nome;
    }

    public Anime() {
        //System.out.println(episodios);
        for (int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
