package week4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MenuAppWithList {
	
	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	private static String name;
	private static Object addNew;          
	
	public static void main(String[] args) {
		
		
		int choice = 0;
		
		while (choice != -1) {
			
			showMenu();
			
			choice = getUserChoice();
			
			if (choice == 1) {
				printStudentNames();			
		} else if (choice == 2) {
		addNewStudents();
		} else if (choice ==3) {
			deleteStudent();
		} else if (choice == 4) {
			System.out.println("Goodbye!");
		} else {
			System.out.println("Please select a valid option!");

		}
			
		}
		
	}	
		
			
	
	
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Postion ");
		System.out.println("4) Exit");
		System.out.println("----------------");
		
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudents() {
		System.out.print("Enter the name you would like to add: ");
		students.add(scanner.next());
		
		students.add(name);
		System.out.println("Student added: " + name);
		
}
	
	public static void deleteStudent() {
		System.out.print("Enter the index of the student you wish to delete: ");
		int index = getUserChoice();
		if (index < students.size()) {
			students.remove(index);
		}
		
	}
	
	

}
