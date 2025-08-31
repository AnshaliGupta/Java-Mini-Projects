package toDoTaskManager;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaskManager tm = new TaskManager();
		System.out.println("-----------Welcome to Task Management System------------");
		int choice;
		
		do {
			System.out.println("\n1. Add a task.");
			System.out.println("2. Delete a task.");
			System.out.println("3. Complete a task.");
			System.out.println("4. Show all tasks.");
			System.out.println("5. Exit from System.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				sc.nextLine();
				System.out.println("Enter the task: ");
				String task = sc.nextLine();
				tm.addTask(task);
				break;
			
			case 2:
				System.out.println("Enter the index of task to delete: ");
				int i = sc.nextInt();
				tm.deleteTask(i);
				break;
			
			case 3:
				System.out.println("Enter index of task that is completed: ");
				int in = sc.nextInt();
				tm.completeTask(in);
				break;
			
			case 4:
				tm.showTasks();
				break;
			
			case 5:
				System.out.println("\n-------------Exiting from the System.----------");
				break;
			
			default:
				System.out.println("Invalid Choice.");
			}
		} while(choice != 5);
		
		sc.close();
	}
}
