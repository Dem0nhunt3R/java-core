package components.human;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Human {
    private int id;
    private String  name;
    private String  surname;
    private int age;
    private Gender gender;
}

