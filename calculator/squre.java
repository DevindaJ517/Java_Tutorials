package calculator;

import java.util.Scanner;

public class squre {
    public int squreNumber(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        return a * a;
    }
}
