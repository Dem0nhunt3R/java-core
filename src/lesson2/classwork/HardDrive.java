package lesson2.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HardDrive {
    private String producer;
    private HardDriveType type;

    public void changeHardDriveProducer(){
        System.out.println("Hard drive producer was changed");
    }

    public void changeHardDriveType(){
        System.out.println("Hard drive type was changed");
    }
}
