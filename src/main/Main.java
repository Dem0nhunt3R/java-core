package main;

import cinderella.Cinderella;
import prince.Prince;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cinderella> cinderellas = new ArrayList<>();

        Cinderella cinderella1 = new Cinderella("Cinderella1", 1, 30);
        cinderellas.add(cinderella1);
        Cinderella cinderella2 = new Cinderella("Cinderella2", 2, 31);
        cinderellas.add(cinderella2);
        Cinderella cinderella3 = new Cinderella("Cinderella3", 3, 33);
        cinderellas.add(cinderella3);
        Cinderella cinderella4 = new Cinderella("Cinderella4", 4, 34);
        cinderellas.add(cinderella4);
        Cinderella cinderella5 = new Cinderella("Cinderella5", 5, 35);
        cinderellas.add(cinderella5);
        Cinderella cinderella6 = new Cinderella("Cinderella6", 6, 36);
        cinderellas.add(cinderella6);
        Cinderella cinderella7 = new Cinderella("Cinderella7", 7, 37);
        cinderellas.add(cinderella7);
        Cinderella cinderella8 = new Cinderella("Cinderella8", 8, 38);
        cinderellas.add(cinderella8);
        Cinderella cinderella9 = new Cinderella("Cinderella9", 9, 39);
        cinderellas.add(cinderella9);
        Cinderella cinderella10 = new Cinderella("Cinderella10", 10, 40);
        cinderellas.add(cinderella10);
        Prince prince = new Prince("Price", 100, 35);

        for (Cinderella cinderella : cinderellas) {
            if(prince.getFoundedShoe()==cinderella.getFootSize())
                System.out.println("That is my bitch"+" "+cinderella.getName());
        }
    }
}
