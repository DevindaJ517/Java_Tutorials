package calculator;

import java.util.Scanner;

public class add {
    public int addTwoNumbers(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        return a + b;
    }   
}
