package comp;

public class Display {
    private double diagonal;
    private DisplayType type;
    private double weight;

    public Display(double diagonal, DisplayType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\ndiagonal: " + diagonal + "\ntype: " + type + "\nweight: " + weight;
    }
}
