package lesson2.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PC {
    private String model;
    private CPU cpu;
    private Motherboard motherboard;
    private Ram ram;
    private HardDrive hardDrive;

    public void changeCPUModel(){
        this.cpu.changeCPUModel();
    }

    public void changeCPUFrequency(){
        this.cpu.changeCPUFrequency();
    }

    public void changeCPUGeneration(){
        this.cpu.changeCPUGeneration();
    }

    public void changeCPUProducer(){
        this.cpu.changeCPUProducer();
    }

    public void changeMotherboardModel(){
        this.motherboard.changeMotherboardModel();
    }

    public void changeMotherboardProducer(){
        this.motherboard.changeMotherboardProducer();
    }

    public void changeHardDriveProducer(){
        this.hardDrive.changeHardDriveProducer();
    }

    public void changeHardDriveType(){
        this.hardDrive.changeHardDriveType();
    }

    public void changeRamVolume(){
        this.ram.changeRamVolume();
    }

    public void changeRamProducer(){
        this.ram.changeRamProducer();
    }

    public void changeRamModel(){
        this.ram.changeRamModel();
    }

    public void changeRamFrequency(){
        this.ram.changeRamFrequency();
    }
}
