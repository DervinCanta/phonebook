package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Phonebook Application");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email address: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phoneNumber, email);
                    phonebook.addContact(contact);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();

                    Contact foundContact = phonebook.searchContact(searchName);
                    if (foundContact != null) {
                        System.out.println("Contact found:");
                        System.out.println(foundContact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();

                    Contact deleteContact = phonebook.searchContact(deleteName);
                    if (deleteContact != null) {
                        phonebook.removeContact(deleteContact);
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Phonebook Application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        }
    }
}
