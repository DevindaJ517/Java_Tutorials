import java.util.Scanner;

// Simple example showing how to read user input from the console using Scanner
class test {
    public static void main (String args []){
        // Create a Scanner that reads from standard input (System.in)
        // Scanner provides convenient methods like nextLine(), nextInt(), next(), etc.
        Scanner readinput = new Scanner(System.in);

        // Prompt the user. Note: System.out.print leaves the cursor on the same line.
        System.out.print("Enter your name: ");

        // Read an entire line of text (until the user presses Enter).
        // nextLine() returns a String and includes spaces typed by the user.
        String name = readinput.nextLine();

        // Print a greeting using the value the user entered.
        System.out.println("Hello, " + name + "!");

        // It's good practice to close the Scanner when you're done to free resources.
        // Note: closing a Scanner that wraps System.in will also close System.in for the JVM.
        // If other parts of the program need to read from System.in afterward, avoid closing it.
        readinput.close();
    }
}