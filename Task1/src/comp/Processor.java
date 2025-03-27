package comp;

public class Processor {
    private ProcessorTypes type;
    private ProcessorAmount amount;
    private ProcessorManufactory manufactory;
    private double weight;

    public Processor(ProcessorTypes type, ProcessorAmount amount, ProcessorManufactory manufactory, double weight) {
        this.type = type;
        this.amount = amount;
        this.manufactory = manufactory;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\ntype=" + type + "\namount=" + amount + "\nmanufactory=" + manufactory + "\nweight=" + weight;
    }
}
