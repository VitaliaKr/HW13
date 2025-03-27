import calc.ArithmeticCalculator;
import calc.Operation;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calc1 = new ArithmeticCalculator(5,2);
        calc1.calculate(Operation.ADD);
        calc1.calculate((Operation.MULTIPLY));
        calc1.calculate(Operation.SUBTRACT);
    }
}