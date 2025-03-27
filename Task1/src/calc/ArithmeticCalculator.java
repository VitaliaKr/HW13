package calc;

public class ArithmeticCalculator {
    private double a;
    private double b;

    public ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation type) {
        if (type == Operation.ADD) {
            System.out.println("Сумма чисел " + a + " и " + b + " равно " + (a + b));
        } else if (type == Operation.MULTIPLY) {
            System.out.println("Произведение чисел " + a + " и " + b + " равно " + (a * b));
        } else if (type == Operation.SUBTRACT) {
            System.out.println("Разность чисел " + a + " и " + b + " равна " + (a > b ? (a - b) : (b - a)));
        } else {
            System.out.println("Нет такой опции");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
