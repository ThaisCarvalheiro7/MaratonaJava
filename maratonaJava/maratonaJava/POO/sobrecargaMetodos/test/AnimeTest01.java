package maratonaJava.maratonaJava.POO.sobrecargaMetodos.test;

import maratonaJava.maratonaJava.POO.sobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 12, "Luta");
        anime.imprimeAnime();
    }
}
