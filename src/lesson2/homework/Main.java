package lesson2.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        1.
//        Створити клас Human з полями:
//        id name surname age gender(Enum)
//        Створити ArrayList з 10 об'єктами Human

        ArrayList<Human> humansList = new ArrayList<>();

        Human human1 = new Human(1, "human", "1", Gender.MALE);
        humansList.add(human1);
        Human human2 = new Human(2, "humana", "2", Gender.FEMALE);
        humansList.add(human2);
        Human human3 = new Human(3, "human", "3", Gender.MALE);
        humansList.add(human3);
        Human human4 = new Human(4, "humana", "4", Gender.FEMALE);
        humansList.add(human4);
        Human human5 = new Human(5, "human", "5", Gender.MALE);
        humansList.add(human5);
        Human human6 = new Human(6, "humana", "6", Gender.FEMALE);
        humansList.add(human6);
        Human human7 = new Human(7, "human", "7", Gender.MALE);
        humansList.add(human7);
        Human human8 = new Human(8, "humana", "8", Gender.FEMALE);
        humansList.add(human8);
        Human human9 = new Human(9, "human", "9", Gender.MALE);
        humansList.add(human9);
        Human human10 = new Human(10, "humana", "10", Gender.FEMALE);
        humansList.add(human10);

        for (Human human : humansList) {
            System.out.println(human);
        }


//        2. Створити клас Car з полями id, model, driver
//        поле driver має тип Driver полями -name, surname, age, experience
//        Створити 10 автівок, для кожної автівки створити окремого водія
//        Використати композицію і агрегацію.

        ArrayList<Car> carsList = new ArrayList<>();

        Driver driver1 = new Driver("driver", "1", 1, 1.0);
        Car car1 = new Car(1, "model", driver1);
        carsList.add(car1);
        Driver driver2 = new Driver("driver", "2", 1, 1.0);
        Car car2 = new Car(2, "model", driver2);
        carsList.add(car2);
        Driver driver3 = new Driver("driver", "3", 1, 1.0);
        Car car3 = new Car(3, "model", driver3);
        carsList.add(car3);

        Car car4 = new Car(4, "model", new Driver("driver", "4", 1, 1.0));
        carsList.add(car4);
        Car car5 = new Car(5, "model", new Driver("driver", "5", 1, 1.0));
        carsList.add(car5);
        Car car6 = new Car(6, "model", new Driver("driver", "6", 1, 1.0));
        carsList.add(car6);

        Car car7 = new Car(7, "model", "driver", "7", 1, 1.0);
        carsList.add(car7);
        Car car8 = new Car(8, "model", "driver", "8", 1, 1.0);
        carsList.add(car8);
        Car car9 = new Car(9, "model", "driver", "9", 1, 1.0);
        carsList.add(car9);
        Car car10 = new Car(10, "model", "driver", "10", 1, 1.0);
        carsList.add(car10);

        for (Car car : carsList) {
            System.out.println(car);
        }

//        3. Створити клас SuperCar з полями model, producer, year, Engine
//        Engine має поля: model, volume, power;
//        Створити 10 автівок з двигунами.
//                В SuperCar Створити метод який:
//        - збільшує об'єм двигуна на визначену кількість
//        - зменшує потужніть на 10%
        SuperCar superCar1 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar2 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar3 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar4 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar5 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar6 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar7 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar8 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar9 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
        SuperCar superCar10 = new SuperCar(
                "model",
                "producer",
                1111,
                new Engine("model", 2.0, 300));
    }
}
