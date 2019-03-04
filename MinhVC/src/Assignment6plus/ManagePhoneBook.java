package Assignment6plus;
import java.util.Scanner;
import java.util.ArrayList;

public class ManagePhoneBook {
	
	public static void main(String[] args) {
		boolean value = true;
		ArrayList<Database> database = new ArrayList<>();
		PhoneBook phonebook = new PhoneBook(database);
		Scanner scanner = new Scanner(System.in);
		Task();
		Scanner scanner1 = new Scanner(System.in);
		int choose;
		while (value) {
			choose = scanner.nextInt();
			switch(choose) {
				case 1: {
				System.out.println("Enter name: ");
				String name = scanner1.nextLine();
				System.out.println("Enter phonenumber: ");
				String phone1 = scanner1.nextLine();
				phonebook.insertPhone(name, phone1);
				Task();
				break;
				}
				case 2: {
				System.out.println("Enter the name you want to delete: ");
				String name = scanner1.nextLine();
				phonebook.removePhone(name);
				Task();
				break;
				}
				case 3: {
				System.out.println("Enter the name you want to update: ");
				String name = scanner1.nextLine();
				String phone1 = scanner1.nextLine();
				phonebook.updatePhone(name, phone1);
				Task();
				break;
				}
				case 4: {
				System.out.println("Enter the name you want to search: ");
				String name = scanner1.nextLine();
				phonebook.searchPhone(name);
				Task();
				break;
				}
				case 5: {
				System.out.println("Phone List sorted. ");
				phonebook.sort();
				Task();
				break;
				}
				case 6: {
					System.out.println("Show phone list.");
					phonebook.getData();
					Task();
					break;
				}
				case 7: {
				value = false;
				}
			}
		}
	}
	private static void Task() {
		System.out.println("Choose: ");
		System.out.println("1. Insert Phone");
		System.out.println("2. Remove Phone");
		System.out.println("3. Update Phone");
		System.out.println("4. Search Phone");
		System.out.println("5. Sort");
		System.out.println("6. Phone List");
		System.out.println("7. Exit");
		
	}
}
