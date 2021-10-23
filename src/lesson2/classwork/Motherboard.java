package lesson2.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Motherboard {
    String model;
    String producer;

    public void changeMotherboardModel(){
        System.out.println("Motherboard model was changed");
    }

    public void changeMotherboardProducer(){
        System.out.println("Motherboard producer was changed");
    }
}
