import calc.ArithmeticCalculator;
import calc.Operation;
import comp.*;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calc1 = new ArithmeticCalculator(5, 2);
        calc1.calculate(Operation.ADD);
        calc1.calculate((Operation.MULTIPLY));
        calc1.calculate(Operation.SUBTRACT);
        Processor proc1 = new Processor(ProcessorTypes.HIGH, ProcessorAmount.MEDIUM, ProcessorManufactory.INTEL, 0.1);
        Memory mem1 = new Memory(MemoryType.DDR5, 4, 0.1);
        Disk disk1 = new Disk(DiskTypes.HDD, 5, 0.2);
        Display display1 = new Display(14.3, DisplayType.IPS, 0.1);
        Keyboard keyboard1 = new Keyboard(KeyboardType.MEMBRANE, KeyboardLight.DYNAMIC, 0.1);
        Computer comp1 = new Computer(proc1,mem1,disk1,display1,keyboard1);
        System.out.println(comp1.getDisk());
        System.out.println("Вес компа: " + comp1.computerWeight());
        System.out.println(comp1.toString());
    }
}