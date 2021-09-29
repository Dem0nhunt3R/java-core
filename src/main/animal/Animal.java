package main.animal;

public class Animal {
    private String animalName;
    private int age;
    private String animalType;

    public Animal(String animalName, int age, String animalType) {
        this.animalName = animalName;
        this.age = age;
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age=" + age +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
