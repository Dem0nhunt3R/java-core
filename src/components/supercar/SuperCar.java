package components.supercar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SuperCar {
    private String carModel;
    private String producer;
    private int year;
    private Engine engine;

    public double volumeIncrease(double increaseVolume) {
        return engine.getVolume() + increaseVolume;
    }

    public double powerDecrease() {
        return engine.getPower() * 0.9;
    }

    public SuperCar(
            String carModel,
            String producer,
            int year,
            String engineModel,
            double volume,
            int power) {
        this.carModel = carModel;
        this.producer = producer;
        this.year = year;
        this.engine = new Engine(engineModel, volume, power);
    }

}
