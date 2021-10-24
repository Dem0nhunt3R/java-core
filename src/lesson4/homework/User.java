package lesson4.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private ArrayList<Skill> skills;
    private Car car;

    public User(int id, String name, String surname, String email, Gender gender,
                ArrayList<Skill> skills, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model, year, power);
    }

    @Override
    public int compareTo(User user) {
        return this.skills.size()-user.getSkills().size();
    }
}
