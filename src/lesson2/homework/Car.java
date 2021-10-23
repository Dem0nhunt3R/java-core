package lesson2.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    private String model;
    private Driver driver;

    public Car(
            int id,
            String model,
            String name,
            String surname,
            int age,
            double experience) {
        this.id=id;
        this.model=model;
        this.driver=new Driver(name,surname,age, experience);
    }
}
