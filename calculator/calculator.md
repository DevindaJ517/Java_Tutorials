# Calculator (calculator/main.java)

This simple console calculator demonstrates a menu-driven Java program using `Scanner` for input and a small class-per-operation design.

Contents
- `main.java` — entry point (package `calculator`). The program prints a menu, reads a numeric choice, and dispatches to helper classes for operations (add, substract, multifly, divide, squre).

Quick notes
- The source file declares `package calculator;` so compilation and execution should respect the package structure.
- The class is declared as `public class main` (lowercase). Java allows this, but by convention class names are capitalized (e.g., `Main`). Renaming is optional — if you change the class name, remember to update the filename and package references.

How to compile

From the project root (PowerShell):

```powershell
# Compile the calculator package and place .class files in the package directory
cd 'C:\Users\Intel\Documents\Cleverly\Java_Tutorials'
javac -d . calculator\main.java

# If there are helper classes in the same package (e.g. add.java, substract.java), compile them too:
javac -d . calculator\*.java
```

How to run

Run from the project root, specifying the fully-qualified class name (package + class):

```powershell
# Note: use the package name followed by the class name
java calculator.main
```

Sample interactive session

When you run `java calculator.main` you should see a menu like:

```
Calculator Application
Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Square
```

Type the number of the operation you want, then press Enter. The program currently calls the corresponding operation class with placeholder values (0, 0), so you may want to modify `main.java` to read the operands from the user before calling the operation methods.

Suggested improvements
- Read operands from the user using `Scanner` before calling the operation methods, instead of passing hard-coded zeros.
- Rename classes and files to follow Java naming conventions (e.g., `Main`, `Add`, `Subtract`, `Multiply`, `Divide`, `Square`). Filenames should match public class names.
- Add input validation and error handling (e.g., handle non-numeric input, check division by zero).
- Group related operation classes in the same `calculator` package (already done) and document their API (method names and expected parameters).

Example change to accept two operands (quick idea)

Replace the operation call section for addition with:

```java
System.out.print("Enter first number: ");
double a = scanner.nextDouble();
System.out.print("Enter second number: ");
double b = scanner.nextDouble();
add addition = new add();
System.out.println("Result: " + addition.addTwoNumbers(a, b));
```

If you'd like, I can:
- Update `main.java` to read operands from the user and pass them to the operation classes.
- Rename classes to follow Java conventions and update filenames accordingly.
- Add simple implementations for the operation classes if any are missing.
