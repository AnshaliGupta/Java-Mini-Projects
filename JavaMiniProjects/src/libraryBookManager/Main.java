package libraryBookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void addBooks(int n, ArrayList<Book> books) {
		if(n == 0) {
			return;
		}
		for(int i=1; i<=n; i++) {
			System.out.println("Enter Id of book "+i+": ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter title of book "+i+": ");
			String title = sc.nextLine();
			Book b = new Book(id, title);
			books.add(b);
		}
		System.out.println("Books are added to the library successfully.");
	}
	
	public static void searchBook(ArrayList<Book> books) {
		sc.nextLine();
		System.out.println("Enter Title of Book: ");
		String toSearch = sc.nextLine();
		int count = 0;
		for(int i=0; i<books.size(); i++) {
			if(books.get(i).title.equals(toSearch)) {
				System.out.println("Book found. Id: "+books.get(i).id+" Title: "+books.get(i).title+" Issue Status: "+books.get(i).isIssued);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Book not found.");
		}
	}
	
	public static void displayBooks(ArrayList<Book> books) {
		if(books.isEmpty()) {
			System.out.println("No Books are stored in the library yet.");
			return;
		}
		System.out.println("Books in the library: ");
		for(Book b : books) {
			System.out.println("Id: "+b.id+", Title: "+b.title+", Issue Status: "+b.isIssued);
		}
	}
	
	public static void issueBooks(int n, ArrayList<Book> books) {
		System.out.println("Enter the book's Id to be issued: ");
		for(int i=1; i<=n; i++) {
			System.out.println("Enter id for book "+i+": ");
			int id = sc.nextInt();
			boolean isAvailable = false;
			for(Book b : books) {
				if(id == b.id) {
					b.isIssued = true;
					isAvailable = true;
					break;
				}
			}
			if(!isAvailable) {
				System.out.println("Book is not in the library.");
			} else {
				System.out.println("Book successfully issued.");
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		System.out.println("-------------Library Management System------------");
		int choice;
		
		do {
			System.out.println("\n1. Add new Books.");
			System.out.println("2. Search a Book");
			System.out.println("3. Display all stored Books.");
			System.out.println("4. Issue Books");
			System.out.println("5. Exit System.");
			System.out.println("Enter your choice: ");
			
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter number of books to add: ");
				int a = sc.nextInt();
				addBooks(a, books);
				break;
			
			case 2:
				searchBook(books);
				break;
			
			case 3:
				displayBooks(books);
				break;
			
			case 4:
				System.out.println("Enter number of books to issue: ");
				int i = sc.nextInt();
				issueBooks(i, books);
				break;
			
			case 5:
				System.out.println("------------Exiting System------------");
				break;
			
			default:
				System.out.println("Invalid choice.");	
			}
		} while(choice != 5);
		
		sc.close();
	}
}
