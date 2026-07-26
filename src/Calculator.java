public class Calculator {

    // Basic Operations
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println(" Error! Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }
    public double power(double base, double exponent) {
    return Math.pow(base, exponent);
        
    }
}