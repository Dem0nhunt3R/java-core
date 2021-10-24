package lesson3.homework.clothes;


import lesson3.homework.clothes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atelier {
    private ArrayList<Clothes> clothesList;

    public ArrayList<Clothes> manChoice(ArrayList<Clothes> clothesList) {
        ArrayList<Clothes> manChoiceList = new ArrayList<>();
        for (Clothes clothes : clothesList) {
            if (clothes instanceof IManClothes)
                manChoiceList.add(clothes);
        }
        return manChoiceList;
    }

    public ArrayList<Clothes> womanChoice(ArrayList<Clothes> clothesList) {
        ArrayList<Clothes> womanChoiceList = new ArrayList<>();
        for (Clothes clothes : clothesList) {
            if (clothes instanceof IWomanClothes)
                womanChoiceList.add(clothes);
        }
        return womanChoiceList;
    }
}
