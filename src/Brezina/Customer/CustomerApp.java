package Brezina.Customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {

        Scanner nSA = new Scanner(System.in);

        System.out.println("Welcome to the Customer Viewer\n");

        boolean repeat = true;

        while (repeat) {
            System.out.println("Enter a customer number: ");

            int customerNumber = nSA.nextInt();

            String info;

            if (customerNumber > 1000 && customerNumber < 1004) {

                Customer hR = CustomerDB.getCustomer(customerNumber);
                info = hR.getNameAndAddress();

            }

            else {
                info = "There is no customer number " + customerNumber + " in our records";

            }

            System.out.println(info);

            String response = "";

            while (!(response.equals("y") || response.equals("n"))) {

                System.out.println("Display another customer? (y/n): ");
                response = nSA.next();

                if (response.equals("n")) {
                    repeat = false;

                }

            }

        }

        System.out.println("Buh-bye");

    }
}
