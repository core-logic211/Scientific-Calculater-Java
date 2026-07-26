import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("\n==============================");
            System.out.println("   SCIENTIFIC CALCULATOR");
            System.out.println("==============================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Exit");

            System.out.print("\nChoose an option: ");
            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Thank you for using the calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = 0;

            switch (choice) {

                case 1:
                    result = calculator.add(a, b);
                    break;

                case 2:
                    result = calculator.subtract(a, b);
                    break;

                case 3:
                    result = calculator.multiply(a, b);
                    break;

                case 4:
                    result = calculator.divide(a, b);
                    break;

                case 5:
                    System.out.print("Enter base: ");
                     a = sc.nextDouble();

                    System.out.print("Enter exponent: ");
                      b = sc.nextDouble();

                    result = calculator.power(a, b);

                    System.out.println("Result = " + result);
                     break;    

                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }

            if (!Double.isNaN(result)) {
                System.out.println("Result = " + result);
            }
        }

        sc.close();
    }
}