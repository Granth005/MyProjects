package Expensechecker;

import java.util.ArrayList;
import java.util.Scanner;

public class checkexpense {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> descriptionsFor = new ArrayList<>();
        ArrayList<Double> amounts = new ArrayList<>();
        Boolean run = true;

        while (run) {
            System.out.println("\n*****Welcome to expense tracker*****");
            System.out.println("1. Add expense");
            System.out.println("2. View expense");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Exit");
            System.out.println("Choose and option: ");
            int newChoice = scan.nextInt();
            scan.nextLine();

            switch (newChoice) {
                case 1:
                System.out.println("Enter despriction for expense: ");
                String description = scan.nextLine(); 
                System.out.println("Enter expense for amount: ");
                Double amount = scan.nextDouble();
                descriptionsFor.add(description);
                amounts.add(amount);
                System.out.println("Expenses have been added successfully");
                break;

                case 2:
                System.out.println("\n*****Your Total Expenses*****");
                for(int i=0;i<descriptionsFor.size();i++) {
                    System.out.printf("%d. %s - ₹%.2f%n", i + 1, descriptionsFor.get(i), amounts.get(i));
                }
                break;

                case 3:
                double total = 0;
                for (double a : amounts) {
                    total += a;
                }
                System.out.printf("\nTotal Expenses: ₹%.2f%n", total);
                break;


                case 4:
                run = false;
                System.out.println("Exiting the system.. Goodbye!");
                break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    scan.close();
    }
}