package toDoTaskManager;

import java.util.ArrayList;

public class TaskManager {
	ArrayList<String> tasks = new ArrayList<>();
	//Boolean completed = false;
	
	public void addTask(String task) {
		tasks.add(task);
		System.out.println("Added task: "+task);
	}
	
	public void deleteTask(int i) {
		if(tasks.size() < i) {
			System.out.println("Task doesnot exists.");
			return;
		}
		if(i <= 0) {
			System.out.println("Invalid Index.");
			return;
		}
		String task = tasks.remove(i-1);
		System.out.println("Removed "+task);
	}
	
	public void completeTask(int i) {
		if(tasks.size() < i) {
			System.out.println("Task doesnot exists.");
			return;
		}
		if(i <= 0) {
			System.out.println("Invalid Index.");
			return;
		}
		String task = tasks.remove(i-1);
		System.out.println(task+" completed.");
	}
	
	public void showTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No Task Exist.");
			return;
		}
		System.out.println("All Tasks are: ");
		for(int i=0; i<tasks.size(); i++) {
			System.out.println((i+1)+". "+tasks.get(i));
		}
	}
}
