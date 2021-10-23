package lesson2.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CPU {
    private String model;
    private int frequency;
    private int generation;
    private String producer;

    public void changeCPUModel() {
        System.out.println("CPU model was changed");
    }

    public void changeCPUFrequency(){
        System.out.println("CPU frequency was changed");
    }

    public void changeCPUGeneration(){
        System.out.println("CPU generation was changed");
    }

    public void changeCPUProducer(){
        System.out.println("CPU producer was changed");
    }
}
