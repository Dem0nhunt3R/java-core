import components.car.Car;
import components.driver.Driver;
import components.human.Gender;
import components.human.Human;
import components.supercar.SuperCar;

public class Main {
    public static void main(String[] args) {
//        1.
//        Створити клас Human з полями:
//        id name surname age gender(Enum)
//        Створити ArrayList з 10 об'єктами Human

        Human human1 = new Human(1, "human1", "1", 1, Gender.MALE);

//        2. Створити клас Car з полями id, model, driver
//        поле driver має тип Driver полями - name,surname,age,experience
//        Створити 10 автівок, для кожної автівки створити окремого водія
//        Використати композицію і агрегацію.
        Driver driver1 = new Driver("driver1", "1", 1, 1);
        Car car1 = new Car(1, "car1", driver1);
        Car car2 = new Car(2, "car2", "driver2", "2", 2, 2);
        Car car3 = new Car(3, "car3", "driver3", "3", 3, 3);
        Car car4 = new Car(4, "car4", "driver4", "4", 4, 4);
        Car car5 = new Car(5, "car5", "driver5", "5", 5, 5);
        Car car6 = new Car(6, "car6", new Driver("driver6", "6", 6, 6));
        Car car7 = new Car(7, "car7", new Driver("driver7", "7", 7, 7));
        Car car8 = new Car(8, "car8", new Driver("driver8", "8", 8, 8));
        Car car9 = new Car(9, "car9", new Driver("driver9", "9", 9, 9));
        Car car10 = new Car(10, "car10", new Driver("driver10", "10", 10, 10));
//    3. Створити клас SuperCar з полями model, producer, year, Engine
//    Engine має поля: model, volume, power;
//    Створити 10 автівок з двигунами.
//    В SuperCar Створити метод який:
//            - збільшує об'єм двигуна на визначену кількість
//            - зменшує потужніть на 10%
        SuperCar superCar1 = new SuperCar("superCar1", "producer1", 1, "engineModel1", 1, 1);
        SuperCar superCar2 = new SuperCar("superCar2", "producer2", 2, "engineModel2", 2, 2);
        SuperCar superCar3 = new SuperCar("superCar3", "producer3", 3, "engineModel3", 3, 3);
        SuperCar superCar4 = new SuperCar("superCar4", "producer4", 4, "engineModel4", 4, 4);
        SuperCar superCar5 = new SuperCar("superCar5", "producer5", 5, "engineModel5", 5, 5);
        SuperCar superCar6 = new SuperCar("superCar6", "producer6", 6, "engineModel6", 6, 6);
        SuperCar superCar7 = new SuperCar("superCar7", "producer7", 7, "engineModel7", 7, 7);
        SuperCar superCar8 = new SuperCar("superCar8", "producer8", 8, "engineModel8", 8, 8);
        SuperCar superCar9 = new SuperCar("superCar9", "producer9", 9, "engineModel9", 9, 9);
        SuperCar superCar10 = new SuperCar("superCar10", "producer10", 10, "engineModel10", 10, 10);

        double i = superCar1.volumeIncrease(20);
        double a = superCar2.powerDecrease();
        System.out.println(i);
        System.out.println(a);
    }


}
