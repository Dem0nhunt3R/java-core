package lesson2.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ram {
    private int volume;
    private String producer;
    private String model;
    private int frequency;

    public void changeRamVolume(){
        System.out.println("Ram volume was changed");
    }

    public void changeRamProducer(){
        System.out.println("Ram producer was changed");
    }

    public void changeRamModel(){
        System.out.println("Ram model was changed");
    }
    public void changeRamFrequency(){
        System.out.println("Ram frequency was changed");
    }
}
