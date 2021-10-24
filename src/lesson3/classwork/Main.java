package lesson3.classwork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play()
//        Гитара содержит переменные класса количествоСтрун,
//        Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента,
//        который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".

        ArrayList<Instrument>instruments = new ArrayList<>();
        Guitar guitar = new Guitar(new StringsNumber(5));
        Drum drum = new Drum(new DrumSize(50));
        Trumpet trumpet = new Trumpet(new TrumpetDiameter(20));
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(trumpet);

        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());
        }
    }
}
