package lesson1.homework;

public class Animal {
    private String name;
    private int age;
    private String type;

    public Animal() {
    }

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\''+
                '}';
    }
}
