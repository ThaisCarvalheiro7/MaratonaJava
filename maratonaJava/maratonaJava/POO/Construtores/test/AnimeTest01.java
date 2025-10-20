package maratonaJava.maratonaJava.POO.Construtores.test;


import maratonaJava.maratonaJava.POO.Construtores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime2 = new Anime("Demon slayer", "TV", "LUTA", 12, "Cruncyhroll");
        Anime anime1 = new Anime();
        anime2.imprimeAnime();
        anime1.imprimeAnime();
    }
}
