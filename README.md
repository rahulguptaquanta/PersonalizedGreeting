# Personalized Greeting

A beginner-friendly Java console application that collects a user's name and age, validates the input, and prints a personalized greeting.

## Features

- Reads the user's name using `Scanner`
- Rejects an empty name
- Validates that age is a whole number from 0 to 100
- Displays a personalized greeting
- Calculates how many years remain until age 100
- Uses no external libraries

## Project Structure

```text
PersonalizedGreeting/
├── src/
│   └── com/
│       └── internship/
│           └── greeting/
│               └── PersonalizedGreeting.java
├── docs/
│   └── EXPLANATION.md
├── README.md
└── .gitignore
```

## Requirements

- Java Development Kit (JDK) 8 or later
- Terminal / Command Prompt

## Compile

Run these commands from the project root directory:

```bash
javac -d out src/com/internship/greeting/PersonalizedGreeting.java
```

## Run

```bash
java -cp out com.internship.greeting.PersonalizedGreeting
```

## Sample Output

```text
Enter your name: Rahul Gupta
Enter your age (0-100): 23

Hello, Rahul Gupta! Welcome to Java Programming.
You are 23 years old.
You have 77 years until you turn 100.
```

## Concepts Used

- Java class and `main` method
- Variables and data types
- `Scanner` for standard input
- `while` loops for validation
- `try-catch` for invalid numeric input
- `printf` for formatted output

## Author

Rahul Gupta
