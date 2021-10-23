package lesson1.classwork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cinderella> cinderellasList = new ArrayList<>();

        Cinderella cinderella1 = new Cinderella("biba1", 1, 30);
        cinderellasList.add(cinderella1);
        Cinderella cinderella2 = new Cinderella("biba2", 1, 31);
        cinderellasList.add(cinderella2);
        Cinderella cinderella3 = new Cinderella("biba3", 1, 32);
        cinderellasList.add(cinderella3);
        Cinderella cinderella4 = new Cinderella("biba4", 1, 33);
        cinderellasList.add(cinderella4);
        Cinderella cinderella5 = new Cinderella("biba5", 1, 34);
        cinderellasList.add(cinderella5);
        Cinderella cinderella6 = new Cinderella("biba6", 1, 35);
        cinderellasList.add(cinderella6);
        Cinderella cinderella7 = new Cinderella("biba7", 1, 36);
        cinderellasList.add(cinderella7);
        Cinderella cinderella8 = new Cinderella("biba8", 1, 37);
        cinderellasList.add(cinderella8);
        Cinderella cinderella9 = new Cinderella("biba9", 1, 38);
        cinderellasList.add(cinderella9);
        Cinderella cinderella10 = new Cinderella("biba10", 1, 39);
        cinderellasList.add(cinderella10);

        Prince prince = new Prince("boba", 100, 33);

        for (Cinderella cinderella : cinderellasList) {
            if (cinderella.getFootSize() == (prince.getFoundedShoe()))
                System.out.println("This is my princess => " + cinderella.getName());
        }
    }
}
