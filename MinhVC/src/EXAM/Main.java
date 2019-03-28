package EXAM;


import java.util.Scanner;

public class Main {
    static ManagementSystem managementSystem = new ManagementSystem();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("Airline Reservation System");
        System.out.println("1. Add reservation");
        System.out.println("2. Modify passenger");
        System.out.println("3. Display passenger");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                managementSystem.add(input());
                showMenu();
                break;
            case "2":
                managementSystem.update();
                showMenu();
                break;
            case "3":
                managementSystem.display();
                showMenu();
                break;
            case "4":
                return;
            default:
                System.out.println("Wrong option:");
                showMenu();
                break;
        }
    }
    public static Reservation  input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ReservationID: ");
        int id = scanner.nextInt();
        System.out.println("PassengerName: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Address ");
        String address = scanner.nextLine();
        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        System.out.println("Date departure: ");
        String date_departure = scanner.nextLine();
        System.out.println("Date return: ");
        String date_return = scanner.nextLine();
        return new Reservation(id, name, address, phone, date_departure, date_return);
    }
}