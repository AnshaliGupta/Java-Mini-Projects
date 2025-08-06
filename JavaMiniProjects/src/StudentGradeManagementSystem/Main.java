package StudentGradeManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ms = new Scanner(System.in);
		ArrayList<Student> als = new ArrayList<>();
		int choice;
		System.out.println("Student Grade Management System");
		
		do {
			System.out.println("\n1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Exit");
			System.out.println("Enter choice: ");
			choice = ms.nextInt();
			switch(choice) {
			
			case 1: 
				Student s = new Student();
				System.out.println("Enter RollNo.:- ");
				s.rollNo = ms.nextInt();
				ms.nextLine();
				System.out.println("Enter Name:- ");
				s.name = ms.nextLine();
				System.out.println("Enter marks of 5 subjects - Java, DSA, DBMS, OS, CN respectively:-");
				for(int i=0; i<5; i++) {
					s.marks[i] = ms.nextDouble();
				}
				als.add(s);
				break;
			
			case 2:
				if(als.size() == 0) {
					System.out.println("No Student Record.");
				} else {
					for(Student i : als) {
						System.out.println("\nStudent Info:-");
						i.displayData();
					}
				}
				break;
			
			case 3: 
				System.out.println("Exiting Management System.");
				break;
			
			default: 
				System.out.println("Invalid choice.");
			}
		} while(choice != 3);
		
		ms.close();
	}
}
