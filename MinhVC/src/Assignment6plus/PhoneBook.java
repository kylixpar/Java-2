package Assignment6plus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
	ArrayList<Database> phoneList;
	
	public PhoneBook(ArrayList<Database> phoneList) {
		this.phoneList = phoneList;
	}
	public void insertPhone(String name, String phone) {
		if (phoneList.isEmpty()) {
			phoneList.add(new Database(name,phone));
		}
		else {
			for (int i = 0; i< phoneList.size();) {
				if (phoneList.get(i).name.equals(name) && phoneList.get(i).phone.equals(phone)){
					
					System.out.println("Name and phonenumber already exist.");
				}
					else {
					phoneList.add(new Database(name,phone));
					}
					break;
				}
				
			}
		}
	@Override
	 void removePhone(String name) {
		for (int i = 0; i < phoneList.size(); i++) {
			if (name.equals(phoneList.get(i).name)) {
				phoneList.remove(phoneList.get(i));
				System.out.println("Removed" +name);
			}
		}
	}
	@Override
	void updatePhone(String name, String newPhone) {
		for(int i= 0; i<phoneList.size(); i++) {
			if(name.equals(phoneList.get(i).name)) {
				phoneList.get(i).phone = newPhone;
				System.out.println("Updated!");
			}
		}
		insertPhone(name, newPhone);
	}
	@Override
	 void searchPhone(String name) {
		for (int i = 0; i< phoneList.size(); i++) {
			if (name.equals(phoneList.get(i).name)) {
				System.out.println(phoneList.get(i).phone);
			}
		}
	}
	@Override
	public void sort() {
        ArrayList<Database> database = new ArrayList<>();
        phoneList.stream().sorted(new Comparator<Database>() {
        	public int compare(Database d1, Database d2) {
        		return d1.name.compareTo(d2.name);
        	}
        }).forEach(x->{
        	database.add(x);
        });
        phoneList = database;
    }
	
	public void getData(){
		for (int i = 0; i < phoneList.size(); i++) {
			System.out.println(phoneList.get(i).name);
			System.out.println(phoneList.get(i).phone);
		}
	}
}
