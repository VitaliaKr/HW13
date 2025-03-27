package comp;

public class Memory {
    private MemoryType type;
    private int volume;
    private double weight;

    public Memory(MemoryType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\ntype=" + type + "\nvolume=" + volume + "\nweight=" + weight;
    }
}
