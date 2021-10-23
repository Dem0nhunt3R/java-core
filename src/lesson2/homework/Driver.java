package lesson2.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private String name;
    private String  surname;
    private int age;
    private double experience;
}
