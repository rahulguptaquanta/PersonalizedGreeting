# Java Concepts Used

## 1. Class and main method

`PersonalizedGreeting` is the class containing the application. The `main` method is the entry point that Java runs first.

## 2. Variables and data types

- `String name` stores the user's name.
- `int age` stores the user's age.
- The program uses integer arithmetic to calculate `100 - age`.

## 3. Scanner and input

`Scanner` reads text from standard input. The program reads each answer as a line, which allows it to handle invalid numeric input without terminating unexpectedly.

## 4. Input validation

The program asks again when the name is empty or the age is outside the range 0–100. `Integer.parseInt` converts the age text to an integer, and `NumberFormatException` is caught when the input is not a whole number.

## 5. Formatted output

`System.out.printf` displays the user's name and age in a formatted greeting.

## 6. Resource handling

The `Scanner` is closed after the program has finished reading input.
