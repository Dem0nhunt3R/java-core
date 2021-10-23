package lesson2.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engine {
    private String  model;
    private double volume;
    private int power;
}
