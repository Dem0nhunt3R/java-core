package lesson2.classwork;

public class Main {
    public static void main(String[] args) {

//        Описати наступну структуру:
////        PC
////        string model
////        CPU cpu
////        Motherboard motherboard
////        Ram ram
////        HardDrive hard
////
////        CPU
////        string model
////        int frequency
////        int generation
////        string producer
////
////        Motherboard
////                model
////        string producer
////
////        Ram
////        int volume
////        string producer
////        string model
////        int frequency
////
////        HardDrive
////        string producer
////        int volume
////        enum Type (ssd / hdd)
////
////Делегувати до PC можливість зміни всіх характеристик складових частин (приклад: PC повинен мати методи які змінюють
// volume в Ram, frequency в CPU і тд)

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
