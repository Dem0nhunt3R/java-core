package components.car;

import components.driver.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
            double exp) {
        this.id = id;
        this.model = model;
        this.driver = new Driver(name, surname, age, exp);
    }
}
