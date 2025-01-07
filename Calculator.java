import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");
        
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter any function (add, sub, mul, div): ");
        String choice = sc.next();
        
        double result = 0.0;
        boolean validChoice = true;
        
        switch (choice.toLowerCase()) {
            case "add":
                result = add(a, b);
                break;
            case "sub":
                result = sub(a, b);
                break;
            case "mul":
                result = mul(a, b);
                break;
            case "div":
                if (b != 0) {
                    result = div(a, b);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validChoice = false;
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose from add, sub, mul, div.");
                validChoice = false;
        }
        
        if (validChoice) {
            System.out.println("The result of " + choice + " operation is: " + result);
        }
        
        sc.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
