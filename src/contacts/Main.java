package contacts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static boolean start = true;
    static ArrayList<String> contacts = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static String firstName;
    static String surname;
    static String number;
    static String newNumber;
    static String newSurname;
    static String newFirstName;
    static int toDelete;
    static String toEdit;
    static String fieldToEdit = null;

    public static void main(String[] args) {
        String action = null;

        while (start) {
            System.out.print("Enter action (add, remove, edit, count, list, exit): ");
            action = input.nextLine();

            switch (action) {

                case "add":
                    addContact();
                    break;
                case "remove":
                    deleteContact();
                    break;
                case "edit":
                    editContact();
                    break;
                case "count":
                    countContact();
                    break;
                case "list":
                    getList();
                    break;
                case "exit":
                    exitProgram();
                    break;
            }
        }
        System.out.print("Program is off");
    }

    private static void exitProgram() {
        start = false;
    }

    private static void getList() {
        if (contacts.isEmpty()) {
            System.out.println("the list of contacts is empty!");
        }
        int count = 1;
        for (String contact : contacts) {
            System.out.println(count + ". " + contact);
            count++;
        }
    }

    private static void countContact() {
        System.out.println("The Phone Book has " + contacts.size() + " records.");
    }

    public static void editName(int record) {
        System.out.print("Enter name: ");
        newFirstName = input.nextLine();
        String[] entry = contacts.get(record).split(" ");
        contacts.remove(record);
        contacts.add(record, newFirstName + " " + entry[1] + " " + entry[2]);
    }

    public static void editSurname(int record) {
        System.out.print("Enter surname: ");
        newSurname = input.nextLine();
        String[] entry = contacts.get(record).split(" ");
        contacts.remove(record);
        contacts.add(record, entry[0] + " " + newSurname + ", " + entry[2]);
    }

    public static void editNumber(int record) {
        System.out.print("Enter number: ");
        newNumber = input.nextLine();
        String[] entry = contacts.get(record).split(" ");
        contacts.remove(record);
        contacts.add(record, entry[0] + " " + entry[1] + " " + newNumber);
    }

    private static void editContact() {
        if (contacts.isEmpty()) {
            System.out.println("No records to edit!");
        } else {
            getList();

            System.out.print("Select a record: ");
            toEdit = input.nextLine();
            int parseInt = Integer.parseInt(toEdit);
            --parseInt;

            System.out.print("Select a field (name, surname, number): ");
            fieldToEdit = input.nextLine();

            while (fieldToEdit != null) {
                switch (fieldToEdit) {
                    case "name":
                        editName(parseInt);
                        fieldToEdit = null;
                        break;
                    case "surname":
                        editSurname(parseInt);
                        fieldToEdit = null;
                        break;
                    case "number":
                        editNumber(parseInt);
                        fieldToEdit = null;
                        break;
                }
            }
            System.out.println("The record updated!");
        }
    }

    private static void deleteContact() {
        if (!contacts.isEmpty()) {
            getList();
            System.out.print("Select a record: ");
            toDelete = input.nextInt();
            --toDelete;
            contacts.remove(toDelete);
            System.out.println("The record removed!");
        } else {
            System.out.println("No records to remove!");
        }
    }

    public static String getNumber() {
        return number;
    }

    public static void setNumber(String number) {
        Pattern pattern = Pattern.compile("([(]?[+]?\\w+[)]?)[\\s-}]([(]?\\w+[)]?)[\\s-]((\\w+)[\\s-])+");
        Matcher matcher = pattern.matcher(number);

        while (matcher.find() || matcher.find() == false) {
            if (matcher.find()) {
                Main.number = number;
            } else {
                Main.number = "[no number]";
                break;
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter the name: ");
        firstName = input.nextLine();

        System.out.print("Enter the surname: ");
        surname = input.nextLine();

        System.out.print("Enter the phoneNumber: ");
//        phoneNumber = input.nextLine();
        setNumber(input.nextLine());
        getNumber();
        System.out.println(number);

        addToList(firstName, surname, getNumber());
    }

    private static void addToList(String firstName, String surname, String phoneNumber) {
        contacts.add(firstName + " " + surname + ", " + phoneNumber);
        System.out.println("The record added.");
    }

}
