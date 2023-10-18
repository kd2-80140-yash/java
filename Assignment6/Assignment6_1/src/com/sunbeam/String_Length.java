package com.sunbeam;


class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class String_Length {
    public static void main(String[] args) {
        try {
            // Read a string from the user
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Calculate the length of the input string
            int length = input.length();

            // Check if the length exceeds 80 characters
            if (length > 80) {
                throw new ExceptionLineTooLong("The string is too long");
            }

            // If the string is within the limit, print its length
            System.out.println("String length is: " + length);
        } catch (ExceptionLineTooLong e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
        }
    }
}



