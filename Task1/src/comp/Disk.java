package comp;

public class Disk {
    private DiskTypes type;
    private double volume;
    private double weight;

    public Disk(DiskTypes type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\ntype = " + type + ",\nvolume = " + volume + ",\nweight = " + weight;
    }
}
