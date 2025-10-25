# Java variable types used in `test.java`

This file documents the variable types and examples shown in `test.java`.

## Primitive types

- byte: 8-bit signed integer. Range: -128 to 127.
  - Example: `byte smallNumber = 10;`

- short: 16-bit signed integer. Range: -32,768 to 32,767.
  - Example: `short shortNumber = 32000;`

- int: 32-bit signed integer. Common default integer type.
  - Example: `int radius = 5;`

- long: 64-bit signed integer. Use `L` suffix for literals when needed.
  - Example: `long largeNumber = 123456789L;`

- float: 32-bit floating point. Use `f` suffix for literals.
  - Example: `float approxPi = 3.14f;`

- double: 64-bit floating point. Higher precision than float.
  - Example: `double pi = 3.141592653589793;`

- char: 16-bit Unicode character.
  - Example: `char letter = 'A';`

- boolean: logical type with values `true` or `false`.
  - Example: `boolean isReady = true;`

## Reference types

- String: an object representing text (not a primitive). Immutable.
  - Example: `String message = "Area of the circle:";`

## Constants

- final: used to declare constants that cannot be reassigned.
  - Example: `final double PI_CONST = 3.141592653589793;`

## Notes & tips

- Choose `int` for general integer arithmetic unless you need a smaller type for memory or a larger type (`long`) for very large numbers.
- Use `double` for decimal numbers unless you need to store many values in memory-constrained environments (then `float`).
- `char` stores a single Unicode character; use single quotes `'a'`.
- `String` is the usual way to handle text. Concatenate with `+` or use `String.format`.
- When printing, Java will automatically convert primitives to readable text using `System.out.println`.

If you want, I can expand this file with ranges for float/double, examples of arrays, or examples showing casting between types.
