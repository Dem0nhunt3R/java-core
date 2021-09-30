package cinderella;

import java.util.Objects;

public class Cinderella {
    private String name;
    private int age;
    private int footSize;

    public Cinderella(String name, int age, int footSize) {
        this.name = name;
        this.age = age;
        this.footSize = footSize;
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

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Cinderella{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", footSize=" + footSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinderella that = (Cinderella) o;
        return age == that.age && footSize == that.footSize && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, footSize);
    }
}
