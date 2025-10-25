# get_inputs/test.java — User input example

This small program demonstrates how to read a line of text from the console using `java.util.Scanner`.

File: `get_inputs/test.java`

What it does
- Prompts the user with "Enter your name: "
- Reads the full input line using `Scanner.nextLine()`
- Prints a greeting: "Hello, <name>!"

How to compile

From the project root (Windows PowerShell):

```powershell
cd 'C:\Users\Intel\Documents\Cleverly\Java_Tutorials\get_inputs'
javac test.java
```

How to run

Interactive run (type your name and press Enter):

```powershell
java test
```

Non-interactive run (pipe a sample name):

```powershell
"Alice" | java test
```

Notes and tips
- `Scanner` supports multiple read methods: `nextLine()` (whole line), `next()` (next token), `nextInt()`, `nextDouble()`, etc.
- `nextLine()` reads until the end of the current line. If you mix `nextInt()` and `nextLine()` be careful: `nextInt()` does not consume the trailing newline.
- Closing the `Scanner` (with `close()`) will close the wrapped `InputStream` (System.in). If your program needs to read more input afterwards, avoid closing `System.in`.
- For production or more complex input handling consider using `BufferedReader` or `Console` (for password input) depending on needs.

If you'd like, I can add examples showing `nextInt()` with error handling, or show how to keep System.in open while using a Scanner.
