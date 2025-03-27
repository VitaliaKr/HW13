package comp;

public class Keyboard {
    private KeyboardType type;
    private KeyboardLight light;
    private double weight;

    public Keyboard(KeyboardType type, KeyboardLight light, double weight) {
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\ntype: " + type + "\nlight: " + light + "\nweight: " + weight;
    }
}
