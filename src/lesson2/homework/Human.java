package lesson2.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Human {
    private int id;
    private String  name;
    private String   surname;
    private Gender gender;
}
