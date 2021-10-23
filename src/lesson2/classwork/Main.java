package lesson2.classwork;

public class Main {
    public static void main(String[] args) {

        PC pc = new PC(
                "model",
                new CPU("CPU model", 1,1,"CPU producer"),
                new Motherboard("motherboard model","motherboard producer"),
                new Ram(1,"ram producer","ram model",1),
                new HardDrive("hard drive producer", HardDriveType.HDD)
        );

        System.out.println(pc);
        pc.changeCPUModel();
        pc.changeCPUFrequency();
        pc.changeCPUGeneration();
        pc.changeCPUProducer();
        pc.changeMotherboardModel();
        pc.changeMotherboardProducer();
        pc.changeHardDriveProducer();
        pc.changeHardDriveType();
        pc.changeRamVolume();
        pc.changeRamProducer();
        pc.changeRamModel();
        pc.changeRamFrequency();
    }
}
