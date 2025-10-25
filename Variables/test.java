class test {
    public static void main (String args []){
        // double: double-precision 64-bit floating point
        double pi = 3.141592653589793;

        // float: single-precision 32-bit floating point (suffix f required)
        float approxPi = 3.14f;

        // integer types
        byte smallNumber = 10;           // 8-bit signed integer
        short shortNumber = 32000;       // 16-bit signed integer
        int radius = 5;                  // 32-bit signed integer (typical default)
        long largeNumber = 123456789L;   // 64-bit signed integer (suffix L recommended)

        // char: single 16-bit Unicode character
        char letter = 'A';

        // boolean: true/false
        boolean isReady = true;

        // String: reference type (not a primitive) for text
        String message = "Area of the circle:";

        // final: constant value (cannot be reassigned)
        final double PI_CONST = 3.141592653589793;

        // compute area using double PI_CONST and int radius
        double area = PI_CONST * radius * radius;

        // print results with short explanations (demonstration)
        System.out.println(message + " " + area);
        System.out.println("Using float approxPi: " + approxPi);
        System.out.println("byte smallNumber: " + smallNumber);
        System.out.println("short shortNumber: " + shortNumber);
        System.out.println("int radius: " + radius);
        System.out.println("long largeNumber: " + largeNumber);
        System.out.println("char letter: " + letter);
        System.out.println("boolean isReady: " + isReady);
        System.out.println("final PI_CONST: " + PI_CONST);
    }
}

