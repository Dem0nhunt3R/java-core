package lesson3.homework.clothes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Tshirt extends Clothes implements IManClothes, IWomanClothes {
    @Override
    public void manSuiteUp() {

    }

    @Override
    public void womanSuiteUp() {

    }
}
