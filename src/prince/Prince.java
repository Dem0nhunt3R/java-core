package prince;

import java.util.Objects;

public class Prince {
    String name;
    int age;
    int foundedShoe;

    public Prince(String name, int age, int foundedShoe) {
        this.name = name;
        this.age = age;
        this.foundedShoe = foundedShoe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFoundedShoe() {
        return foundedShoe;
    }

    public void setFoundedShoe(int foundedShoe) {
        this.foundedShoe = foundedShoe;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", foundedShoe=" + foundedShoe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prince prince = (Prince) o;
        return age == prince.age && foundedShoe == prince.foundedShoe && Objects.equals(name, prince.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, foundedShoe);
    }
}
