package calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Calculator Application");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                add addition = new add();
                System.out.println("Result: " + addition.addTwoNumbers(0, 0));
                break;
            case 2:
                substract subtraction = new substract();
                System.out.println("Result: " + subtraction.substractTwoNumbers(0, 0));
                break;
            case 3:
                multifly multiplication = new multifly();
                System.out.println("Result: " + multiplication.multiflyTwoNumbers(0, 0));
                break;
            case 4:
                divide division = new divide();
                System.out.println("Result: " + division.divideTwoNumbers(0, 0));
                break;
            case 5:
                squre squaring = new squre();
                System.out.println("Result: " + squaring.squreNumber(0));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
