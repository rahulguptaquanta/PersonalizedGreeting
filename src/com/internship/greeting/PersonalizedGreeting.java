package com.internship.greeting;

import java.util.Scanner;

public class PersonalizedGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Enter your name: ");
            name = scanner.nextLine().trim();
        }

        int age = -1;

        while (age < 0 || age > 100) {
            System.out.print("Enter your age (0-100): ");

            try {
                age = Integer.parseInt(scanner.nextLine().trim());

                if (age < 0 || age > 100) {
                    System.out.println("Please enter an age between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }

        System.out.printf("%nHello, %s! Welcome to Java Programming.%n", name);
        System.out.printf("You are %d years old.%n", age);
        System.out.printf("You have %d years until you turn 100.%n", 100 - age);

        scanner.close();
    }
}
