package libraryBookManager;

public class Book {
	int id;
	String title;
	boolean isIssued;
	
	Book(int id, String title) {
		this.title = title;
		this.id = id;
		isIssued = false;
	}
}
