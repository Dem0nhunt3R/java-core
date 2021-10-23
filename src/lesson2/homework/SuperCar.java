package lesson2.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperCar {
    private String model;
    private String producer;
    private int year;
    private Engine engine;

    public void volumeIncrease(double inc) {
        engine.setVolume(engine.getVolume() + inc);
    }

    public void powerDecrease(){
        engine.setPower(engine.getPower()/100*90);
    }
}
