package Lab3;

import java.util.Scanner;

public class Task5 {

    static class Bank {
        public String accountNumber;
        public String name;
        public Double balance;

        public Bank(String accountNumber, String name, Double balance) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited " + amount + "$");
            } else {
                System.out.println("Invalid deposit attempt!");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount!");
            } else if (amount > balance) {
                System.out.println("Insufficient balance! Current balance is " + balance + "$");
            } else {
                balance -= amount;
                System.out.println("Successfully withdrew $" + amount);
            }
        }

        public void displayAccount() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + name);
            System.out.println("Current Balance: " + balance + "$");
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number of Customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Bank[] accounts = new Bank[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Customer " + (i + 1) + " ---");
            String accNum;
            while (true) {
                System.out.print("Enter 14-digit Account Number: ");
                accNum = sc.nextLine();
                if (accNum.matches("\\d{14}")) {
                    break;
                }
                System.out.println("Error: Account number must be exactly 14 digits!");
            }

            System.out.print("Input Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Input Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            accounts[i] = new Bank(accNum, name, balance);
        }
        int choice; 
        do {
            System.out.println("\n=== BANKING SYSTEM MENU ===");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter 14-digit Account Number: ");
                String searchAcc = sc.nextLine();

                Bank target = findAccount(accounts, searchAcc);
                if (target != null) {
                    if (choice == 1) {
                        System.out.print("Enter deposit amount: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        target.deposit(amount);
                    } else {
                        System.out.print("Enter withdrawal amount: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        target.withdraw(amount);
                    }
                    System.out.println("\n--- Updated Account Details ---");
                    target.displayAccount();
                } else {
                    System.out.println("Account not found!");
                }
            } else if (choice == 3) {
                System.out.println("\n=== ALL ACCOUNTS DETAILS ===");
                for (Bank acc : accounts) {
                    acc.displayAccount();
                }
            }
        } while (choice != 4);
        System.out.println("Thank you for using the Banking System!");
        sc.close();
    }
    private static Bank findAccount(Bank[] accounts, String accNum) {
        for (Bank acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                return acc;
            }
        }
        return null;
    }
}