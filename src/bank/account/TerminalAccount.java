package bank.account;

import java.util.Scanner;

public class TerminalAccount {
    public static void main (String [] args){
        System.out.println("=================================");
        System.out.println("\"Welcome to Sapphire Bank!\"");
        System.out.println("=================================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String clientName = scanner.nextLine();
        System.out.println("Hello, " + clientName + "Welcome to Sapphire Bank");

        System.out.println("Enter your Tax ID Number (TIN): ");
        String taxIdNumber = scanner.nextLine();

        System.out.println("Please provide your email address.");
        String email = scanner.nextLine();

        System.out.println("Finally, enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Congratulations, your account has been successfully created.");






    }
}
