package comp;


public class Computer {
    private static final String VENDOR = "apple";
    private static final String NAME = "Perf";
    private Processor processor;
    private Memory memory;
    private Disk disk;
    private Display display;
    private Keyboard keyboard;

    public Computer(Processor processor, Memory memory, Disk disk, Display display, Keyboard keyboard) {
        this.processor = processor;
        this.memory = memory;
        this.disk = disk;
        this.display = display;
        this.keyboard = keyboard;
    }

    public double computerWeight(){
        return processor.getWeight()+ memory.getWeight() + disk.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Характеристики компа:\n" +
                "процессор: " + processor +
                "\nпамять: " + memory +
                "\nдиск: " + disk +
                "\nэкран: " + display +
                "\nклавиатура: " + keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

}
